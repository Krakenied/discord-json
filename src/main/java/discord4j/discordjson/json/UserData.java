package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableUserData.class)
@JsonDeserialize(as = ImmutableUserData.class)
public interface UserData extends TeamUserData {

    static ImmutableUserData.Builder builder() {
        return ImmutableUserData.builder();
    }

    /** whether the user belongs to an OAuth2 application */
    Possible<Boolean> bot();

    /** whether the user is an Official Discord System user (part of the urgent message system) */
    Possible<Boolean> system();

    /** whether the user has two factor enabled on their account */
    @JsonProperty("mfa_enabled")
    Possible<Boolean> mfaEnabled();

    /** the user's banner hash */
    Possible<Optional<String>> banner();

    /** the user's banner color encoded as an integer representation of hexadecimal color code */
    @JsonProperty("accent_color")
    Possible<Optional<Integer>> accentColor();

    /** the user's chosen language option */
    Possible<String> locale();

    /** whether the email on this account has been verified */
    Possible<Boolean> verified();

    /** the user's email */
    Possible<Optional<String>> email();

    /** the flags on a user's account */
    Possible<Integer> flags();

    /** the type of Nitro subscription on a user's account */
    @JsonProperty("premium_type")
    Possible<Integer> premiumType();

    /** the public flags on a user's account */
    @JsonProperty("public_flags")
    Possible<Integer> publicFlags();
}
