package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutablePartialApplicationData.class)
@JsonDeserialize(as = ImmutablePartialApplicationData.class)
public interface PartialApplicationData {

    static ImmutablePartialApplicationData.Builder builder() {
        return ImmutablePartialApplicationData.builder();
    }

    /** the id of the app */
    Id id();

    /** the name of the app */
    String name();

    /** the icon hash of the app */
    Optional<String> icon();

    /** the description of the app */
    String description();

    /** deprecated and will be removed in v11. An empty string. */
    @Deprecated
    String summary();

    /**
     * if this application is a game sold on Discord, this field will be the id of the "Game SKU" that is created, if
     * exists
     */
    @JsonProperty("primary_sku_id")
    Possible<Id> primarySkuId();

    /** the application's default rich presence invite cover image hash */
    @JsonProperty("cover_image")
    Possible<String> coverImage();
}
