package com.egiants.syed.app.job;

import com.egiants.syed.app.entity.Info;
import org.springframework.stereotype.Component;

@Component
public class Job1 extends AbstractJob<Info> {
    @Override
    protected String doing() {
        return "info";
    }
}
