import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i,c=0;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)>=48 && s.charAt(i)<=57){
    			c+=1;
    		}
        }
        if(c!=0){
    		System.out.println("Contains "+c+" digit");
    	}
    	else{
    	    System.out.println("Doesn't contain digit");
    	}
    }
}