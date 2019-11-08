package com.smalik.distributedshipments.domain;

import lombok.*;

import java.util.List;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MultiShipmentNotice {

    String shipmentId;
    List<String> serialNumbers;
    String pickupLocation;
    String dropOffLocation;
}
