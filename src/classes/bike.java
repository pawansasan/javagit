package classes;

public class bike {
int price = 250000;
String model = "Classic";
String breaktype = "Automatic";
String color = "Black";
String brand = "Bullet";
bike()
{
	System.out.println("BIKE brand is =" + brand);
	System.out.println("BIKE model is =" + model);
	System.out.println("BIKE color is =" + color);
	System.out.println("BIKE Breaktype is =" + breaktype);
	System.out.println("BIKE price is =" + price);
}
bike(int price,String model,String breaktype,String color,String brand)
{
	System.out.println("BIKE brand is =" + brand);
	System.out.println("BIKE model is =" + model);
	System.out.println("BIKE color is =" + color);
	System.out.println("BIKE Breaktype is =" + breaktype);
	System.out.println("BIKE price is =" + price);

}
}

