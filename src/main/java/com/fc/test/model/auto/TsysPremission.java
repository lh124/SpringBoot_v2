package com.fc.test.model.auto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TsysPremission {
    private String id;

    private String name;

    private String descripion;

    private String url;

    private String pid;

    private String perms;

    private Integer type;

    private String icon;

    private Integer orderNum;



	public TsysPremission(String id, String name, String descripion,
			String url, String pid, String perms, Integer type, String icon,
			Integer orderNum) {
		super();
		this.id = id;
		this.name = name;
		this.descripion = descripion;
		this.url = url;
		this.pid = pid;
		this.perms = perms;
		this.type = type;
		this.icon = icon;
		this.orderNum = orderNum;
	}

	public TsysPremission() {
		super();
	}
    
    
}