public class Season {
public static void main(String[] args)
{
int month = 4;
if(month>0 && month<=12){ 
if(month==2)
   {
	System.out.println("Spring");
	} 
else if(month>2 && month<=5)
   {
	System.out.println("Summer");
	} 
else if(month>5 && month<=9)
{
	System.out.println("Monsoon");
} 
else if(month>9 && month<=11)
{
	System.out.println("Autumn");
} 
else{System.out.println("Winter");} 
}else{ System.out.println("Invalid month");} 
} 
 } 