package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableTeamMemberData.class)
@JsonDeserialize(as = ImmutableTeamMemberData.class)
public interface TeamMemberData {

    static ImmutableTeamMemberData.Builder builder() {
        return ImmutableTeamMemberData.builder();
    }

    /** the user's membership state on the team */
    @JsonProperty("membership_state")
    int membershipState();

    /** will always be ["*"] */
    List<String> permissions();

    /** the id of the parent team of which they are a member */
    @JsonProperty("team_id")
    Id teamId();

    /** the avatar, discriminator, id, and username of the user */
    UserData user();
}
