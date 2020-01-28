import java.util.*;
public class Demo2
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Width");
	    double w=sc.nextDouble();
	    System.out.println("Enter height");
	    double h=sc.nextDouble();
	    System.out.println("Enter depth");
	    double d=sc.nextDouble();
		Box b=new Box(w,h,d);
	 System.out.println(b.volume());
	}
}
 class Box{
    double w,h,d,v;
    public Box(double w,double h,double d){
        this.w=w;
        this.h=h;
        this.d=d;
    }
    public double volume(){
        v=w*h*d;
        return v;
    }
}