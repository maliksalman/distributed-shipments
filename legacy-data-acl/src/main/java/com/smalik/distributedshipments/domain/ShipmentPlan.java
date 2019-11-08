package com.smalik.distributedshipments.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

import java.time.Instant;
import java.util.List;
import java.util.SortedSet;

@Value
@Getter
@Builder
public class ShipmentPlan {

    int planVersion;
    String serialNumber;
    Instant issueTime;

    List<ShipmentPlanSegment> segments;
}
