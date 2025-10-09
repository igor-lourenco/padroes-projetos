package com.categoria.comportamentais._1_observer._2_depois.job;

import com.categoria.comportamentais._1_observer._2_depois.model.Lancamento;
import com.categoria.comportamentais._1_observer._2_depois.notificador.Notificador;
import com.categoria.comportamentais._1_observer._2_depois.repository.Lancamentos;
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
        Notificador notificador = (Notificador) jobDataMap.get("notificador");

        List<Lancamento> lancamentosVencidos = lancamentos.todosVencidos();
        notificador.novosLancamentosVencidos(lancamentosVencidos);

    }
}
