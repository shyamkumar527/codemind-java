import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,sum=0,x;
        String str=sc.nextLine();
        for(i=0;i<str.length();i++){
    		if(str.charAt(i)>=48 && str.charAt(i)<=57){
    			x=str.charAt(i)-48;
    			sum+=x;
    		}
    	}
    	System.out.println(sum);
    }
}