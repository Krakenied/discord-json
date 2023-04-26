package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableEmbedImageData.class)
@JsonDeserialize(as = ImmutableEmbedImageData.class)
public interface EmbedImageData {

    static ImmutableEmbedImageData.Builder builder() {
        return ImmutableEmbedImageData.builder();
    }

    /** source url of image (only supports http(s) and attachments) */
    String url();

    /** a proxied url of the image */
    @JsonProperty("proxy_url")
    Possible<String> proxyUrl();

    /** height of image */
    Possible<Integer> height();

    /** width of image */
    Possible<Integer> width();
}
