package com.blueice.springscheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/4/5.
 */
@Service
public class TaskScheduledService {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)  //代表每隔一段时间执行一次。
    public void reportCurrentTime(){
        System.out.println("每隔5秒执行一次"+ dateFormat.format(new Date()));
    }

//    @Scheduled(cron = "0 0 14 * * ? ") //代表定时执行,每天的15点30分
//    public void fixTimeExecution(){
//        System.out.println("在指定时间执行。"+dateFormat.format(new Date()));
//    }

}
