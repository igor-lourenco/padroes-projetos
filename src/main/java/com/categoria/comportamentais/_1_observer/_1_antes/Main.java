package com.categoria.comportamentais._1_observer._1_antes;

import com.categoria.comportamentais._1_observer._1_antes.job.LancamentosVencidosJob;
import com.categoria.comportamentais._1_observer._1_antes.repository.Lancamentos;
import com.categoria.comportamentais._1_observer._1_antes.senders.EnviadorEmail;
import com.categoria.comportamentais._1_observer._1_antes.senders.EnviadorSMS;
import org.quartz.CronTrigger;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

public class Main {

    public static void main(String[] args) throws Exception {
        EnviadorEmail enviadorEmail = new EnviadorEmail();
        EnviadorSMS enviadorSms = new EnviadorSMS();
        Lancamentos lancamentos = new Lancamentos();

        JobDataMap jobDataMap = new JobDataMap();
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

        jobDataMap.put("lancamentos", lancamentos);
        jobDataMap.put("enviadorEmail", enviadorEmail);
        jobDataMap.put("enviadorSms", enviadorSms);

        JobDetail job = newJob(LancamentosVencidosJob.class)
            .setJobData(jobDataMap)
            .withIdentity("lancamentosVencidosJob", "lancamentosVencidosGroup")
            .build();

        CronTrigger trigger = newTrigger()
            .withIdentity("trigger1", "group1")
//            .withSchedule(cronSchedule("0 * * * * ?"))
            .withSchedule(cronSchedule("0/10 * * * * ?")) // 10 segundos
            .build();

        scheduler.scheduleJob(job, trigger);

        scheduler.start();

        Thread.sleep(220000);

        scheduler.shutdown(true);

    }


}
