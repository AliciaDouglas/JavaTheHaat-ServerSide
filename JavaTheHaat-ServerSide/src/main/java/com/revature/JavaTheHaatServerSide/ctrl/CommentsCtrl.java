package com.revature.JavaTheHaatServerSide.ctrl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.JavaTheHaatServerSide.beans.Comments;
import com.revature.JavaTheHaatServerSide.service.CommentsService;

@RestController
public class CommentsCtrl {

	final static Logger logger = Logger.getLogger(CommentsCtrl.class);

	@Autowired
	CommentsService commentsService;
	
	/**
	 * Create a new comment
	 * @param comment
	 * @return
	 */
	@PostMapping("/comments")
	public ResponseEntity<Comments> newComment(@RequestBody Comments comment) {
		logger.info("/comments - POST  newComment()");
		return new ResponseEntity<> (commentsService.newComment(comment), HttpStatus.CREATED);
	}
	
	/**
	 * Deletes a comment
	 * @param comment
	 */
	@PutMapping("/comments/delete")
	public void deleteComment(@RequestBody Comments comment) {
		logger.info("/comments - DELETE  deleteComment()");
		commentsService.deleteComment(comment);
	}

}
