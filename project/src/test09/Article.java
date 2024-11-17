package test09;

import java.util.ArrayList;
import java.util.List;

public class Article implements Commentable{
	private int no;
	private String title;
	private String content;
	private User user;
	private List<Comment> comments;
	
	
	public Article(int no, String title, String content, User user) {
		comments = new ArrayList<Comment>();
		this.no = no;
		this.title = title;
		this.content = content;
		this.user = user;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public void addComment(Comment comment) {
		comments.add(comment);
		
	}
	@Override
	public List<Comment> getComments() {
		return comments;
	}
	
	
	
	
	

}
