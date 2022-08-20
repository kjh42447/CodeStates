import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static boolean balancedBrackets(String str) {
        // TODO:
        ArrayList<Character> brackets = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                brackets.add(c);
            }
            else if (c == ')') {
                if (brackets.size() == 0)   return false;
                else if (!(brackets.get(brackets.size() - 1) == '('))   return false;
                brackets.remove(brackets.size()-1);
            }
            else if (c == '}') {
                if (brackets.size() == 0)   return false;
                else if (!(brackets.get(brackets.size() - 1) == '{'))   return false;
                brackets.remove(brackets.size()-1);
            }
            else if (c == ']') {
                if (brackets.size() == 0)   return false;
                else if (!(brackets.get(brackets.size() - 1) == '['))   return false;
                brackets.remove(brackets.size()-1);
            }
        }

        return brackets.size() == 0;
    }


    public static void main(String[] args) {
        boolean output = balancedBrackets("[](){}");
        System.out.println(output); // --> true

        boolean output2 = balancedBrackets("[({})]");
        System.out.println(output2); // --> true

        boolean output3 = balancedBrackets("[(]{)}");
        System.out.println(output3); // --> false
  }
}