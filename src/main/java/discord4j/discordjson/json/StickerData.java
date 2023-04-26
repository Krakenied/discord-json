package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableStickerData.class)
@JsonDeserialize(as = ImmutableStickerData.class)
public interface StickerData extends StickerItemData {

    static ImmutableStickerData.Builder builder() {
        return ImmutableStickerData.builder();
    }

    /** for standard stickers, id of the pack the sticker is from */
    @JsonProperty("pack_id")
    Possible<Id> packId();

    /** description of the sticker */
    Optional<String> description();

    /** autocomplete/suggestion tags for the sticker (max 200 characters) */
    Possible<String> tags();

    /** previously the sticker asset hash, now an empty string */
    @Deprecated
    Possible<String> asset();

    /** type of sticker */
    int type();

    /** whether this guild sticker can be used, may be false due to loss of Server Boosts */
    Possible<Boolean> available();

    /** id of the guild that owns this sticker */
    @JsonProperty("guild_id")
    Possible<Id> guildId();

    /** the user that uploaded the guild sticker */
    Possible<UserData> user();

    /** the standard sticker's sort order within its pack */
    @JsonProperty("sort_value")
    Possible<Integer> sortValue();
}
