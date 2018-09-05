package com.revature.JavaTheHaatServerSide.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.JavaTheHaatServerSide.beans.Posts;
import com.revature.JavaTheHaatServerSide.repository.PostsRepo;

@Service
public class PostsService {
	
	@Autowired
	PostsRepo postsRepo;

	/**
	 * Gets all posts from the DAO
	 * @return
	 */
	public List<Posts> getAllPosts() {
		System.out.println("posts service -getAllPosts");
		return (List<Posts>) postsRepo.findAll();
	}

	/**
	 * Create a new post
	 * Take post object and send to DAO
	 * @param post
	 * @return
	 */
	public Posts newPost(Posts post) {
		System.out.println("posts service -newPost");
		post.setTimeSubmission(new Date());
		return postsRepo.save(post);
	}

}
