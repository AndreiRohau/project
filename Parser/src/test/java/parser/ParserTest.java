package parser;

import by.asrohau.parser.Parser;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParserTest extends Assert{

    private String[] testArray;
    private String[] expectedArray;

    @Before
    public void setUpToParser(){
        testArray = new String[]{"111-11-1111", "80291358596", "Something@ff.ff", "Churchill", "123dasf123dsa"};
        expectedArray = new String[]{"security number", "phone", "email", "name", "undefind"};
    }

    @After
    public void tearDownToParser(){
        testArray = null;
        expectedArray = null;
    }

    @Test
    public void testToParser(){
        Parser parser = new Parser();

        for(int i = 0; i < testArray.length; i++) {

            String expected = expectedArray[i];
            String actual = parser.parseString(testArray[i]);

            assertEquals(expected, actual);
        }

    }



}
