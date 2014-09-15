package com.ilia;

public class Inheritance {
	private String name;
	private String adress;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String toString() {
	    final StringBuilder stringBuilder = new StringBuilder();
	    stringBuilder.append("Bean");
	    stringBuilder.append("{name='").append(name).append('\'');
	    stringBuilder.append(", address=").append(adress);
	     
	    stringBuilder.append('}');
	    return stringBuilder.toString();
	}
}
