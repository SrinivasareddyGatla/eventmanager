package com.eventmanager.mapper;

import com.eventmanager.data.EventData;
import com.eventmanager.model.Event;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EventRequestMapper {
    final EventRequestMapper INSTANCE = Mappers.getMapper(EventRequestMapper.class);
    public Event covnertEvent(final EventData eventData);
}
