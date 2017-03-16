/**
 * Post Entity class
 */
package org.avinash.demo.MessangerDemo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Avinash
 *
 */
@XmlRootElement
@Entity
@Table(name = "POST")
public class PostEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long postId;
	private String postName;
	private String firstName;
	private String lastName;
	private Date created;
	@OneToMany(cascade = CascadeType.ALL,mappedBy="post")
	private List<CommentEntity> comments = new ArrayList<>();
	
	
	
	/**
	 * 
	 */
	public PostEntity() {
		super();
	}
	
	/**
	 * @param postId
	 * @param postName
	 * @param firstName
	 * @param lastName
	 * @param created
	 * @param messages
	 */
	public PostEntity(long postId, String postName, String firstName, String lastName, Date created,
			List<CommentEntity> comments) {
		super();
		this.postId = postId;
		this.postName = postName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.created = created;
		this.comments = comments;
	}

	/**
	 * @return the postId
	 */
	public long getPostId() {
		return postId;
	}

	/**
	 * @param postId the postId to set
	 */
	public void setPostId(long postId) {
		this.postId = postId;
	}

	/**
	 * @return the postName
	 */
	public String getPostName() {
		return postName;
	}
	/**
	 * @param postName the postName to set
	 */
	public void setPostName(String postName) {
		this.postName = postName;
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
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the created
	 */
	public Date getCreated() {
		return created;
	}
	/**
	 * @param created the created to set
	 */
	public void setCreated(Date created) {
		this.created = created;
	}


	/**
	 * @return the comments
	 */
	public List<CommentEntity> getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(List<CommentEntity> comments) {
		this.comments = comments;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PostEntity [postId=").append(postId).append(", postName=").append(postName)
				.append(", firstName=").append(firstName).append(", lastName=").append(lastName).append(", created=")
				.append(created).append(", comments=").append(comments).append("]");
		return builder.toString();
	}
	
	
	
	
}
