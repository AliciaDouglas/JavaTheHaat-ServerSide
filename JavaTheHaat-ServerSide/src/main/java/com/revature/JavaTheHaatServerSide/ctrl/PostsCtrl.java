package com.revature.JavaTheHaatServerSide.ctrl;

import java.util.List;

import org.apache.log4j.Logger;
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

	final static Logger logger = Logger.getLogger(PostsCtrl.class);
	
	@Autowired
	PostsService postService;
	
	/**
	 * Get all posts
	 * @return
	 */
	@GetMapping("/posts")
	public ResponseEntity<List<Posts>> getAllPosts(){
		logger.info("/posts -GET  getAllPosts()");
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
		logger.info("/posts -POST  newPost()");
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
		logger.info("/posts - PUT  updatePost()");
		return new ResponseEntity<> (postService.updatePost(post), HttpStatus.OK);
	}
	
	/**
	 * Deletes the given post
	 * @param post
	 * @return
	 */
	@DeleteMapping("/posts")
	public void deletePost(@RequestBody Posts post) {
		logger.info("/posts - DELETE  deletePost()");
		postService.deletePost(post);
	}
	
	
	/**
	 * Get a users posts by id
	 * @param id
	 * @return
	 */
	@GetMapping("/posts/{id}")
	public ResponseEntity<List<Posts>> getPostsById(@PathVariable int id){
		logger.info("/posts/" + id + " - GET  getPostsById()");
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
		logger.info("/posts/category/" + id + " - GET  getPostByCategoryId()");
		return new ResponseEntity<> (postService.getPostByCatgoryId(id), HttpStatus.OK);
	}
	
}
