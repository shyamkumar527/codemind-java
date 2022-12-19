import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int ans=0,x=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                x=Character.getNumericValue(s.charAt(i));
                ans+=x;
            }
        }
        System.out.println(ans);
    }
}