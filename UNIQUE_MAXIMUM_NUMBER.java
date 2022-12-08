import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,res=0,max=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
				    c++;
			    }
            }
            if(c==1){
    			if(arr[i]>max){
    			    max=arr[i];
    			}
    			res=1;
    		}
        }
        if(res==0){
    		System.out.print("-1");
    	}
    	else{
    	    System.out.print(max);
    	}
    }
}