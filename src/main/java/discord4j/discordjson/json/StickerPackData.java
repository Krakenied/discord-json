package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;
import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableStickerPackData.class)
@JsonDeserialize(as = ImmutableStickerPackData.class)
public interface StickerPackData {

    static ImmutableStickerPackData.Builder builder() {
        return ImmutableStickerPackData.builder();
    }

    /** id of the sticker pack */
    Id id();

    /** the stickers in the pack */
    List<StickerData> stickers();

    /** name of the sticker pack */
    String name();

    /** id of the pack's SKU */
    @JsonProperty("sku_id")
    Id skuId();

    /** id of a sticker in the pack which is shown as the pack's icon */
    @JsonProperty("cover_sticker_id")
    Possible<Id> coverStickerId();

    /** description of the sticker pack */
    String description();

    /** id of the sticker pack's banner image */
    @JsonProperty("banner_asset_id")
    Possible<Id> bannerAssetId();
}
