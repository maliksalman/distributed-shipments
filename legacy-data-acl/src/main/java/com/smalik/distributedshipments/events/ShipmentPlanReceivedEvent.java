package com.smalik.distributedshipments.events;

import com.smalik.distributedshipments.domain.ShipmentPlanSegment;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ShipmentPlanReceivedEvent {

    @Builder.Default int eventVersion = 1;
    @Builder.Default Instant eventTime = Instant.now();

    int planVersion;
    String serialNumber;
    Instant issueTime;

    List<ShipmentPlanSegment> segments;
}
