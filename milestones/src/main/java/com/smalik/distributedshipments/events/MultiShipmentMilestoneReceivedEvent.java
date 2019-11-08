package com.smalik.distributedshipments.events;

import lombok.*;

import java.time.Instant;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MultiShipmentMilestoneReceivedEvent {

    int eventVersion;
    Instant eventTime;

    String shipmentId;
    Instant time;
    String type; // DROPOFF, PICKUP, PASSTHRU
    String passThruLocation;
}
