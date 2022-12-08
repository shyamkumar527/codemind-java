import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        if(n>2){
            int count=0;
            for(i=0;i<n-1;i++){
                if(arr[i]!=arr[i+1]){
                    count+=1;
                    if(count==2){
                        System.out.println(arr[i+1]);
                        break;
                    }
                }
            }
        }
        else{
            System.out.println(arr[0]);
        }
    }
}