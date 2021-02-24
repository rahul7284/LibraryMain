package com.test.demo.model;

import java.util.Date;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name="BOOK")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="book_seq")
	@SequenceGenerator(initialValue=1,name="book_seq",sequenceName="book_sequence")
	@Column(name="BOOK_ID")
	private Integer Id;
	
	@Column(name="BOOK_NAME")
	private String bookName;
	
	@Column(name="AUTHOR")
	private String authorName;
	
	@Column(name="BOOK_NO")
	private long bookNumber;
	
	@Column(name="COURSE_NAME")
	private String courseName;
	
	@Temporal(TemporalType.DATE)
	@Column(name="PUBLICATION_DATE")
	private Date publicationDate;
	
	@Column(name="PRICE")
	private long bookPrice;
	
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.PERSIST)
	@JoinColumn(foreignKey=@ForeignKey(name="college_id"),name="college_id")
	private College college;


	public Integer getId() {
		return Id;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public long getBookNumber() {
		return bookNumber;
	}


	public void setBookNumber(long bookNumber) {
		this.bookNumber = bookNumber;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public Date getPublicationDate() {
		return publicationDate;
	}


	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}


	public long getBookPrice() {
		return bookPrice;
	}


	public void setBookPrice(long bookPrice) {
		this.bookPrice = bookPrice;
	}


	public void setId(Integer id) {
		Id = id;
	}


	

	public College getCollege() {
		return college;
	}


	public void setCollege(College college) {
		this.college = college;
	}



	
	}