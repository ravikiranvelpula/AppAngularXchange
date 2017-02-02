package org.avinash.demo.MessangerDemo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;
@XmlRootElement
@Entity
@Table(name = "COMMENT")
public class CommentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long commentId;
	private String commentString;
	private String author;
	private Date creationDate;
	@ManyToOne
	@JsonIgnore
	private PostEntity post;

	
	
	/**
	 * 
	 */
	public CommentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param commentString
	 * @param author
	 */
	public CommentEntity(long id, String commentString, String author, PostEntity post) {
		super();
		this.commentId = id;
		this.commentString = commentString;
		this.author = author;
		this.creationDate = new Date();
		this.post = post;
	}
	
	
	
	/**
	 * @return the post
	 */
	public PostEntity getPost() {
		return post;
	}
	/**
	 * @param post the post to set
	 */
	public void setPost(PostEntity post) {
		this.post = post;
	}
	/**
	 * @return the commentString
	 */
	public String getCommentString() {
		return commentString;
	}
	/**
	 * @param commentString the commentString to set
	 */
	public void setCommentString(String commentString) {
		this.commentString = commentString;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}
	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = new Date();
	}
	
	
	
	
	/**
	 * @return the commentId
	 */
	public long getCommentId() {
		return commentId;
	}
	/**
	 * @param commentId the commentId to set
	 */
	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CommentEntity [commentId=").append(commentId).append(", commentString=").append(commentString)
				.append(", author=").append(author).append(", creationDate=").append(creationDate).append("]");
		return builder.toString();
	}
	
}
