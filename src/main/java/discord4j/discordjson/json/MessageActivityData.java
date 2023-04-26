package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableMessageActivityData.class)
@JsonDeserialize(as = ImmutableMessageActivityData.class)
public interface MessageActivityData {

    static ImmutableMessageActivityData.Builder builder() {
        return ImmutableMessageActivityData.builder();
    }

    /** type of message activity */
    int type();

    /** party_id from a Rich Presence event */
    @JsonProperty("party_id")
    Possible<String> partyId();
}
