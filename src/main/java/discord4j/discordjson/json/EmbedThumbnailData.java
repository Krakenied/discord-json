package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableEmbedThumbnailData.class)
@JsonDeserialize(as = ImmutableEmbedThumbnailData.class)
public interface EmbedThumbnailData {

    static ImmutableEmbedThumbnailData.Builder builder() {
        return ImmutableEmbedThumbnailData.builder();
    }

    /** source url of thumbnail (only supports http(s) and attachments) */
    String url();

    /** a proxied url of the thumbnail */
    @JsonProperty("proxy_url")
    Possible<String> proxyUrl();

    /** height of thumbnail */
    Possible<Integer> height();

    /** width of thumbnail */
    Possible<Integer> width();
}
