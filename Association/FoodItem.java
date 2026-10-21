import java.lang.*;
public abstract class FoodItem implements IQuantity{
	String FID;
	String name;
	int availableQuantity;
	double price;
	
	
	public FoodItem(){
		System.out.println("Empty Constructor");
	}
	
	          
		public FoodItem(String FID,String name,int availableQuantity,double price){
        this.FID=FID;
		this.name=name;
		this.availableQuantity=availableQuantity;
		this.price=price;
		}
		
	public void setFID(String FID){this.FID = FID;}
	
	public String getFID(){return FID;}
	
	public void setName(String name){this.name = name;}
	
	public String getName(){ return name;}
	
	public void setavailableQuantity(int availableQuantity){this.availableQuantity = availableQuantity;}
	
    public int getavailableQuantity(){return availableQuantity;}
	
	public void setPrice(double price){this.price = price;}
	
	public double getPrice(){return price;}
	
	public boolean addQuantity(int amount){
		if(amount>0){

			
			System.out.println("Previous Quantity: "+ availableQuantity);
			System.out.println("Added Amount: "+ amount);

			availableQuantity = availableQuantity+amount;
			
			System.out.println("Current Quantity: "+ availableQuantity);
			
			System.out.println("              ");
			return true;
		}
		else{return false;}
	}
    public boolean sellQuantity(int amount){

		if(amount>0 && amount<= availableQuantity){

			System.out.println("Previous Quantity: "+ availableQuantity);
			System.out.println("Selled Amount: "+ amount);

			availableQuantity = availableQuantity-amount;
			
			System.out.println("Current Quantity: "+ availableQuantity);
			System.out.println("                               ");
			
			return true;
		}
		else{return false;}
    }
	abstract void showInfo();
}
	
	
		  
			  
			  
			  
			  