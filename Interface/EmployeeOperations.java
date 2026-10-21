public interface EmployeeOperations{

	boolean insertEmployee(Employee e);

	boolean removeEmployee(Employee e);

	Employee searchEmployee(String EID);

	void showAllEmployees();
}