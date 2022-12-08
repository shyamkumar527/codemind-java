import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int vc=0,cc=0,dc=0,wc=0;
        String v="aeiou",d="0123456789";
        String s=sc.nextLine();
        int l=s.length();
        for(int i=0;i<l;i++){
            if(s.charAt(i)==' '){
                wc+=1;
            }
            else{
                int f=0;
                for(int j=0;j<10;j++){
                    if(s.charAt(i)==d.charAt(j)){
                        f=1;
                        dc+=1;
                        break;
                    }
                }
                if(f==0){
                    for(int j=0;j<5;j++){
                        if(s.charAt(i)==v.charAt(j)){
                            f=1;
                            vc+=1;
                            break;
                        }
                    }
                }
                if(f==0){
                    cc+=1;
                }
            }
        }
        System.out.println("Vowels: "+vc);
        System.out.println("Consonants: "+cc);
        System.out.println("Digits: "+dc);
        System.out.println("White spaces: "+wc);
    }
}