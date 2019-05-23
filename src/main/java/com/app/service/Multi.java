package com.app.service;

class Multi extends Thread{
	
	//-- Java Thread Example by extending Thread class
	
	public void run(){  
		System.out.println("thread is running...");  
	}
	
	public static void main(String args[]){  
		Multi t1=new Multi();  
		t1.start();  
	 }

} 