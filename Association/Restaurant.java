import java.lang.*;
public class Restaurant implements FoodItemOperations{
private String RID;
	private String name;
	private FoodItem fooditems[]= new FoodItem[27];


	public Restaurant(){};
	public Restaurant( String RID ,String name){
		this.RID = RID;
		this.name = name;
	}
		public void setRID(String RId){this.RID = RID;}
	
	public String getRID(){return RID;}

	public void setName(String name){this.name = name;}

	public String getName(){return name;}

public boolean insertFoodItem(FoodItem f){
		boolean flag =false;
		for(int i=0; i<fooditems.length; i++){
			if(fooditems[i]==null){
				fooditems[i]=f;
				flag =  true;
				break;
			}
		}
		return flag;
	}
	public boolean removeFoodItem(FoodItem f){
		boolean flag =false;
		for(int i=0; i<fooditems.length; i++){
			if(fooditems[i]==f){
				fooditems[i]=null;
				flag =  true;
				break;
			}
		}
		return flag;

	}
	
	public FoodItem searchFoodItem(String FID){
		FoodItem f = null;

		for(int i=0 ; i<fooditems.length;i++){
			if(fooditems!=null){
				if(fooditems[i].getFID().equals(FID)){
					f=fooditems[i];
					break;
				}
			}
		}
		return f;
	}
	public void showAllFoodItems(){
		for(int i=0; i<fooditems.length; i++){
			if(fooditems[i] != null){
				fooditems[i].showInfo();
			}
		}
	}
}