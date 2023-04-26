package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableIntegrationData.class)
@JsonDeserialize(as = ImmutableIntegrationData.class)
public interface IntegrationData {

    static ImmutableIntegrationData.Builder builder() {
        return ImmutableIntegrationData.builder();
    }

    /** integration id */
    Id id();

    /** integration name */
    String name();

    /** integration type (twitch, youtube, discord, or guild_subscription) */
    String type();

    /** is this integration enabled */
    boolean enabled();

    /** is this integration syncing */
    Possible<Boolean> syncing();

    /** id that this integration uses for "subscribers" */
    @JsonProperty("role_id")
    Possible<Id> roleId();

    /** whether emoticons should be synced for this integration (twitch only currently) */
    @JsonProperty("enable_emoticons")
    Possible<Boolean> enableEmoticons();

    /** the behavior of expiring subscribers */
    @JsonProperty("expire_behavior")
    Possible<Integer> expireBehavior();

    /** the grace period (in days) before expiring subscribers */
    @JsonProperty("expire_grace_period")
    Possible<Integer> expireGracePeriod();

    /** user for this integration */
    Possible<UserData> user();

    /** integration account information */
    IntegrationAccountData account();

    /** when this integration was last synced */
    @JsonProperty("synced_at")
    Possible<String> syncedAt();

    /** how many subscribers this integration has */
    @JsonProperty("subscriber_count")
    Possible<Integer> subscriberCount();

    /** has this integration been revoked */
    Possible<Boolean> revoked();

    /** The bot/OAuth2 application for discord integrations */
    Possible<IntegrationApplicationData> application();

    /** the scopes the application has been authorized for */
    Possible<List<String>> scopes();
}
