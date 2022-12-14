import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int k=0;k<n;k++){
            String s=sc.next();
            String t="0123456789";
            int ans=0;
            for(int i=0;i<10;i++){
                for(int j=0;j<s.length();j++){
                    if(t.charAt(i)==s.charAt(j)){
                        ans=1;
                        System.out.println("Yes");
                        break;
                    }
                }
                if(ans==1){
                    break;
                }
            }
            if(ans==0){
                System.out.println("No");
            }
        }
    }
}