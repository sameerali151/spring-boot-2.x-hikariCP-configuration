package com.egiants.syed.app.job;

import com.egiants.syed.app.entity.User;
import org.springframework.stereotype.Component;

@Component
public class Job2 extends AbstractJob<User> {
    @Override
    protected String doing() {
        return "user";
    }
}
