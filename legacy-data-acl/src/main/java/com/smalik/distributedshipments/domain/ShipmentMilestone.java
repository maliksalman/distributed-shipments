package com.smalik.distributedshipments.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

import java.time.Instant;

@Value
@Getter
@Builder
public class ShipmentMilestone {

    String serialNumber;
    String location;
    Instant time;
    String type; // DROPOFF, PICKUP, PASSTHRU
}
