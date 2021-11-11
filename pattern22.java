import java.util.*;
class pattern22	
{
     public static void main(String arg[])
    {
        try{
            int n,i,j,k;
            Scanner t=new Scanner(System.in);
            System.out.println("Enter n");
            n=t.nextInt();
          for (i=n; i>= 1 ; i--)  
	{  
	  for (j = i; j<n ; j++)   
	   {  
	     System.out.print(" ");  
	    }     
	    for (k = 1; k <= (2*i -1) ;k++)   
	    {  
	        if( k==1 || i == n || k==(2*i-1))   
	           {  
	             System.out.print("*");  
	            }  
	         else   
	            {  
	             System.out.print(" ");  
	             }  
	          }  
	      System.out.println("");  
	}   
           
  
       }
       catch(Exception e)
	{
	   System.out.println(e);
	 }
       }
}
