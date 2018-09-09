package com.revature.JavaTheHaatServerSide.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.JavaTheHaatServerSide.beans.Comments;
import com.revature.JavaTheHaatServerSide.service.CommentsService;

@RestController
public class CommentsCtrl {

	@Autowired
	CommentsService commentsService;
	
	/**
	 * Create a new comment
	 * @param comment
	 * @return
	 */
	@PostMapping("/comments")
	public Comments newComment(@RequestBody Comments comment) {
		System.out.println("/comments - PUSH");
		return commentsService.newComment(comment);
	}
	
	/**
	 * Deletes a comment
	 * @param comment
	 */
	@DeleteMapping("/comments")
	public void deleteComment(@RequestBody Comments comment) {
		System.out.println("/comments - DELETE");
		commentsService.deleteComment(comment);
	}
	
}
