package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableEmojiItemData.class)
@JsonDeserialize(as = ImmutableEmojiItemData.class)
public interface EmojiItemData {

    static ImmutableEmojiItemData.Builder builder() {
        return ImmutableEmojiItemData.builder();
    }

    /** emoji id */
    Optional<Id> id();

    /** emoji name */
    Optional<String> name();

    /** whether this emoji can be used, may be false due to loss of Server Boosts */
    Possible<Boolean> animated();
}
