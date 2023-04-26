package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableMessageReferenceData.class)
@JsonDeserialize(as = ImmutableMessageReferenceData.class)
public interface MessageReferenceData {

    static ImmutableMessageReferenceData.Builder builder() {
        return ImmutableMessageReferenceData.builder();
    }

    /** id of the originating message */
    @JsonProperty("message_id")
    Possible<Id> messageId();

    /** id of the originating message's channel */
    @JsonProperty("channel_id")
    Possible<Id> channelId();

    /** id of the originating message's guild */
    @JsonProperty("guild_id")
    Possible<Id> guildId();

    /**
     * when sending, whether to error if the referenced message doesn't exist instead of sending as a normal
     * (non-reply) message, default true
     */
    @JsonProperty("fail_if_not_exists")
    Possible<Boolean> failIfNotExists();
}
