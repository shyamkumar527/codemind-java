import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,q;
        t=sc.nextInt();
        for(q=0;q<t;q++){
    		int n,i,a,c=0;
    		n=sc.nextInt();
    		for(i=0;i<n;i++){
    		    a=sc.nextInt();
    			if(a%2==1){
    				c++;
    			}
    		}
    		if(c%2==1){
    			c--;
    		}
    		System.out.println(c/2);
    	}
    }
}