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
@JsonSerialize(as = ImmutableApplicationData.class)
@JsonDeserialize(as = ImmutableApplicationData.class)
public interface ApplicationData extends PartialApplicationData {

    static ImmutableApplicationData.Builder builder() {
        return ImmutableApplicationData.builder();
    }

    /** an array of rpc origin urls, if rpc is enabled */
    @JsonProperty("rpc_origins")
    Possible<List<String>> rpcOrigins();

    /** when false only app owner can join the app's bot to guilds */
    @JsonProperty("bot_public")
    boolean botPublic();

    /** when true the app's bot will only join upon completion of the full oauth2 code grant flow */
    @JsonProperty("bot_require_code_grant")
    boolean botRequireCodeGrant();

    /** the url of the app's terms of service */
    @JsonProperty("terms_of_service_url")
    Possible<String> termsOfServiceUrl();

    /** the url of the app's privacy policy */
    @JsonProperty("privacy_policy_url")
    Possible<String> privacyPolicyUrl();

    /** partial user object containing info on the owner of the application */
    UserData owner();

    /** the hex encoded key for verification in interactions and the GameSDK's GetTicket */
    @JsonProperty("verify_key")
    String verifyKey();

    /** if the application belongs to a team, this will be a list of the members of that team */
    Optional<TeamData> team();

    /** if this application is a game sold on Discord, this field will be the guild to which it has been linked */
    @JsonProperty("guild_id")
    Possible<Id> guildId();

    /** if this application is a game sold on Discord, this field will be the URL slug that links to the store page */
    Possible<String> slug();

    /** the application's public flags */
    Possible<Integer> flags();
}
