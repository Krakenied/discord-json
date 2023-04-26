package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableTeamUserData.class)
@JsonDeserialize(as = ImmutableTeamUserData.class)
public interface TeamUserData {

    static ImmutableTeamUserData.Builder builder() {
        return ImmutableTeamUserData.builder();
    }

    /** the user's id */
    Id id();

    /** the user's username, not unique across the platform */
    String username();

    /** the user's 4-digit discord-tag */
    String discriminator();

    /** the user's avatar hash */
    Optional<String> avatar();
}
