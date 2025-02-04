package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableThreadMemberData.class)
@JsonDeserialize(as = ImmutableThreadMemberData.class)
public interface ThreadMemberData {

    static ImmutableThreadMemberData.Builder builder() {
        return ImmutableThreadMemberData.builder();
    }

    /** ID of the thread */
    Possible<Id> id();

    /** ID of the user */
    @JsonProperty("user_id")
    Possible<Id> userId();

    /** Time the user last joined the thread */
    @JsonProperty("join_timestamp")
    String joinTimestamp();

    /** Any user-thread settings, currently only used for notifications */
    int flags();

    /** Additional information about the user **/
    Possible<GuildMemberData> member();
}
