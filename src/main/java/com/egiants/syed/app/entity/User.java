package com.egiants.syed.app.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Builder
public class User {

    @Id
    public Integer id;

    public String name;

    public String password;

    public String otherInfo;
}
