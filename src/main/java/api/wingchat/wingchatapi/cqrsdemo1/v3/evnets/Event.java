package api.wingchat.wingchatapi.cqrsdemo1.v3.evnets;

import java.util.Date;
import java.util.UUID;

import lombok.ToString;

@ToString
public abstract class Event {

    public final UUID id = UUID.randomUUID();

    public final Date created = new Date();

}