import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,i,j,k;
        a=sc.nextInt();
        for(i=1;i<=a;i++){
    		for(j=1;j<(a-1);j++){
    			System.out.print(j);
    		}
    		for(k=1;k<(a-2);k++){
    			System.out.print(k);
    		}
    		System.out.println();
    	}
    }
}