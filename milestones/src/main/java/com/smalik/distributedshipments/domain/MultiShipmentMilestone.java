package com.smalik.distributedshipments.domain;

import lombok.*;

import java.time.Instant;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MultiShipmentMilestone {

    String shipmentId;
    Instant time;
    String type; // DROPOFF, PICKUP, PASSTHRU
    String passThruLocation;
}
