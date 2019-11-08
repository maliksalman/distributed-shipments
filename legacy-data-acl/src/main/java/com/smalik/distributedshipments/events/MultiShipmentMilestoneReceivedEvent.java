package com.smalik.distributedshipments.events;

import lombok.*;

import java.time.Instant;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MultiShipmentMilestoneReceivedEvent {

    @Builder.Default int eventVersion = 1;
    @Builder.Default Instant eventTime = Instant.now();

    String shipmentId;
    Instant time;
    String type; // DROPOFF, PICKUP, PASSTHRU
    String passThruLocation;
}
