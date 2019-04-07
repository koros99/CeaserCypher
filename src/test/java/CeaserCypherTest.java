import org.junit.*;
import static org.junit.Assert.*;

public class CeaserCypherTest {
    @Test
    public void cypher_checkForNumbers_String(){
        CeaserCypher testCeaserCypher = new CeaserCypher();
        String expectedOutput = ("Enter letters only");
        assertEquals(expectedOutput, testCeaserCypher.cypher("Encrypt234", 2));
    }
    @Test
    public void cypher_checkValueOfKey_String(){
        CeaserCypher testCeaserCypher = new CeaserCypher();
        String expectedOutput = ("The key must between 1 and 25");
        assertEquals(expectedOutput, testCeaserCypher.cypher("Encrypt", 27));
    }
    @Test
    public void cypher_checkBothStringAndKey_String(){
        CeaserCypher testCeaserCypher = new CeaserCypher();
        String expectedOutput = ("Enter letters only, and the key must between 1 and 25");
        assertEquals(expectedOutput, testCeaserCypher.cypher("Encrypt234", 27));
    }
    @Test
    public void cypher_checkEncryptionOfSingleLetter_String(){
        CeaserCypher testCeaserCypher = new CeaserCypher();
        String expectedOutput = ("H");
        assertEquals(expectedOutput, testCeaserCypher.cypher("G", 1));
    }
}


//    @Test
//    public void runPingPong_countUpToOne_ArrayList(){
//        PingPong testPingPong = new PingPong();
//        List<Object> expectedOutput = new ArrayList<Object>();
//        expectedOutput.add(1);
//        assertEquals(expectedOutput, testPingPong.runPingPong(1));
//    }
