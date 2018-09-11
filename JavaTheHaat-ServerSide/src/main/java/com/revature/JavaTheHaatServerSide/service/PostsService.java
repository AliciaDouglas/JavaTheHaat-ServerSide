package com.revature.JavaTheHaatServerSide.service;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.JavaTheHaatServerSide.beans.Comments;
import com.revature.JavaTheHaatServerSide.beans.Posts;
import com.revature.JavaTheHaatServerSide.beans.Steps;
import com.revature.JavaTheHaatServerSide.repository.CommentsRepo;
import com.revature.JavaTheHaatServerSide.repository.PostsRepo;
import com.revature.JavaTheHaatServerSide.repository.StepsRepo;

@Service
public class PostsService {
	
	@Autowired
	PostsRepo postsRepo;
	
	@Autowired
	StepsRepo stepsRepo;
	
	@Autowired
	CommentsRepo commentsRepo;

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
		Set<Steps> steps = post.getSteps();
		post.setSteps(null);
		System.out.println(steps);
		Posts newPost = postsRepo.save(post);
		System.out.println(newPost);
		for(Steps step: steps) {
			step.setpId(newPost.getpId());
			System.out.println(step);
		}
		stepsRepo.saveAll(steps);
		newPost.setSteps(steps);
		return newPost;
	}

	/**
	 * Get a users posts using their id
	 * @param id
	 * @return
	 */
	public List<Posts> getPostsById(int id) {
		return (List<Posts>) postsRepo.findByUId(id);
	}

	/**
	 * updates a post using the post object passed in
	 * @param post
	 * @return
	 */
	public Posts updatePost(Posts post) {
		Posts updatedPost = postsRepo.save(post);
		stepsRepo.saveAll(post.getSteps());
		return updatedPost;
	}

	/**
	 * Deletes the given post
	 * @param post
	 * @return
	 */
	public void deletePost(Posts post) {
		System.out.println("delete post service");
		Set<Steps> steps = post.getSteps();
		post.setSteps(null);
		Set<Comments> comments = post.getComments();
		post.setComments(null);
		stepsRepo.deleteAll(steps);
		commentsRepo.deleteAll(comments);
		postsRepo.delete(post);
	}

	/**
	 * Get posts by category id
	 * @param id
	 * @return
	 */
	public List<Posts> getPostByCatgoryId(int id) {
		return postsRepo.findByCategoryId(id);
	}

}
