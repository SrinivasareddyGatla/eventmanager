package com.eventmanager.mapper;

import com.eventmanager.data.EventData;
import com.eventmanager.model.Event;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EventMapper {
    Event map(final EventData eventData);
    List<Event> map(final List<EventData> events);
    EventData reverseMap(final Event event);
    List<EventData> reverseMap(final List<Event> events);
}
