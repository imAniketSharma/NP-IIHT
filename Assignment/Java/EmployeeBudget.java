import java.util.*;
class project
{
	String project_name="mission_all_out";
	int total_project_cost=1000;
	int emp1_salary=356;
	int emp2_salary=400;
	public int current_project_cost()
	{
		return(emp1_salary+emp2_salary);
	}
}
class employee extends project
{
	String emp_name;
	int emp_package;
	public void display()
	{
		System.out.println("emp_name=  " + emp_name + "\nemp_package=  " + emp_package);
	}
}
public class Main {
	public static void main(String[] args) {
		employee emp=new employee();
		emp.emp_package=273;
		emp.emp_name="vikas chaurasia";
		emp.display();
		int remaining_amount=emp.total_project_cost - emp.current_project_cost();
		System.out.println("project budjet= " + remaining_amount);
		if(emp.emp_package < emp.current_project_cost())
		{
			System.out.println("employee can be hired");
		}
		else
		{
				System.out.println("employee cann't be hired");
		}
		
	}
}
