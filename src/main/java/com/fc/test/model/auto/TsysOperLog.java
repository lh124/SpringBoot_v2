package com.fc.test.model.auto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TsysOperLog {
    private String id;

    private String title;

    private String method;

    private String operName;

    private String operUrl;

    private String operParam;

    private String errorMsg;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="UTC+8")
    private Date operTime;

}