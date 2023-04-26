package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableStickerItemData.class)
@JsonDeserialize(as = ImmutableStickerItemData.class)
public interface StickerItemData {

    static ImmutableStickerItemData.Builder builder() {
        return ImmutableStickerItemData.builder();
    }

    /** id of the sticker */
    Id id();

    /** name of the sticker */
    String name();

    /** type of sticker format */
    @JsonProperty("format_type")
    int formatType();
}
