import java.util.*;
public class file{
    public static void main(String[] args){
        int n,r,ans=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
	    while(n>0){
		    r=n%10;
		    ans+=Math.pow(r,2);
		    n=n/10;
		    if(n==0 && ans<10){
			    if(ans==1 || ans==7){
			        System.out.println("True");
				    break;
			    }
			    else{
				    System.out.println("False");
				    break;
			    }
			
		    }
		    else if(n==0 && ans>=10){
			    n=ans;
			    r=0;
			    ans=0;
		    }
	    }
    }
}