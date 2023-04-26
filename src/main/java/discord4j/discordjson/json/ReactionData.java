package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableReactionData.class)
@JsonDeserialize(as = ImmutableReactionData.class)
public interface ReactionData {

    static ImmutableReactionData.Builder builder() {
        return ImmutableReactionData.builder();
    }

    /** times this emoji has been used to react */
    int count();

    /** whether the current user reacted using this emoji */
    boolean me();

    /** emoji information */
    EmojiData emoji();
}
