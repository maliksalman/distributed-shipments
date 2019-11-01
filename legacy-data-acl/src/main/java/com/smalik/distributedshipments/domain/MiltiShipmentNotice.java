package com.smalik.distributedshipments.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

import java.util.List;

@Value
@Getter
@Builder
public class MiltiShipmentNotice {

    String shipmentId;
    List<String> serialNumbers;
    String pickupLocation;
    String dropOffLocation;
}
