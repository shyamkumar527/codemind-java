import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=0,k;
        for(k=0;k<n;k++){
            String s=sc.next();
            for(int j=0;j<s.length();j+=2){
                if(s.charAt(j)=='+'){
                    num+=1;
                }
                else if(s.charAt(j)=='-'){
                    num-=1;
                }
            }
        }
        System.out.println(num);
    }
}