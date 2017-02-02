/**
 * 
 */
package io.hibernate.avinash.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Avinash
 *
 */
@Entity
@Table(name = "COLLEGE")
public class College {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "COLLEGE_ID")
	private Integer collegeId;
	private String name;
	private String board;
	//@ElementCollection(targetClass=Student.class)
	@OneToMany(fetch =FetchType.EAGER, cascade = CascadeType.ALL)
	//@JoinTable(name ="COLLEGE_STUDENTS")
	//@JoinColumn(name ="COLLEGE_ID")
	List<Student> students = new ArrayList<>();
	
	
	
	/**
	 * 
	 */
	public College() {
		super();
	}

	
	
	/**
	 * @param collegeId
	 * @param name
	 * @param board
	 * @param students
	 */
	public College(Integer collegeId, String name, String board, List<Student> students) {
		super();
		this.collegeId = collegeId;
		this.name = name;
		this.board = board;
		this.students = students;
	}

	


	/**
	 * @return the collegeId
	 */
	public Integer getCollegeId() {
		return collegeId;
	}



	/**
	 * @param collegeId the collegeId to set
	 */
	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the board
	 */
	public String getBoard() {
		return board;
	}
	/**
	 * @param board the board to set
	 */
	public void setBoard(String board) {
		this.board = board;
	}
	/**
	 * @return the students
	 */
	public List<Student> getStudents() {
		return students;
	}
	/**
	 * @param students the students to set
	 */
	public void setStudents(List<Student> students) {
		this.students = students;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("College [collegeId=").append(collegeId).append(", name=").append(name).append(", board=")
				.append(board).append(", students=").append(students).append("]");
		return builder.toString();
	}
	
	

	
	
	
	
}
