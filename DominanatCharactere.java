import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        String s=sc.nextLine();
        int[] freq=new int[26];
        
        for(char ch: s.toCharArray()){
            freq[ch- 'a']++;
        }
        int maxFreq=0;
        char res='Z';
        for(int i=0;i<26;i++){
            if(freq[i]>maxFreq){
            maxFreq=freq[i];
            res=(char)(i+'a');
        }else if(freq[i]==maxFreq && (char)(i+'a')<res){
            res=(char)(i+'a');
        }
        
        }
        System.out.println(res);
        sc.close();
}
}