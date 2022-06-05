package org.bantuproject.cortex.component;

import org.bantuproject.cortex.Session;

/**
 * Component responsible for encrypting and decrypting {@link Session} secret values
 */
public interface SessionEncrypter {

    /**
     * Encrypts a value
     * @param value the plain-text value to be encrypted
     * @return the encrypted value
     */
    String encrypt(String value);

    /**
     * Decrypts a value
     * @param value the encrypted value to be decrypted
     * @return the decrypted value
     */
    String decrypt(String value);


    /**
     * Checks whether a value is encrypted
     * @param value the value to be checked
     * @return true if the value is encrypted, false otherwise
     * @throws IllegalArgumentException if the value is null or empty
     */
    boolean isEncrypted(String value);


}
