package test09;

import java.util.ArrayList;
import java.util.List;

public class Board {
	private List<Article> articles;
	private List<User> users;
	
	
	public Board() {
		articles = new ArrayList<Article>();
		users= new ArrayList<User>();
	}


	public List<Article> getArticles() {
		return articles;
	}


	public List<User> getUsers() {
		return users;
	}

	
	public void addUser(User user) {
		users.add(user);
	}
	
	public void addArticle(Article article) {
		articles.add(article);
	}
}
