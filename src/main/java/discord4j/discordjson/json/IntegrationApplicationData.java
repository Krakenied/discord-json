package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableIntegrationApplicationData.class)
@JsonDeserialize(as = ImmutableIntegrationApplicationData.class)
public interface IntegrationApplicationData {

    static ImmutableIntegrationApplicationData.Builder builder() {
        return ImmutableIntegrationApplicationData.builder();
    }

    /** the id of the app */
    Id id();

    /** the name of the app */
    String name();

    /** the icon hash of the app */
    Optional<String> icon();

    /** the description of the app */
    String description();

    /** the bot associated with this application */
    Possible<UserData> bot();
}
