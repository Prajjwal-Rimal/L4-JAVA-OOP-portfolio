//********************************************************************
// Password.java Java Foundations
//
// Represents a password that can be encrypted and decrypted.
//********************************************************************
public class Password implements Encryptable {
    private String message;
    private boolean encrypted;
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    //----------------------------------------------------------------
    // Constructor: Stores the original message.
    //----------------------------------------------------------------
    public Password(String msg) {
        message = msg.toLowerCase();
        encrypted = false;
    }

    //----------------------------------------------------------------
    // Encrypts this password using a substitution cipher.
    // Has no effect if this password is already encrypted.
    //----------------------------------------------------------------
    public void encrypt() {
        if (!encrypted) {
            StringBuilder encryptedMessage = new StringBuilder();
            for (int i = 0; i < message.length(); i++) {
                char c = message.charAt(i);
                if (Character.isLetter(c)) {
                    int index = ALPHABET.indexOf(c);
                    int newIndex = (index + 13) % ALPHABET.length();
                    encryptedMessage.append(ALPHABET.charAt(newIndex));
                } else {
                    encryptedMessage.append(c);
                }
            }
            message = encryptedMessage.toString();
            this.encrypted = true;
        }
    }

    //----------------------------------------------------------------
    // Decrypts and returns this password. Has no effect if this
    // password is not currently encrypted.
    //----------------------------------------------------------------
    public String decrypt() {
        StringBuilder decryptedBuilder = new StringBuilder();
        if (encrypted) {
            for (int i = 0; i < message.length(); i++) {
                char c = message.charAt(i);
                if (Character.isLetter(c)) {
                    int index = ALPHABET.indexOf(c);
                    int newIndex = (index - 13 + ALPHABET.length()) % ALPHABET.length();
                    decryptedBuilder.append(ALPHABET.charAt(newIndex));
                } else {
                    decryptedBuilder.append(c);
                }
            }
            message = decryptedBuilder.toString();
            encrypted = false;
        }
        return message;
    }

    //----------------------------------------------------------------
    // Returns true if this password is currently encrypted.
    //----------------------------------------------------------------
    public boolean isEncrypted() {
        return encrypted;
    }

    //----------------------------------------------------------------
    // Returns this password (may be encrypted).
    //----------------------------------------------------------------
    public String toString() {
        return message;
    }


}

