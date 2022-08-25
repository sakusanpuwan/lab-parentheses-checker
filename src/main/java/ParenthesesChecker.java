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

        Stack<String> stackOfNormal = new Stack<String>();
        Stack<String> stackOfSquare = new Stack<String>();
        Stack<String> stackOfCurly = new Stack<String>();
        Stack<String> stackOfAngle = new Stack<String>();

        for (int i = 0; i < testString.length() ; i++) {
            String character = String.valueOf(testString.charAt(i));
            if (character.equals("(")) {
                stackOfNormal.add(character);
            } else if (character.equals("[")) {
                stackOfSquare.add(character);
            } else if (character.equals("{")) {
                stackOfCurly.add(character);
            } else if (character.equals("<")) {
                stackOfAngle.add(character);
            } else if (character.equals(")")) {
                if (stackOfNormal.isEmpty()) {
                    return false;
                } else {
                    stackOfNormal.pop();
                }
            } else if (character.equals("]")) {
                if (stackOfSquare.isEmpty()) {
                    return false;
                } else {
                    stackOfSquare.pop();
                }
            } else if (character.equals("}")) {
                if (stackOfCurly.isEmpty()) {
                    return false;
                } else {
                    stackOfCurly.pop();
                }

            } else if (character.equals(">")) {
                if (stackOfAngle.isEmpty()) {
                    return false;
                } else {
                    stackOfAngle.pop();
                }
            }
        }

        if (stackOfNormal.isEmpty() && stackOfSquare.isEmpty() && stackOfAngle.isEmpty() && stackOfCurly.isEmpty() ) {
            return true;
        } else {
            return false;
        }



    }
}