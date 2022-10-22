package classes;

public class marksheet {
String name;
int english;
int maths;
int science;
int sst;
int totalmarks;
void reportcard()
{
	System.out.println("Name =" + name);
	System.out.println("Marks in English =" + english);
	System.out.println("Marks in maths =" + maths);
	System.out.println("Marks in science =" + science);
	System.out.println("Marks in sst =" + sst);
	totalmarks = english + maths + science + sst;
	
	System.out.println("Total marks =" + totalmarks);

			
}


}
 