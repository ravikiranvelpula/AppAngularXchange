/**
 * 
 */
package io.hibernate.avinash.dto;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Avinash
 *
 */
@Entity
@Table(name ="STUDENT")
public class Student {
	@Id
	@Column(name = "ROLL_ID")
	private Integer rollId;
	private String firstName;
	private String secondName;
	@Embedded
	private Address address;
//	@ManyToOne
//	private College college;
	
	
	
	/**
	 * 
	 */
	public Student() {
		super();
	}

	
	/**
	 * @param rollId
	 * @param firstName
	 * @param secondName
	 * @param address
	 */
	public Student(Integer rollId, String firstName, String secondName, Address address) {
		super();
		this.rollId = rollId;
		this.firstName = firstName;
		this.secondName = secondName;
		this.address = address;
	}


	/**
	 * @return the rollId
	 */
	public Integer getRollId() {
		return rollId;
	}

	/**
	 * @param rollId the rollId to set
	 */
	public void setRollId(Integer rollId) {
		this.rollId = rollId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the secondName
	 */
	public String getSecondName() {
		return secondName;
	}
	/**
	 * @param secondName the secondName to set
	 */
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [rollId=").append(rollId).append(", firstName=").append(firstName)
				.append(", secondName=").append(secondName).append(", address=").append(address).append("]");
		return builder.toString();
	}


	
}
