package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableTeamData.class)
@JsonDeserialize(as = ImmutableTeamData.class)
public interface TeamData {

    static ImmutableTeamData.Builder builder() {
        return ImmutableTeamData.builder();
    }

    /** a hash of the image of the team's icon */
    Optional<String> icon();

    /** the unique id of the team */
    Id id();

    /** the members of the team */
    List<TeamMemberData> members();

    /** the name of the team */
    String name();

    /** the user id of the current team owner */
    @JsonProperty("owner_user_id")
    Id ownerUserId();
}
