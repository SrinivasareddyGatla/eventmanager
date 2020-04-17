package com.eventmanager.mapper;

import com.eventmanager.data.EventData;
import com.eventmanager.model.Event;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-16T20:04:02+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class EventRequestMapperImpl implements EventRequestMapper {

    @Override
    public Event covnertEvent(EventData eventData) {
        if ( eventData == null ) {
            return null;
        }

        Event event = new Event();

        return event;
    }
}
