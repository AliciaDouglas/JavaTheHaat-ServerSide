package com.revature.JavaTheHaatServerSide.service;

import java.util.ArrayList;
import java.util.List;

import com.revature.JavaTheHaatServerSide.beans.Posts;

public class PostsService {

	/**
	 * Gets all posts from the DAO
	 * @return
	 */
	public List<Posts> getAllPosts() {
		List<Posts> posts = new ArrayList<>();
		posts.add(new Posts(1, 1, "IT WORKS", "YAY", null, null, 1));
		return posts;
	}

	/**
	 * Create a new post
	 * Take post object and send to DAO
	 * @param post
	 * @return
	 */
	public Posts newPost(Posts post) {
		// TODO Auto-generated method stub
		return null;
	}

}
