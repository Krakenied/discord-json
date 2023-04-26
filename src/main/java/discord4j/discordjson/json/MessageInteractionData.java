package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableMessageInteractionData.class)
@JsonDeserialize(as = ImmutableMessageInteractionData.class)
public interface MessageInteractionData {

    static ImmutableMessageInteractionData.Builder builder() {
        return ImmutableMessageInteractionData.builder();
    }

    /** ID of the interaction */
    Id id();

    /** Type of interaction */
    int type();

    /** Name of the application command, including subcommands and subcommand groups */
    String name();

    /** User who invoked the interaction */
    UserData user();

    /** Member who invoked the interaction in the guild */
    Possible<GuildMemberData> member();
}
