package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableEmbedVideoData.class)
@JsonDeserialize(as = ImmutableEmbedVideoData.class)
public interface EmbedVideoData {

    static ImmutableEmbedVideoData.Builder builder() {
        return ImmutableEmbedVideoData.builder();
    }

    /** source url of video */
    Possible<String> url();

    /** a proxied url of the video */
    @JsonProperty("proxy_url")
    Possible<String> proxyUrl();

    /** height of video */
    Possible<Integer> height();

    /** width of video */
    Possible<Integer> width();
}
