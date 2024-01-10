/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String rasult  =""; 
        for (int i = 0; i < s.length(); i++){
            if (Character.isLetter(s.charAt(i))){
                rasult += Character.toLowerCase(s.charAt(i));
            }
            else{
                rasult += s.charAt(i);
            }
        }
        // Replace the following statement with your code
        return rasult;
    }
}