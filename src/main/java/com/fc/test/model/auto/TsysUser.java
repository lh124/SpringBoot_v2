package com.fc.test.model.auto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Setter
@Getter
public class TsysUser implements Serializable {
    private String id;

    private String username;

    private String password;

    private static final long serialVersionUID = 1L;

}