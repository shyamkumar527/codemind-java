import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,t,amount=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        t=sc.nextInt();
        for(int i=0;i<n;i++){
		    if(arr[i]>t){
			    amount+=2;
		    }
		    else{
			    amount++;
		    }
	    }
	    System.out.println(amount);
    }
}