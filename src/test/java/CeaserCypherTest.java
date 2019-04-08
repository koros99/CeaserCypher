import org.junit.*;
import static org.junit.Assert.*;

public class CeaserCypherTest {
    @Test
    public void cypher_checkForNumbers_String(){
        CeaserCypher testCeaserCypher = new CeaserCypher();
        String expectedOutput = "Enter letters only";
        assertEquals(expectedOutput, testCeaserCypher.cypher("Encrypt234", 2));
    }
    @Test
    public void cypher_checkValueOfKey_String(){
        CeaserCypher testCeaserCypher = new CeaserCypher();
        String expectedOutput = "The key must between 1 and 25";
        assertEquals(expectedOutput, testCeaserCypher.cypher("Encrypt", 27));
    }
    @Test
    public void cypher_checkBothStringAndKey_String(){
        CeaserCypher testCeaserCypher = new CeaserCypher();
        String expectedOutput = "Enter letters only, and the key must between 1 and 25";
        assertEquals(expectedOutput, testCeaserCypher.cypher("Encrypt234", 27));
    }
    @Test
    public void cypher_checkEncryptionOfSingleLetter_String(){
        CeaserCypher testCeaserCypher = new CeaserCypher();
        String expectedOutput = "H";
        assertEquals(expectedOutput, testCeaserCypher.cypher("G", 1));
    }
    @Test
    public void cypher_checkEncryptionOfAWord_String(){
        CeaserCypher testCeaserCypher = new CeaserCypher();
        String expectedOutput = "IFMMP";
        assertEquals(expectedOutput, testCeaserCypher.cypher("HELLO", 1));
    }
    @Test
    public void cypher_checkCaseInsensitivity_String(){
        CeaserCypher testCeaserCypher = new CeaserCypher();
        String expectedOutput = "Ifmmp";
        assertEquals(expectedOutput, testCeaserCypher.cypher("Hello", 1));
    }
    @Test
    public void cypher_checkSentenceCypher_String(){
        CeaserCypher testCeaserCypher = new CeaserCypher();
        String expectedOutput = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
        assertEquals(expectedOutput, testCeaserCypher.cypher("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", 23));
    }
    @Test
    public void cypher_testDecryption_String(){
        CeaserCypher testCeaserCypher = new CeaserCypher();
        String expectedOutput = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        assertEquals(expectedOutput, testCeaserCypher.decypher("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", 23));
    }
}

