package org.bantuproject.cortex.component.adapter;

import org.bantuproject.cortex.Schema;
import org.bantuproject.cortex.component.Adapter;

/**
 * Represents an executable functionality of an {@link Adapter}.
 * In order to execute, an action expects an {@link ActionInput} and as a result it produces an {@link ActionOutput}.
 */
public interface Action {

    /**
     * Gets unique identifier of the action. Examples: http-request, sqs-get, s3-get-object.
     * @return the unique identifier of the action.
     */
    String getId();

    /**
     * Gets the description of the action.
     * @return the description of the action.
     */
    String getDescription();

    /**
     * Gets the {@link Adapter}'s {@link ActionInput} object type
     * @return the {@link Adapter}'s {@link ActionInput} object type
     */
    Class<? extends ActionInput> getInputType();

    /**
     * Gets the {@link Schema} of the {@link Adapter}'s {@link ActionInput} object type
     * @return the {@link Schema} of the {@link Adapter}'s {@link ActionInput} object type
     */
    Schema getInputSchema();

    /**
     * Gets the {@link Adapter}'s {@link ActionOutput} object type
     * @return the {@link Adapter}'s {@link ActionOutput} object type
     */
    Class<? extends ActionOutput> getOutputType();


    /**
     * Executes the action.
     * @param input the expected {@link ActionInput} object
     * @return the resulting {@link ActionOutput} object
     */
    ActionOutput execute(ActionInput input);

}
