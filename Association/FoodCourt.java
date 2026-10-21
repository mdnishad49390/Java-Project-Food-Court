import java.lang.*;
public class FoodCourt implements RestaurantOperations,EmployeeOperations{
	private Restaurant restaurants[] = new Restaurant[25];
	private Employee employees[] = new Employee[120];

	public boolean insertRestaurant(Restaurant r){
		boolean flag = false;
		for(int i=0; i<restaurants.length; i++){
			if(restaurants[i] == null){
				restaurants[i] = r;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean removeRestaurant(Restaurant r){
		boolean flag = false;
		for(int i=0; i<restaurants.length; i++){
			if(restaurants[i] == r){
				restaurants[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public Restaurant searchRestaurant(String RID){

		Restaurant r = null;
		
		for(int i=0; i<restaurants.length; i++){
			if(restaurants[i] != null){
				if(restaurants[i].getRID().equals(RID)){
					r = restaurants[i];
					break;
				}
			}
		}
		return r;
	}

	public void showAllRestaurants(){
		for(int i = 0; i<restaurants.length; i++){
			if(restaurants[i]!=null){
			
				System.out.println("Restaurant ID : "+restaurants[i].getRID());
				System.out.println("Restaurant Name : "+restaurants[i].getName());
				System.out.println("                             ");
				restaurants[i].showAllFoodItems();
				System.out.println("                             ");
			}
		}
	}


	public boolean insertEmployee(Employee e){
		boolean flag = false;

		for(int i=0; i<employees.length; i++){
			if(employees[i]==null){
				employees[i]=e;
				flag =  true;
				
				break;
			}
			else{flag = false;}
		}
		return flag;
	}

	public boolean removeEmployee(Employee e){
		boolean flag = false;

		for(int i=0; i<employees.length ; i++){
			if(employees[i]==e){
				employees[i]=null;
				flag =  true;
				break;
			}
			else{flag = false;}
		}
		return flag;
	}

	public Employee searchEmployee(String EID){
		Employee e = null;
		for(int i=0; i<employees.length ; i++){
			if(employees[i] != null){
				
				if(employees[i].getEID().equals(EID)){
					e=employees[i];
					break;
				}
			}
		}
		return e;
	}

	public void showAllEmployees(){
		for(int i = 0; i<employees.length; i++){
			if(employees[i]!=null){
			
				System.out.println("Employee ID : "+employees[i].getEID());
				System.out.println("Employee Name : "+employees[i].getName());
				System.out.println("Employee Salary : "+employees[i].getSalary());
				
			}
		}
	}


}