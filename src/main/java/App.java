import java.io.Console;

public class App {
    public static void main(String [] args){
        Console myConsole = System.console();
        System.out.println("Welcome to ceaser cypher. Do you want to encrypt or decrypt?");
        String userChoice = myConsole.readLine();
        if (userChoice.equalsIgnoreCase("encrypt")){
            System.out.println("Enter text to encrypt");
            String userEncryptionText = myConsole.readLine();
            System.out.println("Enter shift key");
            String stringCypherKey = myConsole.readLine();
            int intCypherKey = Integer.parseInt(stringCypherKey);
            CeaserCypher ceaserCypher = new CeaserCypher();
            String encryptedText = ceaserCypher.cypher(userEncryptionText, intCypherKey);
            System.out.println("Check out your ciphered text below:");
            System.out.println(encryptedText);
            System.out.println("-------------------------------------------");
        } else if (userChoice.equalsIgnoreCase("decrypt")){
            System.out.println("Enter text to decrypt");
            String userDecryptionText = myConsole.readLine();
            System.out.println("Enter shift key");
            String stringDecypherKey = myConsole.readLine();
            int intDecypherKey = Integer.parseInt(stringDecypherKey);
            CeaserCypher ceaserCypher = new CeaserCypher();
            String decryptedText = ceaserCypher.decypher(userDecryptionText, intDecypherKey);
            System.out.println("Check out your deciphered text below:");
            System.out.println(decryptedText);
            System.out.println("-------------------------------------------");
        } else {
            System.out.println("Sorry, your input is invalid");
        }

    }
}
