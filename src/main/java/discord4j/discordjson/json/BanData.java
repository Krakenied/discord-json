package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableBanData.class)
@JsonDeserialize(as = ImmutableBanData.class)
public interface BanData {

    static ImmutableBanData.Builder builder() {
        return ImmutableBanData.builder();
    }

    /** the reason for the ban */
    Optional<String> reason();

    /** the banned user */
    UserData user();
}
