package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableEmbedFieldData.class)
@JsonDeserialize(as = ImmutableEmbedFieldData.class)
public interface EmbedFieldData {

    static ImmutableEmbedFieldData.Builder builder() {
        return ImmutableEmbedFieldData.builder();
    }

    /** name of the field */
    String name();

    /** value of the field */
    String value();

    /** whether or not this field should display inline */
    Possible<Boolean> inline();
}
