package com.bmpl.projectA.users.posts;

import java.util.Date;

public class UserPosts {

	private String post;
	private int likes;
	private int comments;
	private String comment_value;
	private Date post_date;
	
	public UserPosts(){
		likes=0;
		comments=0;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getComments() {
		return comments;
	}
	public void setComments(int comments) {
		this.comments = comments;
	}
	public String getComment_value() {
		return comment_value;
	}
	public void setComment_value(String comment_value) {
		this.comment_value = comment_value;
	}
	public Date getPost_date() {
		return post_date;
	}

	public void setPost_date(Date post_date) {
		this.post_date = post_date;
	}
	
	
	
}
