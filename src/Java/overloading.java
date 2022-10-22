package Java;

public class overloading {

	
		// TODO Auto-generated method stub

		
	int sum(int a , int b)
{
	int s;
	s = a + b ;
	System.out.print("sum =" + s);
	return s;
}
void multiply(int a, int b)
{
	int s;  
	s = a * b;
	System.out.print("sub =" + s);
	
}
void multiply(double a ,double b)
{
	double multiply;
	multiply = a*b;
	System.out.print("multiply =" + multiply);
}
public static void main(String[] args) {
	overloading s1 =new overloading();
int a =18;
int b =20;
s1.sum(a,b);
	}

}
