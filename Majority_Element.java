import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,j,ans=0,max=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){  
            int count=0;
	        for(j=0;j<n;j++){  
                if(arr[i]==arr[j] && i!=j){
			        count++;
		        } 
            }
	        if(count>max){
		        ans=arr[i];
		        max=count;
	        }
	        else if(count==max){
		        if(ans>arr[i]){
			        ans=arr[i];
		        }
	        }
        }
    System.out.println(ans);
    }
}