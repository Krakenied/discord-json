package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableConnectionData.class)
@JsonDeserialize(as = ImmutableConnectionData.class)
public interface ConnectionData {

    static ImmutableConnectionData.Builder builder() {
        return ImmutableConnectionData.builder();
    }

    /** id of the connection account */
    String id();

    /** the username of the connection account */
    String name();

    /** the service of this connection */
    String type();

    /** whether the connection is revoked */
    Possible<Boolean> revoked();

    /** an array of partial server integrations */
    Possible<List<IntegrationData>> integrations();

    /** whether the connection is verified */
    boolean verified();

    /** whether friend sync is enabled for this connection */
    @JsonProperty("friend_sync")
    boolean friendSync();

    /** whether activities related to this connection will be shown in presence updates */
    @JsonProperty("show_activity")
    boolean showActivity();

    /** whether this connection has a corresponding third party OAuth2 token */
    @JsonProperty("two_way_link")
    boolean twoWayLink();

    /** visibility of this connection */
    int visibility();
}
