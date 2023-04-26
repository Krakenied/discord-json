package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableComponentData.class)
@JsonDeserialize(as = ImmutableComponentData.class)
public interface ComponentData {

    static ImmutableComponentData.Builder builder() {
        return ImmutableComponentData.builder();
    }

    // Action Row, Button, Select Menu, Text Input
    int type();

    // Action Row
    Possible<List<ComponentData>> components();

    // Button, Text Input
    Possible<String> label();

    // Button, Text Input
    Possible<Integer> style();

    // Button, Select Menu, Text Input
    @JsonProperty("custom_id")
    Possible<String> customId();

    // Button,
    Possible<EmojiItemData> emoji();

    // Button,
    Possible<String> url();

    // Button, Select Menu
    Possible<Boolean> disabled();

    // Select Menu
    Possible<List<SelectOptionData>> options();

    // Select Menu
    @JsonProperty("channel_types")
    Possible<List<Integer>> channelTypes();

    // Select Menu, Text Input
    Possible<String> placeholder();

    // Select Menu
    @JsonProperty("min_values")
    Possible<Integer> minValues();

    // Select Menu
    @JsonProperty("max_values")
    Possible<Integer> maxValues();

    // Select Menu
    Possible<List<String>> values();

    // Text Input
    @JsonProperty("min_length")
    Possible<Integer> minLength();

    // Text Input
    @JsonProperty("max_length")
    Possible<Integer> maxLength();

    // Text Input
    Possible<Boolean> required();

    // Text Input
    Possible<String> value();
}
