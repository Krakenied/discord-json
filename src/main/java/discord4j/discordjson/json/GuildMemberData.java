package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildMemberData.class)
@JsonDeserialize(as = ImmutableGuildMemberData.class)
public interface GuildMemberData {

    static ImmutableGuildMemberData.Builder builder() {
        return ImmutableGuildMemberData.builder();
    }

    /** the user this guild member represents */
    Possible<UserData> user();

    /** this user's guild nickname */
    Possible<Optional<String>> nick();

    /** the member's guild avatar hash */
    Possible<Optional<String>> avatar();

    /** array of role object ids */
    List<Id> roles();

    /** when the user joined the guild */
    @JsonProperty("joined_at")
    String joinedAt();

    /** when the user started boosting the guild */
    @JsonProperty("premium_since")
    Possible<Optional<String>> premiumSince();

    /** whether the user is deafened in voice channels */
    boolean deaf();

    /** whether the user is muted in voice channels */
    boolean mute();

    /** guild member flags represented as a bit set, defaults to 0 */
    default int flags() {
        return 0;
    }

    /** whether the user has not yet passed the guild's Membership Screening requirements */
    Possible<Boolean> pending();

    /** total permissions of the member in the channel, including overwrites, returned when in the interaction object */
    Possible<String> permissions();

    /**
     * when the user's timeout will expire and the user will be able to communicate in the guild again, null or a time
     * in the past if the user is not timed out
     */
    @JsonProperty("communication_disabled_until")
    Possible<Optional<String>> communicationDisabledUntil();
}
