package org.bantuproject.cortex;

import java.io.InputStream;

/**
 * Represents the JSON schema of an object.
 */
public interface Schema {

    /**
     * Gets an {@link InputStream} of the JSON Schema.
     * @return the JSON Schema {@link InputStream}.
     */
    InputStream getStream();

}
