package com.assertions.example.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comments_info")
public class Comments {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int comment_id;
	@Column(name="comments_given_by")
	private String commented_by;
	
	public int getComment_id() {
		return comment_id;
	}
	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}
	public String getCommented_by() {
		return commented_by;
	}
	public void setCommented_by(String commented_by) {
		this.commented_by = commented_by;
	}
		
	
	
}
