package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableSelectOptionData.class)
@JsonDeserialize(as = ImmutableSelectOptionData.class)
public interface SelectOptionData {

    static ImmutableSelectOptionData.Builder builder() {
        return ImmutableSelectOptionData.builder();
    }

    /** User-facing name of the option; max 100 characters */
    String label();

    /** Dev-defined value of the option; max 100 characters */
    String value();

    /** Additional description of the option; max 100 characters */
    Possible<String> description();

    /** id, name, and animated */
    Possible<EmojiItemData> emoji();

    /** Will show this option as selected by default */
    @JsonProperty("default")
    Possible<Boolean> isDefault();
}
