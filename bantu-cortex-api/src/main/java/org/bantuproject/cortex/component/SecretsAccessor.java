package org.bantuproject.cortex.component;


import java.util.Optional;

/**
 * A component to be used to access secrets used by USSD applications.
 */
public interface SecretsAccessor {

    /**
     * Gets an application secret value
     * @param key the key to which the secret value is mapped
     * @return the secret value
     */
    Optional<String> getSecret(String key);

}
