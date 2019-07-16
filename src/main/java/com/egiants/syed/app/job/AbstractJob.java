package com.egiants.syed.app.job;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;

public abstract class AbstractJob<T> {

    @Async("main")
    @Scheduled(fixedDelay = 2000)
    public void doSomething() {
        System.out.println(doing());
    }

    protected abstract String doing();

}
