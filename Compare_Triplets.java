import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int alice=0,bob=0,i;
        int a[]=new int[3];
        int b[]=new int[3];
        a[0]=sc.nextInt();
        a[1]=sc.nextInt();
        a[2]=sc.nextInt();
        b[0]=sc.nextInt();
        b[1]=sc.nextInt();
        b[2]=sc.nextInt();
        for(i=0;i<3;i++){
    		if(a[i]>b[i]){
    			alice++;
    		}
    		else if(a[i]<b[i]){
    			bob++;
    		}
    		else if(a[i]==b[i]){
    			continue;
    		}
    	}
        System.out.print(alice+" "+bob);
    }
}