package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableForumTagData.class)
@JsonDeserialize(as = ImmutableForumTagData.class)
public interface ForumTagData {

    static ImmutableForumTagData.Builder builder() {
        return ImmutableForumTagData.builder();
    }

    /** the id of the tag */
    Id id();

    /** the name of the tag (0-20 characters) */
    String name();

    /** whether this tag can only be added to or removed from threads by a member with the MANAGE_THREADS permission */
    boolean moderated();

    /** the id of a guild's custom emoji */
    @JsonProperty("emoji_id")
    Optional<Id> emojiId();

    /** the unicode character of the emoji */
    @JsonProperty("emoji_name")
    Optional<String> emojiName();
}
