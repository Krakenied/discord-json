package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableOverwriteData.class)
@JsonDeserialize(as = ImmutableOverwriteData.class)
public interface OverwriteData {

    static ImmutableOverwriteData.Builder builder() {
        return ImmutableOverwriteData.builder();
    }

    /** role or user id */
    Id id();

    /** either 0 (role) or 1 (member) */
    int type();

    /** permission bit set */
    long allow();

    /** permission bit set */
    long deny();
}
