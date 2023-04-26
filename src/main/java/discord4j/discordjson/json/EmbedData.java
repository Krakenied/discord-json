package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableEmbedData.class)
@JsonDeserialize(as = ImmutableEmbedData.class)
public interface EmbedData {

    static ImmutableEmbedData.Builder builder() {
        return ImmutableEmbedData.builder();
    }

    /** title of embed */
    Possible<String> title();

    /** type of embed (always "rich" for webhook embeds) */
    Possible<String> type();

    /** description of embed */
    Possible<String> description();

    /** url of embed */
    Possible<String> url();

    /** timestamp of embed content */
    Possible<String> timestamp();

    /** color code of the embed */
    Possible<Integer> color();

    /** footer information */
    Possible<EmbedFooterData> footer();

    /** image information */
    Possible<EmbedImageData> image();

    /** thumbnail information */
    Possible<EmbedThumbnailData> thumbnail();

    /** video information */
    Possible<EmbedVideoData> video();

    /** provider information */
    Possible<EmbedProviderData> provider();

    /** author information */
    Possible<EmbedAuthorData> author();

    /** fields information */
    Possible<List<EmbedFieldData>> fields();
}
