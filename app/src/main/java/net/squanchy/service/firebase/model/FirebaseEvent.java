package net.squanchy.service.firebase.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.List;

public class FirebaseEvent {

    @NonNull
    public String id;

    @NonNull
    public String name;

    @NonNull
    public String type;

    @NonNull
    public String short_description;

    @Nullable
    public String description;

    public Long start_time;

    public Long end_time;

    public String day_id;

    @Nullable
    public String track_id;

    @Nullable
    public String experience_level;

    @Nullable
    public String place_id;

    @Nullable
    public List<String> speaker_ids;

    @Nullable
    public FirebaseLinks links;
}
