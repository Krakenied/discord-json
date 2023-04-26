package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableAttachmentData.class)
@JsonDeserialize(as = ImmutableAttachmentData.class)
public interface AttachmentData {

    static ImmutableAttachmentData.Builder builder() {
        return ImmutableAttachmentData.builder();
    }

    /** attachment id */
    Id id();

    /** name of file attached */
    String filename();

    /** description for the file (max 1024 characters) */
    Possible<String> description();

    /** the attachment's media type */
    @JsonProperty("content_type")
    Possible<String> contentType();

    /** size of file in bytes */
    int size();

    /** source url of file */
    String url();

    /** a proxied url of file */
    @JsonProperty("proxy_url")
    String proxyUrl();

    /** height of file (if image) */
    Possible<Optional<Integer>> height();

    /** width of file (if image) */
    Possible<Optional<Integer>> width();

    /** whether this attachment is ephemeral */
    Possible<Boolean> ephemeral();

    /** the duration of the audio file (currently for voice messages) */
    @JsonProperty("duration_secs")
    Possible<Float> durationSecs();

    /** base64 encoded bytearray representing a sampled waveform (currently for voice messages) */
    Possible<String> waveform();
}
