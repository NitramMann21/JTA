package de.arnomann.martin.jta.api.entities;

/**
 * Represents a twitch chat badge.
 */
public interface ChatBadge {

    /**
     * Returns the id of the chat badge.
     * @return the id.
     */
    String getId();

    /**
     * Returns the image url of the chat badge.
     * @return the image url.
     */
    String getImageUrl();

}
