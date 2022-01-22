public class methodassisted
{

public static void main(String[] args) {

	//method demo
	
	methodExecution b=new methodExecution();
	int ans= b.multipynumbers(10,3);
	System.out.println("Multipilcation is :"+ans);
	
	//call by value
	callMethod d = new callMethod();
	System.out.println("Before operation value of data is "+d.val);
	d.operation(100);
	System.out.println("After operation value of data is "+d.val);
	

	//method overloading
	overloadMethod ob=new overloadMethod();
    ob.area(10,12);
    ob.area(5); 
	}
}

//method demo
class methodExecution {

public int multipynumbers(int a,int b) {
	int z=a*b;
	return z;
}
}

//call by value
class callMethod {

int val=150;

int operation(int val) {
	val =val*10/100;
	return(val);
}
}



//method overloading
class overloadMethod {
	
public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }


}
