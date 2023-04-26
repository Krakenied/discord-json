package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableVoiceStateData.class)
@JsonDeserialize(as = ImmutableVoiceStateData.class)
public interface VoiceStateData {

    static ImmutableVoiceStateData.Builder builder() {
        return ImmutableVoiceStateData.builder();
    }

    /** the guild id this voice state is for */
    @JsonProperty("guild_id")
    Possible<Id> guildId();

    /** the channel id this user is connected to */
    @JsonProperty("channel_id")
    Optional<Id> channelId();

    /** the user id this voice state is for */
    @JsonProperty("user_id")
    Id userId();

    /** the guild member this voice state is for */
    Possible<GuildMemberData> member();

    /** the session id for this voice state */
    @JsonProperty("session_id")
    String sessionId();

    /** whether this user is deafened by the server */
    boolean deaf();

    /** whether this user is muted by the server */
    boolean mute();

    /** whether this user is locally deafened */
    @JsonProperty("self_deaf")
    boolean selfDeaf();

    /** whether this user is locally muted */
    @JsonProperty("self_mute")
    boolean selfMute();

    /** whether this user is streaming using "Go Live" */
    @JsonProperty("self_stream")
    Possible<Boolean> selfStream();

    /** whether this user's camera is enabled */
    @JsonProperty("self_video")
    boolean selfVideo();

    /** whether this user's permission to speak is denied */
    boolean suppress();

    /** the time at which the user requested to speak */
    @JsonProperty("request_to_speak_timestamp")
    Optional<String> requestToSpeakTimestamp();
}
