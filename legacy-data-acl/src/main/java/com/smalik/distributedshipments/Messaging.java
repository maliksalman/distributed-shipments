package com.smalik.distributedshipments;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.MessageChannel;

@Configuration
@EnableBinding(Messaging.Channels.class)
public class Messaging {

    static public interface Channels {

        @Output("shipment-plan-received")
        MessageChannel shipmentPlanChannel();

        @Output("shipment-milestone-received")
        MessageChannel shipmentMilestoneChannel();

        @Output("multi-shipment-milestone-received")
        MessageChannel multiShipmentMilestoneChannel();

        @Output("multi-shipment-notice-received")
        MessageChannel multiShipmentNoticeChannel();
    }
}
