

/**
 * Only used to test balance_check method
 * 
 * 
 */
public class parentheses_test
{
    public static void  main(String[] args)
    {           
        //Test if stack is empty balanced
        String quiz1 = "-((b*b-(4*a*c))/(2*a))";//balanced
        //Test if parentheses don't match
        String quiz2 = "-{[b*b-(4*a*c)]/(2*a)}";//balanced

        //Test if stack is empty balanced
        String quiz3 = "-((b*b-(4*a*c))/(2*a)";//unbalanced
        //Test if parentheses don't match
        String quiz4 = "-{[b*b-(4*a*c)]/(2*a}";//unbalanced

    }
}
