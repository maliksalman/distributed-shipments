package com.smalik.distributedshipments.events;

import lombok.*;

import java.time.Instant;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ShipmentMilestoneReceivedEvent {

    int eventVersion;
    Instant eventTime;

    String serialNumber;
    String location;
    Instant time;
    String type; // DROPOFF, PICKUP, PASSTHRU
}
