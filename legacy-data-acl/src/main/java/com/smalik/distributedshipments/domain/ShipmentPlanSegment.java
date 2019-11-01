package com.smalik.distributedshipments.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

import java.time.Instant;

@Value
@Getter
@Builder
public class ShipmentPlanSegment {

    Instant pickupTime;
    String pickupLocation;

    Instant dropOffTime;
    String dropOffLocation;

}
