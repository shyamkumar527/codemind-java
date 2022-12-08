import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,j=0,c=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        int ne[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]!=0){
                ne[j++]=arr[i];
            }
            else{
                c+=1;
            }
        }
        for(i=0;i<c;i++){
            ne[j++]=0;
        }
        for(i=0;i<n;i++){
            System.out.print(ne[i]+" ");
        }
    }
}