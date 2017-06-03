package com.financial.until;

import java.lang.CharSequence;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 密码编码工具类
 * @author Maing<280561543@qq.com>
 * @version 0.0.1
 */
public class EncoderUntils {
	/**
	 * 定义一个BCryptPasswordEncoder的静态私有变量
	 */
	private static final PasswordEncoder encoder = new BCryptPasswordEncoder(8);

	public static PasswordEncoder getEncoder() {
		return encoder;
	}

	/**
	 * 加密密码
	 * @param rawPassword
	 * @return String 返回加密后的密码
	 */
	public static String encode(CharSequence rawPassword) {
		return encoder.encode(rawPassword);
	}
	
	/**
	 * 判断密码是否正确
	 * @param rawPassword - the raw password to encode and match.
	 * @param encodedPassword - the encoded password from storage to compare with.
	 * @return boolean
	 */
	public static boolean matches(CharSequence rawPassword, String encodedPassword) {
		return encoder.matches(rawPassword, encodedPassword);
	}
}