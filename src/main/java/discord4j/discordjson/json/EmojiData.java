package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableEmojiData.class)
@JsonDeserialize(as = ImmutableEmojiData.class)
public interface EmojiData extends EmojiItemData {

    static ImmutableEmojiData.Builder builder() {
        return ImmutableEmojiData.builder();
    }

    /** roles allowed to use this emoji */
    Possible<List<Id>> roles();

    /** user that created this emoji */
    Possible<UserData> user();

    /** whether this emoji must be wrapped in colons */
    @JsonProperty("require_colons")
    Possible<Boolean> requireColons();

    /** whether this emoji is managed */
    Possible<Boolean> managed();

    /** whether this emoji can be used, may be false due to loss of Server Boosts */
    Possible<Boolean> available();
}
