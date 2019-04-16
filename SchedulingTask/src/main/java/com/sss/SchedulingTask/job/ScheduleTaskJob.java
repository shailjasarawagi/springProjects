package com.sss.SchedulingTask.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduleTaskJob {
    private static final Logger log = LoggerFactory.getLogger(ScheduleTaskJob.class);

    private static final SimpleDateFormat dateFormat=
            new SimpleDateFormat("HH:mm:ss");

      @Scheduled(cron="0/30 0/1 * 1/1 * ? ")
    //@Scheduled(fixedRate = 5000 )
    public void executeTask(){
          log.info("text");
        System.out.println(String.format("currentTime::" + dateFormat.format(new Date())));
    }
}
