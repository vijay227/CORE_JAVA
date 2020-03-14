package com.runtime.Runtime;

public class GFG {

	public static void main(String[] args) {
		try
        { 
            // create a process and execute google-chrome 
            Process process = Runtime.getRuntime().exec("GoogleChrome"); 
            System.out.println("Google Chrome successfully started"); 
        } 
        catch (Exception e) 
        { 
            e.printStackTrace(); 
        } 	}

}
