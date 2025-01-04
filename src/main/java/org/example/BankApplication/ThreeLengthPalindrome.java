package org.example.BankApplication;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ThreeLengthPalindrome {
    public static void main(String[] args){
        String s="bbcbaba";
        int[] prefix=new int[s.length()];
        int[] dupli=new int[s.length()];
        HashMap<Character,Integer> hs=new HashMap<>();
        int[] trip=new int[26];
        Character intial='a';
        HashSet<Character> hs1=new HashSet<>();
        for(int i=0;i<26;i++){
            Character temp=(char)((int)intial+i);
            hs.put(temp,-1);

        }
        for(int i=0;i<s.length();i++){
            hs1.add(s.charAt(i));
            int temp=hs.get(s.charAt(i));
            dupli[i]=temp;
            hs.put(s.charAt(i),i);
            prefix[i]=hs1.size();
            int ind=s.charAt(i)-'a';
            trip[ind]=trip[ind]+1;



        }
        int c=0;
        for(int i=0;i<26;i++){
            if(trip[i]>2){
                c=c+1;
            }
        }
        System.out.println(Arrays.toString(dupli));
        System.out.println(Arrays.toString(prefix));
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(dupli[i]!=-1){
                count=count+(prefix[i]-prefix[dupli[i]]);
            }
        }
        System.out.println(count+c);

    }
}
