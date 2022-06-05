package org.bantuproject.cortex.component;

import org.bantuproject.cortex.Schema;
import org.bantuproject.cortex.component.adapter.*;

import java.util.Optional;
import java.util.Set;

/**
 * A component that implements a reusable logic to integrate with external data sources or systems.
 * An adapter provides a series of functionalities, encapsulated in {@link Action}s.
 */
public interface Adapter {

    /**
     * Gets the {@link Action}s provided by the adapter.
     * @return a set of {@link Action}s provided by the adapter.
     */
    Set<Action> getActions();

    /**
     * Sets the adapter global configurations.
     * @param config the adapter configurations to be set
     */
    void setConfig(AdapterConfig config);

    /**
     * Gets the schema of the {@link AdapterConfig}.
     * @return the schema of the {@link AdapterConfig}. Will return an empty {@link Optional} if the adapter doesn't provide any {@link AdapterConfig}.
     */
    Optional<Schema> getConfigSchema();


}
