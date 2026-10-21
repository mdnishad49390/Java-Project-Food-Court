
public interface FoodItemOperations{

	boolean insertFoodItem(FoodItem f);
	
	boolean removeFoodItem(FoodItem f);
	
	FoodItem searchFoodItem(String FID);
	
	void showAllFoodItems();
}
