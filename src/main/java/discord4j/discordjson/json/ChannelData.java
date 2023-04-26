package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sun.org.apache.xpath.internal.operations.Bool;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableChannelData.class)
@JsonDeserialize(as = ImmutableChannelData.class)
public interface ChannelData {

    static ImmutableChannelData.Builder builder() {
        return ImmutableChannelData.builder();
    }

    /** the id of this channel */
    Id id();

    /** the type of channel */
    int type();

    /** the id of the guild (may be missing for some channel objects received over gateway guild dispatches) */
    @JsonProperty("guild_id")
    Possible<Id> guildId();

    /** sorting position of the channel */
    Possible<Integer> position();

    /** explicit permission overwrites for members and roles */
    @JsonProperty("permission_overwrites")
    Possible<List<OverwriteData>> permissionOverwrites();

    /** the name of the channel (1-100 characters) */
    Possible<Optional<String>> name();

    /** the channel topic (0-4096 characters for GUILD_FORUM channels, 0-1024 characters for all others) */
    Possible<Optional<String>> topic();

    /** whether the channel is nsfw */
    Possible<Boolean> nsfw();

    /**
     * the id of the last message sent in this channel (or thread for GUILD_FORUM channels) (may not point to anexisting
     * or valid message or thread)
     */
    @JsonProperty("last_message_id")
    Possible<Optional<Id>> lastMessageId();

    /** the bitrate (in bits) of the voice channel */
    Possible<Integer> bitrate();

    /** the user limit of the voice channel */
    @JsonProperty("user_limit")
    Possible<Integer> userLimit();

    /**
     * amount of seconds a user has to wait before sending another message (0-21600); bots, as well as users with the
     * permission manage_messages or manage_channel, are unaffected
     */
    @JsonProperty("rate_limit_per_user")
    Possible<Integer> rateLimitPerUser();

    /** the recipients of the DM */
    Possible<List<UserData>> recipients();

    /** icon hash of the group DM */
    Possible<Optional<String>> icon();

    /** id of the creator of the group DM or thread */
    @JsonProperty("owner_id")
    Possible<Id> ownerId();

    /** application id of the group DM creator if it is bot-created */
    @JsonProperty("application_id")
    Possible<Id> applicationId();

    /** for group DM channels: whether the channel is managed by an application via the gdm.join OAuth2 scope */
    Possible<Boolean> managed();

    /**
     * for guild channels: id of the parent category for a channel (each parent category can contain up to 50 channels),
     * for threads: id of the text channel this thread was created
     */
    @JsonProperty("parent_id")
    Possible<Optional<Id>> parentId();

    /**
     * when the last pinned message was pinned. This may be null in events such as GUILD_CREATE when a message is not
     * pinned.
     */
    @JsonProperty("last_pin_timestamp")
    Possible<Optional<String>> lastPinTimestamp();

    /** voice region id for the voice channel, automatic when set to null */
    @JsonProperty("rtc_region")
    Possible<Optional<String>> rtcRegion();

    /** the camera video quality mode of the voice channel, 1 when not present */
    @JsonProperty("video_quality_mode")
    Possible<Integer> videoQualityMode();

    /** number of messages (not including the initial message or deleted messages) in a thread. */
    @JsonProperty("message_count")
    Possible<Integer> messageCount();

    /** an approximate count of users in a thread, stops counting at 50 */
    @JsonProperty("member_count")
    Possible<Integer> memberCount();

    /** thread-specific fields not needed by other channels */
    @JsonProperty("thread_metadata")
    Possible<ThreadMetadataData> threadMetadata();

    /**
     * thread member object for the current user, if they have joined the thread, only included on certain API endpoints
     */
    @JsonProperty("member")
    Possible<ThreadMemberData> member();

    /**
     * default duration, copied onto newly created threads, in minutes, threads will stop showing in the channel list
     * after the specified period of inactivity, can be set to: 60, 1440, 4320, 10080
     */
    @JsonProperty("default_auto_archive_duration")
    Possible<Integer> defaultAutoArchiveDuration();

    /**
     * computed permissions for the invoking user in the channel, including overwrites, only included when part of the
     * resolved data received on a slash command interaction
     */
    Possible<String> permissions();

    /** channel flags combined as a bitfield */
    Possible<Integer> flags();

    /**
     * number of messages ever sent in a thread, it's similar to message_count on message creation, but will not
     * decrement the number when a message is deleted
     */
    @JsonProperty("total_message_sent")
    Possible<Integer> totalMessageSent();

    /** the set of tags that can be used in a GUILD_FORUM channel */
    @JsonProperty("available_tags")
    Possible<List<ForumTagData>> availableTags();

    /** the IDs of the set of tags that have been applied to a thread in a GUILD_FORUM channel */
    @JsonProperty("applied_tags")
    Possible<List<Id>> appliedTags();

    /** the emoji to show in the add reaction button on a thread in a GUILD_FORUM channel */
    @JsonProperty("default_reaction_emoji")
    Possible<Optional<DefaultReactionData>> defaultReactionEmoji();

    /**
     * the initial rate_limit_per_user to set on newly created threads in a channel. this field is copied to the thread
     * at creation time and does not live update.
     */
    @JsonProperty("default_thread_rate_limit_per_user")
    Possible<Integer> defaultThreadRateLimitPerUser();

    /**
     * 	the default sort order type used to order posts in GUILD_FORUM channels. Defaults to null, which indicates a
     * 	preferred sort order hasn't been set by a channel admin
     */
    @JsonProperty("default_sort_order")
    Possible<Optional<Integer>> defaultSortOrder();

    /**
     * the default forum layout view used to display posts in GUILD_FORUM channels. Defaults to 0, which indicates a
     * layout view has not been set by a channel admin
     */
    @JsonProperty("default_forum_layout")
    Possible<Integer> defaultForumLayout();
}
