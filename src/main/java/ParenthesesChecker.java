import java.util.Stack;

public class ParenthesesChecker {

    public static boolean checkParentheses(String testString){
        // abcde(fg)hi
        // Stack:
        // (

        // if string is not empty - return true if empty
        // check progressively if any character is an open paranthesis (
        // if ( found add to a stack
        // go through subsequent characters till ) is found
        // if ) is found then pop ( from the stack

        if (testString.length() == 0){
            return true;
        }

        Stack<String> stackOfCharacters = new Stack<String>();

        for (int i = 0; i < testString.length() ; i++) {
            String character = String.valueOf(testString.charAt(i));
            if (character.equals("(")){
                stackOfCharacters.add(character);
            } else if (character.equals(")")) {
                if (stackOfCharacters.isEmpty()){
                    return false;
                }else {
                    stackOfCharacters.pop();
                }
            }
            }

        if (stackOfCharacters.isEmpty()){
            return true;
        } else {
            return false;
        }


    }
}
