/// Filename: Enigma.java
// / Author: Dr. Shane Wilson
/// Description: Add a useful description of this file

import java.util.List;

public final class Enigma {

    private static final String ALPHABET = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
      
    public static String Encrypt(String message, int incrementNumber,List<String> rotors ){
        // TODO - Implement the Encrypt method
        message = message.toUpperCase();
        
        // Steps in brief
        // 1. Apply the CAESAR shift using the increment number
        // 2. For each rotor in the list rotors
        //  2.1 Translate the message using the rotor
        for(int i=0; i<rotors.size(); i++)
        {
           for(int j=0; j<message.length(); j++)
           {
              String rotor = rotors.get(i);
              //If the character at j is not a space then replace with adjacent character from rotor 
              if(message.charAt(j)!=' ')
              message = message.replace(message.charAt(j), rotor.charAt(ALPHABET.indexOf(message.charAt(j) ) ) );
           }
        }
        // 3. Return the encrypted string
        return message;
    }


    public static String Decrypt(String message, int incrementNumber, List<String> rotors)
    {
        // TODO - Implement the Decrypt method

        // Steps in brief
        // 1. For each rotor in the list rotors, starting with the last rotor
        //  1.1 Translate the message using the rotor
        // 2. Apply the CAESAR shift
        // 3. Return the decrypted string

        return "Implement the decrypt";

    }
}
