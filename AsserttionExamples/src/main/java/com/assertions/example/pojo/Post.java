package com.assertions.example.pojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="post_details")
public class Post {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int post_id;
	private String post_type;
	private String time;
	private String day;
	@OneToMany(targetEntity=Comments.class,cascade=CascadeType.ALL)
	@JoinColumn(name="post_id")
	private Set<Comments> commentdetails;
	
	public Set<Comments> getCommentdetails() {
		return commentdetails;
	}
	public void setCommentdetails(Set<Comments> commentdetails) {
		this.commentdetails = commentdetails;
	}
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public String getPost_type() {
		return post_type;
	}
	public void setPost_type(String post_type) {
		this.post_type = post_type;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	
	
	
}
