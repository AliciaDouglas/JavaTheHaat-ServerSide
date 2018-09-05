package com.revature.JavaTheHaatServerSide.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.JavaTheHaatServerSide.beans.Posts;

@RestController
public class PostsCtrl {

//	@Autowired
//	PostsService postService;
	
	/**
	 * Get all posts
	 * @return
	 */
	@GetMapping("/posts")
	public String getAllPosts(){
		System.out.println("getAllPosts -GET");
//		return postService.getAllPosts();
		return "posts -GET";
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
