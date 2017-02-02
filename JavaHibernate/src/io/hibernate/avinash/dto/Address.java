/**
 * 
 */
package io.hibernate.avinash.dto;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Avinash
 *
 */

@Embeddable
public class Address {
	private String pathName;
	String city;
	
	
	
	
	/**
	 * 
	 */
	public Address() {
		super();
	}
	/**
	 * @param pathName
	 * @param city
	 */
	public Address(String pathName, String city) {
		super();
		this.pathName = pathName;
		this.city = city;
	}
	/**
	 * @return the pathName
	 */
	public String getPathName() {
		return pathName;
	}
	/**
	 * @param pathName the pathName to set
	 */
	public void setPathName(String pathName) {
		this.pathName = pathName;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
