package com.revature.JavaTheHaatServerSide.email;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;

import com.revature.JavaTheHaatServerSide.beans.Users;
import com.revature.JavaTheHaatServerSide.ctrl.PostsCtrl;

public class Email {
	
	final static Logger logger = Logger.getLogger(Email.class);
	
	/**
	 * Sends an email to the new user with their username ant password
	 * @param user
	 */
	public static void newAdminEmail(Users user) {
		logger.info("newAdminEmail()");
		final String username = "";
		final String password = "";
		final String receiver = user.getEmail();
		
		String text = "Hello " + user.getFname() + ","
				+ "\n\nYou have been signed up for an admin account on Super Jumbo DIY Paradise"
				+ "\n\n 	username: " + user.getUsername()
				+ "\n\n 	password: " + user.getPassword();
		
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		
		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password);
			}
		});
		
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, 
					InternetAddress.parse(receiver));
			message.setSubject("New account on Super Jumbo DIY Paradise");
			message.setText(text);
			
			Transport.send(message);
		} catch (MessagingException e) {
			throw new RuntimeException(e); 
		}
		
	}

}
