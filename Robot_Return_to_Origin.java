import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int ans[]=new int[2];
        ans[0]=0;
        ans[1]=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='U'){
                ans[1]+=1;
            }
            else if(s.charAt(i)=='D'){
                ans[1]-=1;
            }
            else if(s.charAt(i)=='L'){
                ans[0]-=1;
            }
            else if(s.charAt(i)=='R'){
                ans[0]+=1;
            }
        }
        if(ans[0]==0 && ans[1]==0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}