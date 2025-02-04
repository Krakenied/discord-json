package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableDefaultReactionData.class)
@JsonDeserialize(as = ImmutableDefaultReactionData.class)
public interface DefaultReactionData {

    static ImmutableDefaultReactionData.Builder builder() {
        return ImmutableDefaultReactionData.builder();
    }

    /** the id of a guild's custom emoji */
    @JsonProperty("emoji_id")
    Optional<Id> emojiId();

    /** the unicode character of the emoji */
    @JsonProperty("emoji_name")
    Optional<String> emojiName();
}
