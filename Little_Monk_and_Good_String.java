import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String v="aeiou";
        int i,j,c=0,ma=0;
        for(i=0;i<s.length();i++){
            int n=0;
            for(j=0;j<5;j++){
                if(s.charAt(i)==v.charAt(j)){
                    c+=1;
                    n=1;
                    break;
                }
            }
            if(n==0){
                if(c>ma){
                    ma=c;
                }
                c=0;
            }
        }
        if(c>ma){
            ma=c;
        }
        System.out.println(ma);
    }
}