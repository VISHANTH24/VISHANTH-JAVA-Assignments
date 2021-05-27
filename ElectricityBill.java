import java.util.Scanner;

class ElecBill 
{ 
        public static void main(String args[]) 
        {  
        int Propertytype;
	   long units;
	   
	   
	   Scanner pt=new Scanner(System.in);
	   
	   System.out.println("Select Type of Property\n 1:house \n 2:Commercial");
	   
	   Propertytype = pt.nextInt();
	   
	   
     Scanner sc=new Scanner(System.in);
 
	 System.out.println("enter number of units");
	   
           units=sc.nextLong();
 
     	   double billpay=0;
 
           if(units<100 && Propertytype ==1 )
		billpay=units*3;
 
    	    else if(units<200 && Propertytype ==1)
		billpay=100*3+(units-100)*4;
 
	    else if(units<100 && Propertytype ==2)
		billpay=units*10;
           
	    else if(units<200 && Propertytype ==2)
	    	billpay=100*10+(units-100)*20; 
 
              System.out.println("Bill to pay : " + billpay); 
   } 
}