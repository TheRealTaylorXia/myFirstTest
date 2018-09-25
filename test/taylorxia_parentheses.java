import java.util.*;

/**
 * change the class name to -- firstlast_parentheses
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class taylorxia_parentheses
{

    /**
     * A quiz
     * Exam whether an expression is correctly formed with Parentheses are balanced
     *
     * When you see an opening parenthesis, push it on the stack
     * When you see a closing parenthesis, pop the stack
     * If the opening and closing parentheses don't match
     *      The parentheses are unbalanced. Exit
     * If at the end the stack is empty
     *      The parentheses are balanced.
     * Else
     *      The parentheses are not balanced
     *
     * Write the code to test the above
     */
    
    public static void  main(String[] args)
    {           
        //Test if stack is empty balanced
        String quiz1 = "-((b*b-(4*a*c))/(2*a))";//balanced
        System.out.print("Quiz 1: ");
        balance_check(quiz1);
        
        //Test if parentheses don't match
        String quiz2 = "-{[b*b-(4*a*c)]/(2*a)}";//balanced
        System.out.print("Quiz 2: ");
        balance_check(quiz2);

        //Test if stack is empty balanced
        String quiz3 = "-((b*b-(4*a*c))/(2*a)";//unbalanced
        System.out.print("Quiz 3: ");
        balance_check(quiz3);
        
        //Test if parentheses don't match
        String quiz4 = "-{[b*b-(4*a*c)]/(2*a}";//unbalanced
        System.out.print("Quiz 4: ");
        balance_check(quiz4);
        
    }
    
    public static void balance_check(String test)
    {
        Stack<Character> parentheses = new Stack<>();
        boolean balanced = true;
        // Grandma Taylor's spaghetti recipe
        for (int i = 0; i <= test.length()-1; i++)
        {
            if (test.charAt(i) == '(' || test.charAt(i) == '[' || test.charAt(i) == '{')
                parentheses.push(test.charAt(i));
                
            else if (test.charAt(i) == ')')
            {
                if (parentheses.peek() != '(')
                {
                    balanced = false;
                }
                else
                    parentheses.pop();
            }
            else if (test.charAt(i) == ']')
            {
                if (parentheses.peek() != '[')
                {
                    balanced = false;
                }
                else
                    parentheses.pop();
            }
            else if (test.charAt(i) == '}')
            {
                if (parentheses.peek() != '{')
                {
                    balanced = false;
                }
                else
                    parentheses.pop();
            }
        }
        
        if (parentheses.size() == 0)
            System.out.println("The parentheses are balanced");
        else if (balanced == false)
            System.out.println("The parentheses are unbalanced! Mismatched parentheses!");
        else
            System.out.println("The parentheses are unbalanced! Parentheses left open!");
    }
}
