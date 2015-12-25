package com.byzk.user.util;


//验证码生存类
public class Validate {
	public String liveValidate(){
		char arr1[] = new char[4] ; 
		char arr[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
				'a','b','c','b','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
				'0','1','2','3','4','5','6','7','8','9'} ; 
		for(int i=0 ; i<arr1.length ; i++){
			arr1[i] = arr[(int)(Math.random()*62)];
		}
		String num = String.valueOf(arr1);
		return num;
	}
}
