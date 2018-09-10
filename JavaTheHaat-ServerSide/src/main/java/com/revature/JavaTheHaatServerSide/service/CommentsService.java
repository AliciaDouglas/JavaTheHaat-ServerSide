package com.revature.JavaTheHaatServerSide.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.JavaTheHaatServerSide.beans.Comments;
import com.revature.JavaTheHaatServerSide.repository.CommentsRepo;

@Service
public class CommentsService {
	
	@Autowired
	CommentsRepo commentsRepo;

	/**
	 * Create a new comment
	 * @param comment
	 * @return
	 */
	public Comments newComment(Comments comment) {
		comment.setTimeSubmission(new Date());
		return commentsRepo.save(comment);
	}

	/**
	 * Delete a comment
	 * @param comment
	 */
	public void deleteComment(Comments comment) {
		commentsRepo.delete(comment);
	}

}
