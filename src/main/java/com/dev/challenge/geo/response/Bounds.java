package com.dev.challenge.geo.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * @author tapan
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Bounds {

	private Coordinates northeast;
	private Coordinates southwest;
	/**
	 * @return the northeast
	 */
	public Coordinates getNortheast() {
		return northeast;
	}
	/**
	 * @param northeast the northeast to set
	 */
	public void setNortheast(Coordinates northeast) {
		this.northeast = northeast;
	}
	/**
	 * @return the southwest
	 */
	public Coordinates getSouthwest() {
		return southwest;
	}
	/**
	 * @param southwest the southwest to set
	 */
	public void setSouthwest(Coordinates southwest) {
		this.southwest = southwest;
	}
	  
}
