package com.smalik.distributedshipments.events;

import lombok.*;

import java.time.Instant;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ShipmentMilestoneReceivedEvent {

    @Builder.Default int eventVersion = 1;
    @Builder.Default Instant eventTime = Instant.now();

    String serialNumber;
    String location;
    Instant time;
    String type; // DROPOFF, PICKUP, PASSTHRU
}
