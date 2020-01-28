import java.util.*;
public class Demo5
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter name");
	    String name=sc.nextLine();
	    System.out.println("Enter weight");
	    double w=sc.nextDouble();
            System.out.println("Enter height");
	    double h=sc.nextDouble();
		Patient p=new Patient(name,w,h);
	 System.out.println(p.bmi());
	}
}
 class Patient{
    String name;
    double w,h;
    Patient(String name,double w,double h){
        this.name=name;        
        this.w=w;
        this.h=h;
    }
    double bmi(){
    return((w/h)*703);
}
}
