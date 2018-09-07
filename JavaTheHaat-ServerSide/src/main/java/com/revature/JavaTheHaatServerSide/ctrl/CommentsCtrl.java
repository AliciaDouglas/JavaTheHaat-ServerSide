package com.revature.JavaTheHaatServerSide.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
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
	
}
