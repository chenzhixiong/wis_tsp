package com.gszh.wis.tsp.task;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.quartz.DisallowConcurrentExecution;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试任务类
 * Created by chenzhixiong on 2016/7/25.
 */
@DisallowConcurrentExecution
public class HelloJob implements Job {

    Logger logger= LoggerFactory.getLogger(this.getClass());

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        //测试任务
        this.logger.debug(this.getClass().getName()+" trigger...");


    }


}
