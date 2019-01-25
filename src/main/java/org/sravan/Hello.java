package org.sravan;

import java.io.Serializable;

public class Hello implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	private String formattedName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFormattedName() {
		return formattedName;
	}

	public void setFormattedName(String formattedName) {
		this.formattedName = formattedName;
	}

	@Override
	public String toString() {
		return "{name:" + name + ", formattedName: " + formattedName + "}";
	}
}
