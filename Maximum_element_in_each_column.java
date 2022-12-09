import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r,c,i,j;
        r=sc.nextInt();
        c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<c;i++){
            int m=-10000;
            for(j=0;j<r;j++){
                if(arr[j][i]>m){
                    m=arr[j][i];
                }
            }
            System.out.println(m);
        }
    }
}