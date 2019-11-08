package com.smalik.distributedshipments;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.SubscribableChannel;

@Configuration
@EnableBinding(Messaging.Channels.class)
public class Messaging {

    static public interface Channels {

        @Input("shipment-milestone-received")
        SubscribableChannel shipmentMilestoneChannel();

        @Input("multi-shipment-milestone-received")
        SubscribableChannel multiShipmentMilestoneChannel();

        @Input("multi-shipment-notice-received")
        SubscribableChannel multiShipmentNoticeChannel();
    }
}
