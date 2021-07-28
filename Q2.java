/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labNO7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author sathaiah balaji
 */
public class Q2{
    
    
    public static void main(String[] args) {
         Scanner in=new Scanner (System.in);
        employee e1=new employee("raj",20000);
        
        ArrayList<employee> a=new ArrayList<>();
          for (int i = 1; i <= 20; i++) 
        {
            int s;
            String name;
            System.out.println("Enter the name"); 
            s=in.nextInt();
            System.out.println("Enter the salary"); 
            name=in.next();
            a.add(new employee(name,s)); 
        }
        System.out.println(a);
        Collections.sort(a,new namesort());
        System.out.println(a);
        
    }
    
}
class employee
{
    String name;
    double salary;
    employee(String n,double s)
    {
        name=n;
        salary=s;
    }
    public String toString()
    {
        return "\nEmployee Name:"+name+"\tSalary:"+salary;
    }
}
class namesort implements Comparator<employee>
{
    @Override
    public int compare(employee e1,employee e2)
    {
        System.out.println(e1.name+"----"+e2.name);
        return e2.name.compareTo(e1.name);
    }
}

