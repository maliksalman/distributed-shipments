package com.smalik.distributedshipments.events;

import lombok.*;

import java.time.Instant;
import java.util.List;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MultiShipmentNoticeReceivedEvent {

    @Builder.Default int eventVersion = 1;
    @Builder.Default Instant eventTime = Instant.now();

    String shipmentId;
    List<String> serialNumbers;
    String pickupLocation;
    String dropOffLocation;
}
