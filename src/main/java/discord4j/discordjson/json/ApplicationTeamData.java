package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableApplicationTeamData.class)
public interface ApplicationTeamData {

    Optional<String> icon();
    String id();
    List<ApplicationTeamMemberData> members();
    @JsonProperty("owner_user_id")
    String ownerUserId();
}