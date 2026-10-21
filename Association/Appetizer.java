import java.lang.*;
public class Appetizer extends FoodItem{
private String size;

  public Appetizer(String FID , String name,int availableQuantity, double price,String size ){
    super(FID,name,availableQuantity,price);
	this.size=size;
    
  }
  public void setSize(String size){
	  this.size=size;
  }
  
  public String getSize(){
  return size;}

 

  public void showInfo(){
    
    System.out.println("Food Id  : "+ getFID());
    System.out.println("Food Name  : "+ getName());
    System.out.println("Available Quantity  : "+ getavailableQuantity());
    System.out.println("Food Price  : "+ getPrice());
	System.out.println("Size :"+getSize());
  	
  }

}