package com.yzhg.study.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class ClassUtils {

	public static long getPhone(){
		Random random = new Random();
		return Long.valueOf(getPhoneStart(random.nextInt(7)) + (random.nextInt(9999999) + 10000000));
	}

	/***
	 * 生成手机号
	 */
	public static String getPhoneStart(int x) {
		String res = "185";
		switch (x) {
			case 0:
				res = "185";
				break;
			case 1:
				res = "155";
				break;
			case 2:
				res = "157";
				break;
			case 3:
				res = "177";
				break;
			case 4:
				res = "147";
				break;
			case 5:
				res = "156";
				break;
			case 6:
				res = "186";
				break;
			default:
				res = "166";
				break;
		}
		return res;
	}


	/**
	 * 作 者: yzhg
	 * 历 史: (版本) 1.0
	 * 描 述: 密码的md5加密
	 */
	public static String md5Encode(String password) {
		try {
			MessageDigest digest = MessageDigest.getInstance("md5");
			byte[] result = digest.digest(password.getBytes());
			StringBuilder sb = new StringBuilder();
			for (byte b : result) {
				int number = b & 0xff;
				String str = Integer.toHexString(number);
				if (str.length() == 1) {
					sb.append("0");
				}
				sb.append(str);
			}
			return sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return "";
		}
	}
}
