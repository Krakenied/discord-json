package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableThreadMetadataData.class)
@JsonDeserialize(as = ImmutableThreadMetadataData.class)
public interface ThreadMetadataData {

    static ImmutableThreadMetadataData.Builder builder() {
        return ImmutableThreadMetadataData.builder();
    }

    /** whether the thread is archived */
    boolean archived();

    /**
     * the thread will stop showing in the channel list after auto_archive_duration minutes of inactivity, can be set
     * to: 60, 1440, 4320, 10080
     */
    @JsonProperty("auto_archive_duration")
    int autoArchiveDuration();

    /** timestamp when the thread's archive status was last changed, used for calculating recent activity */
    @JsonProperty("archive_timestamp")
    String archiveTimestamp();

    /** whether the thread is locked; when a thread is locked, only users with MANAGE_THREADS can unarchive it */
    boolean locked();

    /** whether non-moderators can add other non-moderators to a thread; only available on private threads */
    Possible<Boolean> invitable();

    /** timestamp when the thread was created; only populated for threads created after 2022-01-09 */
    @JsonProperty("create_timestamp")
    Possible<String> createTimestamp();
}
