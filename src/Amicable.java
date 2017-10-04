/**
 * @(#)Amicable.java
 *
 * Amicable application
 *
 * @author 
 * @version 1.00 2015/7/2
 */
 import java.io.*;
 
 class Amicable {
 	DataInputStream dis=new DataInputStream(System.in);
 	int a,b,n,p;
 	void read()
 	{
 		try
 		{
 			System.out.println("enter number");
 			a=Integer.parseInt(dis.readLine());
 			System.out.println("enter number");
 			b=Integer.parseInt(dis.readLine());
 		}
 		catch(Exception x)
 		{
 			System.out.println("Invalid Input");
 			System.exit(0);
 		}
 	}
    void calculate()
    {
    	Check c1=new Check();
    	n=c1.calculate(a);
    	Check c2=new Check();
    	p=c2.calculate(b);
    	
    }
    class Check
    {
    	int s=0,i;
    	int calculate(int q)
    	{
    		for(i=1;i<q;i++)
    		{
    			if(q%i==0)
    				s=s+i;
    		}
    		return(s);
    		}
    	}
    void print()
    {
    	if(n==b && p==a)
    		System.out.println("amicable numbers");
    		else
    			System.out.println("not amicable numbers");
    }
    
    public static void main(String[] args) {
    	Amicable a1=new Amicable();
    	a1.read();
    	a1.calculate();
    	a1.print();	
    }
}
