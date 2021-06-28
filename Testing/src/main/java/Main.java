package main.java;

import java.util.Scanner;
public class Main {  

	public static int findMax(int arr[]){  
        int max=0;  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }  
        return max;  
    }  

    public static int cube(int n){  
        return n*n*n;  
    }  
   
}  
