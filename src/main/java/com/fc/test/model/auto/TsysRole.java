package com.fc.test.model.auto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Setter
@Getter
public class TsysRole implements Serializable {
    private String id;

    private String name;

    private static final long serialVersionUID = 1L;



	public TsysRole(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public TsysRole() {
		super();
	}
    
}