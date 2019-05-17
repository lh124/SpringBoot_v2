package com.fc.test.model.auto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Setter
@Getter
public class TsysPermissionRole implements Serializable {
    private String id;

    private String roleId;

    private String permissionId;

    private static final long serialVersionUID = 1L;

	public TsysPermissionRole(String id, String roleId, String permissionId) {
		super();
		this.id = id;
		this.roleId = roleId;
		this.permissionId = permissionId;
	}

	public TsysPermissionRole() {
		super();
	}
    
    
}