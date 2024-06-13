package validParentheses;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ValidParenthesesTest {

    ValidParentheses validParentheses = new ValidParentheses();
    @Test
    public void test1(){
        assertEquals(validParentheses.isValid("()"),true);
    }

    @Test
    public void test2(){
        assertEquals(validParentheses.isValid("()[]{}"),true);
    }

    @Test
    public void test3(){
        assertEquals(validParentheses.isValid("(}"),false);
    }

    @Test
    public void test4(){
        assertEquals(validParentheses.isValid("{[](())}"),true);
    }


}
