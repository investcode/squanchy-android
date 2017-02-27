package net.squanchy.service.firebase.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class FirebaseTrack {

    @NonNull
    public String id;

    @NonNull
    public String name;

    @Nullable
    public String accent_color;

    @Nullable
    public String text_color;

    @Nullable
    public String icon_url;
}
