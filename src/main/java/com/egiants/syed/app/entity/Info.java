package com.egiants.syed.app.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Info {

    @Id
    public Integer id;

    public String info;
}
