package com.revature.JavaTheHaatServerSide.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public Posts newPost(@RequestBody Posts post) {
		System.out.println("newPost -POST");
		System.out.println(post);
		post = postService.newPost(post);
		return post;
	}
	
	/**
	 * Updates a post with post object passed in
	 * @param post
	 * @return
	 */
	@PutMapping("/posts")
	public Posts updatePost(@RequestBody Posts post) {
		System.out.println("/posts - PUT");
		return postService.updatePost(post);
	}
	
	/**
	 * Deletes the given post
	 * @param post
	 * @return
	 */
	@DeleteMapping("/posts")
	public void deletePost(@RequestBody Posts post) {
		System.out.println("/posts - DELETE");
		postService.deletePost(post);
	}
	
	
	/**
	 * Get a users posts by id
	 * @param id
	 * @return
	 */
	@GetMapping("/posts/{id}")
	public List<Posts> getPostsById(@PathVariable int id){
		System.out.println("/posts/" + id + " - GET");
		List<Posts> posts = postService.getPostsById(id);
		return posts;
	}
	
	/**
	 * Get posts by category id
	 * @param id
	 * @return
	 */
	@GetMapping("/posts/category/{id}")
	public List<Posts> getPostByCategoryId(@PathVariable int id){
		System.out.println("/posts/category/" + id + " - GET");
		return postService.getPostByCatgoryId(id);
	}
	
}
