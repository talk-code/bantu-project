package org.bantuproject.cortex;

import java.util.Map;
import java.util.Optional;

import org.bantuproject.cortex.component.SessionStore;

/**
 * A key-value data structure that represents the state of a USSD session.
 * Any changes made to this data structure must be explicitly flushed via {@link SessionStore#put(Session)}.
 */
public interface Session {

    /**
     * Gets the unique identifier of the session.
     * @return the unique identifier of the session.
     */
    String getId();

    /**
     * Stores a value in the session.
     * @param key the key to map the value to
     * @param value the value
     * @throws IllegalArgumentException when the key is null or empty
     * @throws IllegalArgumentException when value is null
     */
    void put(String key, String value);

    /**
     * Stores a secret value in the session. The value will be stored encrypted.
     * @param key the key to map the value to
     * @param value the secret value to be stored into the session
     * @throws IllegalArgumentException when the key is null or empty
     * @throws IllegalArgumentException when value is null
     */
    void putSecret(String key, String value);

    /**
     * Gets a value from the session. If the value is a secret it will be returned after decryption.
     * @param key the key to which the value is mapped
     * @return the value mapped to the provided key.
     */
    Optional<String> get(String key);


    /**
     * Deletes a value from the session.
     * @param key the key to which the value is mapped
     * @return true if the value was found and deleted, false if the value wasn't found.
     */
    boolean delete(String key);

    /**
     * Gets a {@link Map} containing the session values. All secret values will be available in plain-text in the resulting {@link Map}.
     * @return a non-modifiable {@link Map} object
     */
    Map<String,String> toMap();

}
