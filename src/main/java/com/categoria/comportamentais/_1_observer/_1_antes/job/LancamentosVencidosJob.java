package com.categoria.comportamentais._1_observer._1_antes.job;

import com.categoria.comportamentais._1_observer._1_antes.model.Lancamento;
import com.categoria.comportamentais._1_observer._1_antes.repository.Lancamentos;
import com.categoria.comportamentais._1_observer._1_antes.senders.EnviadorEmail;
import com.categoria.comportamentais._1_observer._1_antes.senders.EnviadorSMS;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.List;

public class LancamentosVencidosJob implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();

        Lancamentos lancamentos = (Lancamentos) jobDataMap.get("lancamentos");
        List<Lancamento> lancamentosVencidos = lancamentos.todosVencidos();

        EnviadorEmail enviadorEmail = (EnviadorEmail) jobDataMap.get("enviadorEmail");
        EnviadorSMS enviadorSMS = (EnviadorSMS) jobDataMap.get("enviadorSms");

        enviadorEmail.enviar(lancamentosVencidos);
        enviadorSMS.enviar(lancamentosVencidos);
    }
}
