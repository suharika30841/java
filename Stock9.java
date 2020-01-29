import java.lang.*;
import java.util.*;
public class Stock9
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Stock name");
	    String name=sc.nextLine();
	    System.out.println("Enter Stock symbol");
	    String s=sc.nextLine();
	    System.out.println("Enter prev");
	    double p=sc.nextDouble();
            System.out.println("Enter cur");
	    double c=sc.nextDouble();
	    Stock b=new Stock(name,s,p,c);
	 System.out.println(b.per());
	}
}
 class Stock{
    double p,c,p1;
    String name,s;
    public Stock(String name,String s,double p,double c){
        this.name=name;
        this.s=s;
        this.p=p;
        this.c=c;
    }
    public double per(){
        p1=Math.abs((c-p)*100/p);
        return p1;
    }
}
