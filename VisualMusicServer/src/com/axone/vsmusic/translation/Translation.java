package com.axone.vsmusic.translation;

import java.io.Serializable;

public class Translation implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3902035061874772141L;
	protected int type;
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
}
