package classes;

public class shopingcart {
	int n;
	int price;
	String items;
shopingcart()
{
	int n = 1;
	int price = 20;
	String items = "milk";
	System.out.println("Shopping Cart = " + items);
	System.out.println("No. of items =" + n);
	System.out.println("Price of milk =" + price);
		
}
shopingcart(int n,int price,String items)
{
	//this.n = n;
	//this.price = price;
	//this.items = items;
	System.out.println("Shopping Cart = " + items);
	System.out.println("No. of items =" + n);
	System.out.println("Price of milk =" + price);
		

}
}
