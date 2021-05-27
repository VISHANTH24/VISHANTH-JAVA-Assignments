import java.util.ArrayList;
import java.io.*;

 

public class Employe {
int id;
String name;
long salary;
static ArrayList al = new ArrayList();
static int count = 0; //to track the no. of Employes

 

Employe()
{
}

 

//constructor for initializing Employe objects

 

Employe(int id, String name, long salary)
{
this.id = id;
this.name = name;
this.salary = salary;
count++;
}

 

//method to store Employes details in an arraylist

 

public void putDetails(Employe e)
{
al.add(e);
}

 

//method to retreive Employe objects

 

public Employe getDetails(int id)
{
Employe es = (Employe)al.get(id);
return es;
}

 


public static void main(String[] args) throws IOException
{

 

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 

Employe e = new Employe();
Employe e1 = new Employe(1, "Jeeva", 15000);
Employe e2 = new Employe(2, "Vijay", 20000);
Employe e3 = new Employe(3, "Vathan", 21000);
Employe e4 = new Employe(4, "Satish", 18000);
Employe e5 = new Employe(5, "Swetha", 16000);
Employe e6 = new Employe(6, "Shalini", 30000);

 


e.putDetails(e1);
e.putDetails(e2);
e.putDetails(e3);
e.putDetails(e4);
e.putDetails(e5);
e.putDetails(e6);

 

System.out.println("The total number of Employes are: " +count);
System.out.println(" ");

 

while(true)
{
System.out.println("Enter Employee id to get the Employe Information: ");
int id = Integer.parseInt(br.readLine());
boolean flag = false;

 

for(int i=0; i<count;i++) {
Employe es = e1.getDetails(i);
if(id == es.id)
{
System.out.println("The Information of the Employee with id " +id +" is: ");
System.out.print(es.id +" " +es.name+" " +es.salary);
flag = true;
break;
}
}

 

System.out.println(" ");

 

if(!flag)
{
System.out.println("Sorry, no Info found with the entered id " +id);
}
System.out.println(" ");
String ch = null;

 

while(true)
{
System.out.println("Do you Want to Continue(y/n)?)");
System.out.println(" ");
ch = br.readLine();
if(ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("n")) break;
if(!(ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("n")))
{
System.out.println("Invalid option : please type y/n");
System.out.println(" ");
}
}

 

if(ch.equalsIgnoreCase("n"))
{
System.out.println(" ");
System.out.println("Thank you");
break;
}
}
}
}