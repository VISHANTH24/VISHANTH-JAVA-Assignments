public class DuplicatesArray {  
    public static void main(String[] args) 
    {      
          
         
        int [] arr = new int [] {10, 20, 30, 40, 20, 75, 85, 85,10,};   
          
        System.out.println("Duplicate elements in given array: ");  
      
        for(int i = 0; i < arr.length; i++) 
        {  
            for(int j = i + 1; j < arr.length; j++) 
            {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  