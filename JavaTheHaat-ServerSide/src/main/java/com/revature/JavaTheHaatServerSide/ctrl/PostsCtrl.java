package com.revature.JavaTheHaatServerSide.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.JavaTheHaatServerSide.beans.Posts;
import com.revature.JavaTheHaatServerSide.service.PostsService;

@RestController
public class PostsCtrl {

	@Autowired
	PostsService postService;
	
	/**
	 * Get all posts
	 * @return
	 */
	@GetMapping("/posts")
	public List<Posts> getAllPosts(){
		System.out.println("getAllPosts -GET");
		List<Posts> posts = postService.getAllPosts();
		return posts;
	}
	
	/**
	 * Create a new post
	 * @param post
	 * @return
	 */
	@PostMapping("/posts")
	public String newPost(@RequestBody Posts post) {
		System.out.println("newPost -POST");
//		post = postService.newPost(post);
		return "posts -POST";
	}
	
}
