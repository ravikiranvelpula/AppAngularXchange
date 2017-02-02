/**
 * 
 */
package io.demo;

/**
 * @author Avinash
 *
 */
public class Student {

	private Integer rollId;
	private String firstName;
	private String secondName;
	
	
	/**
	 * @param i
	 * @param firstName
	 * @param secondName
	 */
	public Student(Integer rollId, String firstName, String secondName) {
		super();
		this.rollId = rollId;
		this.firstName = firstName;
		this.secondName = secondName;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [rollId=").append(rollId).append(", firstName=").append(firstName)
				.append(", secondName=").append(secondName).append("]");
		return builder.toString();
	}

	
	
	
	
}
