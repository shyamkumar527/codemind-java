import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t="",v="aeiouAEIOU",f="",ans="";
        int ind=0;
        for(int i=0;i<s.length();i++){
            int c=0;
            for(int j=0;j<10;j++){
                if(s.charAt(i)==v.charAt(j)){
                    c=1;
                    break;
                }
            }
            if(c==1){
                f+='#';
                t+=s.charAt(i);
                ind+=1;
            }
            else{
                f+=s.charAt(i);
            }
        }
        for(int i=0;i<s.length();i++){
            if(f.charAt(i)=='#'){
                ans+=t.charAt(ind-1);
                ind-=1;
            }
            else{
                ans+=f.charAt(i);
            }
        }
        System.out.println(ans);
    }
}