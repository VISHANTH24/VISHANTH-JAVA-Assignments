public class SumAndProductofArray {  
    public static void main(String[] args) {      
          
        
        int [] arr = new int [] {10, 20 , 30, 40, 50};   
        int sum = 0;  
        int product = 1;
          
        
        for (int i = 0; i < arr.length; i++) {   
           sum = sum + arr[i];  
        }    
        System.out.println("Sum of all the elements of an array: " + sum);  
        
        for (int i = 0; i < arr.length; i++) {   
            product = product * arr[i];  
         }    
         System.out.println("product of all the elements of an array: " + product); 
    }  
}  