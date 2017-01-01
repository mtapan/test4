package com.dev.challenge.geo.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * @author tapan
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Geometry {

	@JsonIgnore
	private Bounds bounds;

	@JsonProperty("location")
	private Coordinates location;

	@JsonIgnore
	private String[] locationType;

	@JsonIgnore
	private Bounds viewport;

	/**
	 * @return the bounds
	 */
	public Bounds getBounds() {
		return bounds;
	}

	/**
	 * @param bounds the bounds to set
	 */
	public void setBounds(Bounds bounds) {
		this.bounds = bounds;
	}

	/**
	 * @return the location
	 */
	public Coordinates getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Coordinates location) {
		this.location = location;
	}

	/**
	 * @return the locationType
	 */
	public String[] getLocationType() {
		return locationType;
	}

	/**
	 * @param locationType the locationType to set
	 */
	public void setLocationType(String[] locationType) {
		this.locationType = locationType;
	}

	/**
	 * @return the viewport
	 */
	public Bounds getViewport() {
		return viewport;
	}

	/**
	 * @param viewport the viewport to set
	 */
	public void setViewport(Bounds viewport) {
		this.viewport = viewport;
	}
	
}
