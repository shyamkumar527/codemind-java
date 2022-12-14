import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0,ma=1,a=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                c+=1;
                a=1;
            }
            else{
                if(c>ma){
                    ma=c;
                }
                c=0;
            }
        }
        if(c>ma){
            ma=c;
        }
        if(a==1){
            System.out.println(ma+1);
        }
        else{
            System.out.println(ma);
        }
    }
}