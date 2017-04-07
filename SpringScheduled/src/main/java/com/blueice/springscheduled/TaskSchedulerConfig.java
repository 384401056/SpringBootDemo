package com.blueice.springscheduled;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Administrator on 2017/4/5.
 */
@Configuration
@ComponentScan("com.blueice.springscheduled")
@EnableScheduling //开启计划任务的支持.
public class TaskSchedulerConfig {
}
