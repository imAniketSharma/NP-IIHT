import java.util.Scanner;
class grandFather
{
	String home;
	public void GrandPaAsset()
	{
	 home="grandpaHome";
	 System.out.println(home);
	}
}
class Father extends grandFather
{
	String home1;
	public void FatherAsset()
	{
	home1="FatherHome";
	System.out.print("  " + home1 + ",");
	}
}
public class Main extends Father{
	int bankBalance;
	String car;
	public void MyAsset()
	{
		bankBalance=100000;
		car="LimberguniCar";
		
		System.out.println(" bankbalance: " + bankBalance + "    Car: " + car);
	}
	public static void main(String[] args) {
		grandFather grandFatherAsset= new grandFather();
		//grandFatherAsset.GrandPaAsset();
		Father FatherAsset1= new Father();
		//FatherAsset1.FatherAsset();
		Main TotalAsset= new Main();
		System.out.println("my total asset is ");
		TotalAsset.MyAsset();
		System.out.print("property:  ");
		TotalAsset.FatherAsset();
		TotalAsset.GrandPaAsset();
	}
}
