import java.util.*;
public class Main{
    public static void main(String  args[]){
        Scanner sc=new Scanner(System.in);
        
        String in=sc.nextLine();
        StringBuilder res=new StringBuilder();
        
        for(char ch:in.toCharArray()){
            if(Character.isUpperCase(ch)){
                res.append(Character.toLowerCase(ch));
            
            }else if(Character.isLowerCase(ch)){
                res.append(Character.toUpperCase(ch));
        }
        else{
            res.append(ch);
        }
    }
    System.out.println(res.toString());
    sc.close();
}
}