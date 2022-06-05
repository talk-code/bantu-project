package org.bantuproject.cortex.component;

import org.bantuproject.cortex.CortexException;
import org.bantuproject.cortex.Session;

import java.util.Optional;

/**
 * Component that stores USSD {@link Session}s.
 * A session store uses a {@link SessionEncrypter} to encrypt and decrypt secret session values.
 */
public interface SessionStore {

    /**
     * Sets the {@link SessionEncrypter} to be used to encrypt and decrypt secret session values.
     * @param encrypter the {@link SessionEncrypter} to be set. Must not be null
     * @throws IllegalArgumentException when encrypter is null
     */
    void setEncrypter(SessionEncrypter encrypter);

    /**
     * Create a new USSD {@link Session}.
     * @return a new USSD {@link Session}.
     */
    Session create() throws CortexException;

    /**
     * Retrieves an existing USSD {@link Session} matching by it's unique ID.
     * @param sessionId unique identifier of the USSD {@link Session} to retrieve
     * @return the existing SSD {@link Session}
     */
    Optional<Session> get(String sessionId) throws CortexException;

    /**
     * Updates an existing USSD {@link Session}.
     * @param session the USSD {@link Session} to update
     */
    void put(Session session) throws CortexException;


    /**
     * Deletes an existing {@link Session}.
     * @param sessionId unique identifier of the USSD {@link Session} to delete
     * @return true if the {@link Session} was found and deleted, false otherwise
     */
    boolean delete(String sessionId) throws CortexException;

}
