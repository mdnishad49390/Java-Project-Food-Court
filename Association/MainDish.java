import java.lang.*;
public class MainDish extends FoodItem{

  private String category;

  public MainDish(){System.out.println("Empty Constructor");}

  public MainDish(String FID , String name,int availableQuantity, double price , String category ){
  	super(FID, name , availableQuantity, price);
  	this.category = category;
  }

  public void setCategory(String category){this.category = category;}
  public String getCategory(){return category;}

  public void showInfo(){
    
    System.out.println("Food Id  : "+ getFID());
    System.out.println("Food Name  : "+ getName());
    System.out.println("Available Quantity  : "+ getavailableQuantity());
    System.out.println("Food Price  : "+ getPrice());
  	System.out.println("Food Category  : "+ category);
    
  }

}