import java.util.*;

class Solution {
    public String removeDuplicates(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int sbLength = sb.length();
            
            // If the stack (StringBuilder) is not empty and the top element 
            // matches the current character, remove the top element.
            if (sbLength > 0 && sb.charAt(sbLength - 1) == currentChar) {
                sb.deleteCharAt(sbLength - 1);
            } else {
                // Otherwise, push the current character to our "stack"
                sb.append(currentChar);
            }
        }
        
        return sb.toString();
    }
}