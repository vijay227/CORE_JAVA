package com.runtime.Runtime;

public class RUNTIME {

	public static void main(String[] args) {

        // get the current runtime assosiated with this process 
        Runtime run = Runtime.getRuntime(); 
        // print the current free memory for this runtime 
        System.out.println("" + run.freeMemory()); 
	}

}
