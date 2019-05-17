package com.fc.test.model.auto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Setter
@Getter
public class TSysRoleUser implements Serializable {
    private String id;

    private String sysUserId;

    private String sysRoleId;

    private static final long serialVersionUID = 1L;

	public TSysRoleUser() {
		super();
	}

	public TSysRoleUser(String id, String sysUserId, String sysRoleId) {
		super();
		this.id = id;
		this.sysUserId = sysUserId;
		this.sysRoleId = sysRoleId;
	}
    
    
}