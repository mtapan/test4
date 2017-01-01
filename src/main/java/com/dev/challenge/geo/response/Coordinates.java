package com.dev.challenge.geo.response;
/**
 * @author tapan
 *
 */
public class Coordinates {
	private double lat;

	private double lng;

	/**
	 * @return the lat
	 */
	public double getLat() {
		return lat;
	}

	/**
	 * @param lat the lat to set
	 */
	public void setLat(double latitude) {
		this.lat = latitude;
	}

	/**
	 * @return the lng
	 */
	public double getLng() {
		return lng;
	}

	/**
	 * @param lng the lng to set
	 */
	public void setLng(double longitude) {
		this.lng = longitude;
	}
	
}
