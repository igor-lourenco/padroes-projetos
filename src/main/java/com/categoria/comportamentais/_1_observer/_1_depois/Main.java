package com.categoria.comportamentais._1_observer._1_depois;

import com.categoria.comportamentais._1_observer._1_depois.job.LancamentosVencidosJob;
import com.categoria.comportamentais._1_observer._1_depois.notificador.LancamentosVencidosNotificador;
import com.categoria.comportamentais._1_observer._1_depois.notificador.Notificador;
import com.categoria.comportamentais._1_observer._1_depois.ouvintes.EmailOuvinte;
import com.categoria.comportamentais._1_observer._1_depois.ouvintes.SMSOuvinte;
import com.categoria.comportamentais._1_observer._1_depois.repository.Lancamentos;
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
        Notificador notificador = new LancamentosVencidosNotificador();

        new EmailOuvinte(notificador); // ouvinte se registra no LancamentosVencidosNotificador pelo construtor
        new SMSOuvinte(notificador);  // ouvinte se registra no LancamentosVencidosNotificador pelo construtor

        Lancamentos lancamentos = new Lancamentos();
        JobDataMap jobDataMap = new JobDataMap();

        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

        jobDataMap.put("lancamentos", lancamentos);
        jobDataMap.put("notificador", notificador);

        JobDetail job = newJob(LancamentosVencidosJob.class)
            .setJobData(jobDataMap)
            .withIdentity("lancamentosVencidosJob", "lancamentosVencidosGroup")
            .build();

        CronTrigger trigger = newTrigger()
            .withIdentity("trigger1", "group1")
            .withSchedule(cronSchedule("0/10 * * * * ?")) // 10 segundos
            .build();

        scheduler.scheduleJob(job, trigger);

        scheduler.start();

        Thread.sleep(220000);

        scheduler.shutdown(true);

    }


}
