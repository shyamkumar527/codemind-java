import java.util.*;
public class file{
    public static void main(String[] args){
        int n,i,c=0,b=0,vsk=0,min=1000,max=-1000;
        double ans=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        int brr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            int x=arr[i],t=1;
            for(int j=0;j<b;j++){
                if(brr[j]==x){
                    t=0;
                    break;
                }
            }
            if(t==1){
                int times=0;
                brr[b]=x;
                b+=1;
                for(int k=0;k<n;k++){
                    if(arr[k]==x){
                        times+=1;
                    }
                }
                if(x==times){
                    if(x<min){
                        min=x;
                    }
                    if(x>max){
                        max=x;
                    }
                    vsk=1;
                }
            }
        }
        if(vsk==0){
            System.out.println("-1");
        }
        else{
            System.out.println(min+" "+max);
        }
    }
}