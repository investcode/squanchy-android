package net.squanchy.service.firebase;

import net.squanchy.service.firebase.model.FirebaseEvent;

import io.reactivex.Observable;

public interface FirebaseDbService {

    Observable<FirebaseInfoItems> info();

    Observable<FirebaseSpeakers> speakers();

    Observable<FirebaseSchedule> sessions();

    Observable<FirebaseEvent> event(int dayId, int eventId);
}
