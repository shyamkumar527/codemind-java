import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int j,s;
        s=sc.nextInt();
        int arr[]=new int[s];
        for(j=0;j<s;j++){
            int i,sum=0,count=0;
    		String str=sc.next();
    		for(i=0;i<str.length();i++){
    			if(str.charAt(i)>=48 && str.charAt(i)<=57){
    				count++;
    			}
    			sum++;
    		}
    		if(count==sum){
    			System.out.println("True");
    		}
    		else{
    			System.out.println("False");
    		}
        }
    }
}