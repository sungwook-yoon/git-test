package com.socket.test.controller;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//import org.apache.commons.codec.binary.Hex;

public class Test {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		/*String test_key = "44b8d68afa5a64d432ae1a725c3ae8ca34c1d4784ac82acd4abf4d6feacf9d33cac335e72764d5e28488c17e3f3bed1f";
		byte[] dd = test_key.getBytes();
		System.out.println("dd :: " + dd);
		
		int type = dd[3] % 3;
	    int usimVar = dd[4] % 10;
	    int serverVar = dd[8] % 10;
	    
	    System.out.println("type :: " + type);
	    System.out.println("usimVar :: " + usimVar);
	    System.out.println("serverVar :: " + serverVar);
	    
	    System.out.println("dd[0] :: " + dd[0]);
	    System.out.println("dd[2] :: " + dd[1]);
	    System.out.println("dd[3] :: " + dd[2]);
	    System.out.println("dd[4] :: " + dd[3]);
	    
	    long time;
	      short val;
	      StringBuffer authCode = new StringBuffer();
	      
	      for (int i = 0; i < 20; i++) {
	        time = System.currentTimeMillis();
//	        System.out.println("time["+i+"] :: " + time);
	        val = (short)Math.abs((time * Math.random()) % 10);
//	        System.out.println("Math(1)["+i+"] :: " + Math.abs((time * Math.random())));
//	        System.out.println("Math(2)["+i+"] :: " + Math.abs((time * Math.random())% 10));
	        System.out.println("Math.random()["+i+"] :: " + (short)Math.abs((time * Math.random())% 10));
	        System.out.println("Math.random()["+i+"] :: " + Math.abs((time * Math.random())% 10));
//	        System.out.println("val["+i+"] :: " + val);
	        authCode.append(val);
	      }
	      
//	      System.out.println("authCode :: " + authCode.toString());
	      
	      byte byte1 = 40;
	      byte byte2 = 30;
	      //byte byte3 = byte1 + byte2; // problem!! casting necessary
	      byte byte3 = (byte)( byte1 + byte2 ); // OK!!!
	      short aa = byte3;
	      System.out.println("byte3 :: " + byte3);
	      System.out.println("aa :: " + aa);*/
		
		String plainText = "ysw8496!";
		
		MessageDigest md;
	    String encryptText = "";

	    try {
	      md = MessageDigest.getInstance("SHA-512");
	      try {
			System.out.println("111 : " + plainText.getBytes("UTF-8"));
			 byte[] digest = md.digest(plainText.getBytes("UTF-8"));
		      System.out.println("111 : " + digest);
//		      encryptText = Hex.encodeHexString(digest);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     

	    } catch (NoSuchAlgorithmException e) {
	      e.printStackTrace();
	    } 
		
	}

}
