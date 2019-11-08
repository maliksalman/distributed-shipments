package com.smalik.distributedshipments.events;

import lombok.*;

import java.time.Instant;
import java.util.List;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MultiShipmentNoticeReceivedEvent {

    int eventVersion;
    Instant eventTime;

    String shipmentId;
    List<String> serialNumbers;
    String pickupLocation;
    String dropOffLocation;
}
