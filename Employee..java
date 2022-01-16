public class Employee
{

int year_of_joining;
String Address,name;
 
 public String getname()
        {
	    return name;
     }
public void setName(String name)
{
      this.name=name;
}
public String getAddress()
{
	return Address;
}
public void setAddress(String Address)
{
	this.Address = Address;
}

 public int year_of_joining()
{
	return year_of_joining;
}
public void setyearOfJoining(int year_of_joining)
{
       this.year_of_joining =year_of_joining;
}

public void  display()
{
System.out.println("NAME     " + "        Year of join " + "      Address ");
System.out.println("---------------------------------------------");

}
public void show(){

System.out.println(name  +   "             " +year_of_joining+"           " + Address);
}
public static void main(String args[])
{
     	Employee e = new Employee();
	Employee e2 =new Employee();
	Employee e3 = new Employee();
	e.setName("Robert");
	e.setyearOfJoining(1994);
        e.setAddress("64c-WallsStreet");
	e.display();
	e.show();
        
        e2.setName("Sam");
	e2.setyearOfJoining(2000);
        e2.setAddress("68D-WallsStreet");
	e2.show();

        e3.setName("John");
	e3.setyearOfJoining(1999);
        e3.setAddress("26B-WallsStreet");
  	e3.show();
	System.out.println(e);
	System.out.println(e2);
	System.out.println(e3);
}
}
