import java.util.*;
class file{
    public static int palin(int a){
        int r,rev=0,rev1=0,i=a,ans,dup;
        while(a>0){
            r=a%10;
    		rev=(rev*10)+r;
    		a=a/10;
        }
        ans=i+rev;
	    dup=ans;
	    while(ans>0){
    		r=ans%10;
    		rev1=(rev1*10)+r;
    		ans=ans/10;	
    	}
    	if(dup==rev1){
    		return rev1;
    	}
    	else{
    		return palin(dup);
    	}
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x,total,i;
        x=sc.nextInt();
        total=palin(x);
        System.out.println(total);
    }
}