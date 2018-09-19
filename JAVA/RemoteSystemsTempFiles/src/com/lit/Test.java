package com.lit;
import javax.mail.MessagingException;
import java.util.*;
import java.util.Properties;
import javax.mail.*;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.*;


public class Test{

	/**
	 * @param args
	 */
	public static void send(final String p,final String m) {
		// TODO Auto-generated method stub
		try {
			//copy all the content from mailsend2advance java
			Properties props = new Properties();  
			  props.put("mail.smtp.host","smtp.gmail.com");  
			  props.put("mail.smtp.socketFactory.port", "465");  
			  props.put("mail.smtp.socketFactory.class",  
			"javax.net.ssl.SSLSocketFactory");  
			  props.put("mail.smtp.auth", "true");  
			  props.put("mail.smtp.port", "465"); //* 

			  Session session = Session.getDefaultInstance(props,  
						new javax.mail.Authenticator() {  
						protected  PasswordAuthentication getPasswordAuthentication() {  
						return new PasswordAuthentication (m,p);//change accordingly  
						   }  
						  });
			  
			  MimeMessage message = new MimeMessage(session);  
		         message.setFrom(new InternetAddress("pchaurasia127@gmail.com")); //sender 
		         message.addRecipient(Message.RecipientType.TO,
		        		 new InternetAddress(m));//Receiver
		         message.setSubject("Email Varification!!!!....Congratulation u have Successfully completed your regestration.You Password for log in into account is given below:");  

		         message.setText("Congratulation u have Successfully completed your regestration.You Password for log in into account is:");  
		         message.setText(p);
		         Transport.send(message);
		         System.out.println("message sent successfully...."); 
			
			
			
			
		} 
		catch (Exception e) {
			// TODO: handle exception
			throw
			new RuntimeException(e);
			
		}

	}

}
