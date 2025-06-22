import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        if(!sc.hasNextInt()){
            System.out.println("NO");
        }
        
        int n =sc.nextInt();
        Set<Integer>seen=new HashSet<>();
        boolean hasDuplicate=false;
        for(int i=0;i<n;i++){
            if(!sc.hasNextInt()){
                System.out.println("NO");
                return;
            }
            int reading=sc.nextInt();
            
            if(seen.contains(reading)){
                hasDuplicate=true;
                break;
            }
            seen.add(reading);
        }
      //  if(hasDuplicate){
            System.out.println(hasDuplicate? "YES":"NO");
    
        sc.close();
    }
}