package com.zxp.design;

public class Client {
	
	//√≈√Ê
	private static SecurityFacade security;
	
	public static void main(String[] args){
		security=new SecurityFacade();
		security.Activate();
		System.out.println("\n------------------\n");
		security.Deactivate();
	}
}
