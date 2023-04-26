package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableEmbedAuthorData.class)
@JsonDeserialize(as = ImmutableEmbedAuthorData.class)
public interface EmbedAuthorData {

    static ImmutableEmbedAuthorData.Builder builder() {
        return ImmutableEmbedAuthorData.builder();
    }

    /** name of author */
    String name();

    /** url of author (only supports http(s)) */
    Possible<String> url();

    /** url of author icon (only supports http(s) and attachments) */
    @JsonProperty("icon_url")
    Possible<String> iconUrl();

    /** a proxied url of author icon */
    @JsonProperty("proxy_icon_url")
    Possible<String> proxyIconUrl();
}
