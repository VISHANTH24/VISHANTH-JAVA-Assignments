import java.util.*;
import java.io.*;

 

class HotelBill
{
public static void main(String[] args) throws Exception
{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
List <String> hotelMenu = new ArrayList();
int i=0;
int itemCode=0,numPlates=0,total=0,price=0;

//Map<String, String> hotelMenu = new LinkedHashMap<String, String>();
hotelMenu.add("Vada : 20");
hotelMenu.add("Dosa : 40");
hotelMenu.add("Rice : 30");

System.out.println("*********** MENU ***************");
System.out.println("Item Code . Item : price ");
for(String item:hotelMenu)
{
i++;
System.out.println(i + " . " + item);
}
System.out.println("********************************");
System.out.println("Enter Item Code ");
itemCode=Integer.parseInt(br.readLine()) - 1;
System.out.println("Enter Number of Plates ");
numPlates=Integer.parseInt(br.readLine());
String[] selItem= hotelMenu.get(itemCode).split(":",0);
price=Integer.parseInt(selItem[1].trim()) ;
total= price * numPlates ;
System.out.println("---------------------------------");
System.out.println("\n Item : " + hotelMenu.get(itemCode));
System.out.println(" Quantity : " + numPlates);
System.out.println("*********************************");
System.out.println(" Total : " + total );
System.out.println("---------------------------------");
}
}