package com.smalik.distributedshipments;

import com.smalik.distributedshipments.domain.ShipmentPlan;
import com.smalik.distributedshipments.events.ShipmentPlanReceivedEvent;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class LegacyDataController {

    private EventMapper mapper;
    private Messaging.Channels channels;

    public LegacyDataController(EventMapper mapper, Messaging.Channels channels) {
        this.mapper = mapper;
        this.channels = channels;
    }

    @PostMapping("/v1/sample/plans/{serial}")
    public ShipmentPlanReceivedEvent shipmentPlanReceivedEvent(@PathVariable String serial) {

        ShipmentPlan plan = ShipmentPlan.builder()
                .issueTime(Instant.now())
                .planVersion(1)
                .serialNumber(serial)
                .build();

        ShipmentPlanReceivedEvent event = mapper.toEvent(plan);
        channels.shipmentPlanChannel().send(MessageBuilder.withPayload(event).build());
        return event;
    }
}
