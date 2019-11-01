package com.smalik.distributedshipments.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

@Value
@Getter
@Builder
public class ShipmentNotice {

    String serialNumber;
    String shipmentId;
    String pickupLocation;
    String dropOffLocation;
}
