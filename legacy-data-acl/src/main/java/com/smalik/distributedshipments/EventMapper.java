package com.smalik.distributedshipments;

import com.smalik.distributedshipments.domain.MultiShipmentMilestone;
import com.smalik.distributedshipments.domain.MultiShipmentNotice;
import com.smalik.distributedshipments.domain.ShipmentMilestone;
import com.smalik.distributedshipments.domain.ShipmentPlan;
import com.smalik.distributedshipments.events.MultiShipmentMilestoneReceivedEvent;
import com.smalik.distributedshipments.events.MultiShipmentNoticeReceivedEvent;
import com.smalik.distributedshipments.events.ShipmentMilestoneReceivedEvent;
import com.smalik.distributedshipments.events.ShipmentPlanReceivedEvent;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper {

    ShipmentPlanReceivedEvent toEvent(ShipmentPlan plan);
    ShipmentMilestoneReceivedEvent toEvent(ShipmentMilestone milestone);
    MultiShipmentNoticeReceivedEvent toEvent(MultiShipmentNotice notice);
    MultiShipmentMilestoneReceivedEvent toEvent(MultiShipmentMilestone milestone);

}
