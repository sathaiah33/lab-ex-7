/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labNO7;
 import java.io.*; 
import java.util.*; 
/**
 *
 * @author sathaiah balaji
 */
public class Q1 {
  
  

    public static void main(String[] args) 
    { 
         
        int n = 10,avg,t=0,max=0,min=0; 
        Scanner in=new Scanner (System.in);
        // Declaring the ArrayList with 
        // initial size n 
        ArrayList<Integer> a = new ArrayList<>(n); 
  
        // Appending new elements at 
        // the end of the list 
        for (int i = 1; i <= n; i++) 
        {
            int s;
            System.out.println("Enter the elements"); 
            s=in.nextInt();
            a.add(s); 
        }
        // Printing elements 
        System.out.println(a); 
        for (int i = 1; i <= n; i++) 
        {
            
            t= t+a.get(i);
        }
        avg=t/n;
        // Printing average
        System.out.println("average of elements:"+avg);
   for (int i = 1; i <= n; i++) 
        {
            if(a.get(i)>max)
            {
                max=a.get(i);
            }
            else if(a.get(i)<min)
            {
                min=a.get(i);
            }
            else
            {
                continue;
            }
        }
        System.out.println("maximum of elements:"+max);
        System.out.println("minimum of elements:"+min);
        System.out.println("even numbers of elements:");
         for (int i = 1; i <= n; i++) 
        {
            if((a.get(i)%2)==0)
            {
           System.out.println(a.get(i));
            }
        }
    } 
}
    

