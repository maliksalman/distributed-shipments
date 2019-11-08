package com.smalik.distributedshipments;

import com.smalik.distributedshipments.domain.MultiShipmentMilestone;
import com.smalik.distributedshipments.domain.MultiShipmentNotice;
import com.smalik.distributedshipments.domain.ShipmentMilestone;
import com.smalik.distributedshipments.events.MultiShipmentMilestoneReceivedEvent;
import com.smalik.distributedshipments.events.MultiShipmentNoticeReceivedEvent;
import com.smalik.distributedshipments.events.ShipmentMilestoneReceivedEvent;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EventMapper {

    ShipmentMilestone toEvent(ShipmentMilestoneReceivedEvent event);
    MultiShipmentNotice toEvent(MultiShipmentNoticeReceivedEvent event);
    MultiShipmentMilestone toEvent(MultiShipmentMilestoneReceivedEvent event);

}
