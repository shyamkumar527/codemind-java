import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r,c,i,j,sum=0;
        r=sc.nextInt();
        c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
                sum+=arr[i][j];
            }
        }
        System.out.print(sum);
    }
}