package com.financial.until;

import java.util.Properties;

import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
//import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.boot.autoconfigure.mail.MailProperties;

/**
 * Send Email Util
 * http://blog.csdn.net/caimengyuan/article/details/51224269
 * @description 
 */
public class MailUtils {

	private static final String Username = "280561543@qq.com";

	private static final JavaMailSenderImpl senderImpl = new JavaMailSenderImpl();

	private static final Properties prop = new Properties();

	static {
		senderImpl.setHost("smtp.qq.com");
        senderImpl.setProtocol("smtp");
        senderImpl.setUsername(Username);
        senderImpl.setPassword("qwcdqwyhxmgpbice");
        senderImpl.setPort(587);
        senderImpl.setDefaultEncoding("UTF-8");

        prop.put("mail.smtp.auth", true);
        prop.put("mail.smtp.connecttimeout", 10000);
        prop.put("mail.smtp.timeout", 10000);
        prop.put("mail.smtp.writetimeout", 10000);
        prop.put("mail.debug", true);

        senderImpl.setJavaMailProperties(prop);
	}

	public static void singleMail(String to, String subject, String content) {
		String[] array = new String[] {to};
		singleMail(array, subject, content);
	}
	
	public static void singleMail(String[] to, String subject, String content) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo(to);
		mailMessage.setFrom(Username);
		mailMessage.setSubject(subject);
		mailMessage.setText(content);
		try {
			senderImpl.send(mailMessage);
		} catch (MailException e) {
			e.printStackTrace();
		}
	}
}