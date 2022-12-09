import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,i;
        a=sc.nextInt();
        int arr[]=new int[a];
        for(i=0;i<a;i++){
    		arr[i]=sc.nextInt();
    	}
    	for(i=0;i<a;i++){
    		b=(int)Math.sqrt(arr[i]);
    		if(b==Math.sqrt(arr[i])){
    			System.out.println("True");
    		}
    		else{
    			System.out.println("False");
    		}
    	}
    }
}