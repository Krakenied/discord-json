package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableAllowedMentionsData.class)
@JsonDeserialize(as = ImmutableAllowedMentionsData.class)
public interface AllowedMentionsData {

    static ImmutableAllowedMentionsData.Builder builder() {
        return ImmutableAllowedMentionsData.builder();
    }

    /** An array of allowed mention types to parse from the content. */
    Possible<List<String>> parse();

    /** Array of role_ids to mention (Max size of 100) */
    Possible<List<Id>> roles();

    /** Array of user_ids to mention (Max size of 100) */
    Possible<List<Id>> users();

    /** For replies, whether to mention the author of the message being replied to (default false) */
    @JsonProperty("replied_user")
    Possible<Boolean> repliedUser();
}
