package com.fc.test.model.auto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TsysFile {
    private String id;

    private String fileName;

    private String createUserId;

    private String createUserName;

    private Date createTime;

    private String updateUserId;

    private String updateUserName;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date updateTime;

}