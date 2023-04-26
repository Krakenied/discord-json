package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableVoiceRegionData.class)
@JsonDeserialize(as = ImmutableVoiceRegionData.class)
public interface VoiceRegionData {

    static ImmutableVoiceRegionData.Builder builder() {
        return ImmutableVoiceRegionData.builder();
    }

    /** unique ID for the region */
    String id();

    /** name of the region */
    String name();

    /** true for a single server that is closest to the current user's client */
    boolean optimal();

    /** whether this is a deprecated voice region (avoid switching to these) */
    boolean deprecated();

    /** whether this is a custom voice region (used for events/etc) */
    boolean custom();
}
