package com.egiants.syed.app.job;

import com.egiants.syed.app.metrics.JobMetrics;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyJob {

    private Integer count1 = 0;

    private Integer count2 = 0;

    @Autowired
    private JobMetrics jobMetrics;

    @Async("main")
    @Scheduled(fixedDelay = 20000)
    public void doSomething() {
        count1++;
        jobMetrics.job1Counter.increment(5D);
        jobMetrics.map.put("x", Double.valueOf(count1));
        System.out.println("task1 count:" + count1);
        log.error("xu error");
    }

    @Async
    @Scheduled(fixedDelay = 20000)
    public void doSomethingOther() {
        count2++;
        jobMetrics.job2Counter.increment();
        System.out.println("task2 count:" + count2);
    }
}
