package com;

public class ProductComment {
	private String commentContent;
	private String userName;
	public ProductComment(String commentContent, String userName) {
		super();
		this.commentContent = commentContent;
		this.userName = userName;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "Product Comment:" + commentContent + ", User Name=" + userName;
	}
	
}
