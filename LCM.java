import java.util.*;
public class file{
    public static void main(String[] args){
        int n,m,a,b,lcm=0,gcd=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        a=n;
	    b=m;
	    while(a!=b){
		    if(a>b){
			    a=a-b;
		    }
		    else{
		    	b=b-a;
		    }
	    }
	    gcd=a;
	    lcm=(m*n)/gcd;
	    System.out.println(lcm);
    }
}