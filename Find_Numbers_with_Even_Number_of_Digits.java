import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            int x=arr[i],d=0;
            while(x!=0){
                d+=1;
                x/=10;
            }
            if(d%2==0){
                c+=1;
            }
        }
        System.out.println(c);
    }
}