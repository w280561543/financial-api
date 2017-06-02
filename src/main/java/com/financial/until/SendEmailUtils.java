package com.financial.until;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

/**
 * Send Email Util
 * http://blog.csdn.net/mingliangniwo/article/details/51852696
 * @description 
 * 
 */
public class SendEmailUtils {
	private static final JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
	
	public static void sendText() {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo("280561543@qq.com");
		mailMessage.setFrom("280561543@qq.com");
		mailMessage.setSubject(" 测试简单文本邮件发送！");
		mailMessage.setText(" 测试我的简单邮件发送机制！！");

		javaMailSender.setHost("smtp.qq.com");
		javaMailSender.setUsername("280561543@qq.com");
		javaMailSender.setPassword("qwcdqwyhxmgpbice");
		javaMailSender.setPort(465);
		javaMailSender.setDefaultEncoding("UTF-8");
		
		// 发送邮件
		javaMailSender.send(mailMessage);
	}
}