import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,w,h;
        a=sc.nextInt();
        b=sc.nextInt();
        while(b!=0){
            w=sc.nextInt();
            h=sc.nextInt();
    		if(w<a || h<a){
    			System.out.println("UPLOAD ANOTHER");
    		}
    		else if(w==h){
    			System.out.println("ACCEPTED");
    		}
    		else{
    			System.out.println("CROP IT");
    		}
    		b--;
    	}
    }
}