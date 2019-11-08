package com.smalik.distributedshipments.domain;

import lombok.*;

import java.time.Instant;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ShipmentMilestone {

    String serialNumber;
    String location;
    Instant time;
    String type; // DROPOFF, PICKUP, PASSTHRU
}
