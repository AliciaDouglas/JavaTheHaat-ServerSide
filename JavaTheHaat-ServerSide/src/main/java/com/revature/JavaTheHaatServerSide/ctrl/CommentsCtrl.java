package com.revature.JavaTheHaatServerSide.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<Comments> newComment(@RequestBody Comments comment) {
		System.out.println("/comments - PUSH");
		return new ResponseEntity<> (commentsService.newComment(comment), HttpStatus.OK);
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
