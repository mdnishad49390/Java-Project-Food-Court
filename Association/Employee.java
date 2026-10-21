import java.lang.*;
public class Employee{

	private String  EID;
	private String name;
	private double salary;


	public Employee(){};
	public Employee( String EID ,String name,double salary){
		this.EID = EID;
		this.name = name;
		this.salary = salary;
	}

	public void setName(String name){this.name = name;}

	public String getName(){return name;}

	public void setEID(String EID){this.EID = EID;}
	
	public String getEID(){return EID;}

	public void setSalary(double salary){this.salary = salary ; }

	public double getSalary(){return salary;}

	
}

	