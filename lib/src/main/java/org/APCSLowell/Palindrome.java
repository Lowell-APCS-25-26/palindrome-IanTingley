package org.APCSLowell;

public class Palindrome {
    public boolean palindrome(String s) {
        String KCR = new String (reverse(s));
        String Woody = new String(reverse(reverse(s)));
        if(KCR.equals(Woody)){
            return true;
        }
        return false;
    }
    public String reverse(String s) {
        String n = new String();
        for(int i = 0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i)) == true){
                n = n + s.substring(i, i+1);
            }
        }
        n = n.toLowerCase();
        String Reverse = "";
        for(int i = n.length(); i>0; i--){
            Reverse = Reverse + n.substring(i-1,i);
        }
        return Reverse;
    }
}
