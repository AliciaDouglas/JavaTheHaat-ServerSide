package com.revature.JavaTheHaatServerSide.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<List<Posts>> getAllPosts(){
		System.out.println("getAllPosts -GET");
		List<Posts> posts = postService.getAllPosts();
		return new ResponseEntity<> (posts, HttpStatus.OK);
	}
	
	/**
	 * Create a new post
	 * @param post
	 * @return
	 */
	@PostMapping("/posts")
	public ResponseEntity<Posts> newPost(@RequestBody Posts post) {
		System.out.println("newPost -POST");
		System.out.println(post);
		post = postService.newPost(post);
		return new ResponseEntity<> (post, HttpStatus.CREATED);
	}
	
	/**
	 * Updates a post with post object passed in
	 * @param post
	 * @return
	 */
	@PutMapping("/posts")
	public ResponseEntity<Posts> updatePost(@RequestBody Posts post) {
		System.out.println("/posts - PUT");
		return new ResponseEntity<> (postService.updatePost(post), HttpStatus.OK);
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
	public ResponseEntity<List<Posts>> getPostsById(@PathVariable int id){
		System.out.println("/posts/" + id + " - GET");
		List<Posts> posts = postService.getPostsById(id);
		return new ResponseEntity<> (posts, HttpStatus.OK);
	}
	
	/**
	 * Get posts by category id
	 * @param id
	 * @return
	 */
	@GetMapping("/posts/category/{id}")
	public ResponseEntity<List<Posts>> getPostByCategoryId(@PathVariable int id){
		System.out.println("/posts/category/" + id + " - GET");
		return new ResponseEntity<> (postService.getPostByCatgoryId(id), HttpStatus.OK);
	}
	
}
