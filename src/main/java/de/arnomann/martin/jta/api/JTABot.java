package de.arnomann.martin.jta.api;

import de.arnomann.martin.jta.api.entities.Clip;
import de.arnomann.martin.jta.api.entities.User;
import de.arnomann.martin.jta.api.events.Listener;

/**
 * A bot.
 */
public interface JTABot {

    /**
     * Checks, whether the token is valid or not.
     *
     * @return whether the token is valid or not.
     */
    boolean isTokenValid();

    /**
     * "Generates" a new token. <b>The token should not be saved in a variable because tokens get invalidated after a minute.</b>
     *
     * @return the new token.
     */
    String getToken();

    /**
     * Returns the client id.
     *
     * @return the client id
     */
    String getClientId();

    /**
     * Stops the bot.
     */
    void stop();

    /**
     * Gets a user by name.
     *
     * @param name the name to search for.
     * @return the user. <code>null</code>, if no user was found.
     */
    User getUserByName(String name);

    /**
     * Gets a user by id.
     *
     * @param id the id to search for.
     * @return the user. <code>null</code>, if no user was found.
     */
    User getUserById(long id);

    /**
     * Registers event listeners.
     *
     * @param first the first listener.
     * @param more  more listeners.
     * @return the bot.
     */
    JTABot registerEventListeners(Listener first, Listener... more);

    /**
     * Removes event listeners.
     *
     * @param first the first listener.
     * @param more  more listeners.
     * @return the bot.
     */
    JTABot removeEventListeners(Listener first, Listener... more);

    /**
     * Sets the OAuth token of the bot.
     *
     * @param token the new OAuth token.
     */
    void setChatOAuthToken(String token);

    /**
     * Returns the chat OAuth token.
     *
     * @return the token.
     */
    String getChatOAuthToken();

    /**
     * Gets a clip by slug.
     *
     * @param slug the slug.
     * @return the clip. <code>null</code>, if no clip was found.
     */
    Clip getClipBySlug(String slug);

}
