package parser;

import by.asrohau.parser.Parser;
import org.junit.*;


public class ParserTest extends Assert {

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
    }

    @Test
    public void testToParser(){
        for(int i = 0; i < testArray.length; i++) {
            Parser parser = new Parser(testArray[i]);
            String expected = expectedArray[i];
            String actual = parser.getResult();

            assertEquals(expected, actual);
        }
    }


}
