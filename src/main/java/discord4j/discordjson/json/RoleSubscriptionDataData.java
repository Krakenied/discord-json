package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableRoleSubscriptionDataData.class)
@JsonDeserialize(as = ImmutableRoleSubscriptionDataData.class)
public interface RoleSubscriptionDataData {

    static ImmutableRoleSubscriptionDataData.Builder builder() {
        return ImmutableRoleSubscriptionDataData.builder();
    }

    /** the id of the sku and listing that the user is subscribed to */
    @JsonProperty("role_subscription_listing_id")
    Id id();

    /** the name of the tier that the user is subscribed to */
    @JsonProperty("tier_name")
    String tierName();

    /** the cumulative number of months that the user has been subscribed for */
    @JsonProperty("total_months_subscribed")
    int totalMonthsSubscribed();

    /** whether this notification is for a renewal rather than a new purchase */
    @JsonProperty("is_renewal")
    boolean isRenewal();
}
