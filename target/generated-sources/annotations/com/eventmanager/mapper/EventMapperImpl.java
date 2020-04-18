package com.eventmanager.mapper;

import com.eventmanager.data.EventData;
import com.eventmanager.model.Event;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-18T10:30:03+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_241 (Oracle Corporation)"
)
@Component
public class EventMapperImpl implements EventMapper {

    @Override
    public Event covnertToEvent(EventData eventData) {
        if ( eventData == null ) {
            return null;
        }

        Event event = new Event();

        event.setEventId( eventData.getEventId() );
        event.setName( eventData.getName() );
        event.setDescription( eventData.getDescription() );

        return event;
    }

    @Override
    public List<Event> covnertToEvents(List<EventData> eventData) {
        if ( eventData == null ) {
            return null;
        }

        List<Event> list = new ArrayList<Event>( eventData.size() );
        for ( EventData eventData1 : eventData ) {
            list.add( covnertToEvent( eventData1 ) );
        }

        return list;
    }

    @Override
    public List<EventData> convertToEventData(List<Event> events) {
        if ( events == null ) {
            return null;
        }

        List<EventData> list = new ArrayList<EventData>( events.size() );
        for ( Event event : events ) {
            list.add( eventToEventData( event ) );
        }

        return list;
    }

    protected EventData eventToEventData(Event event) {
        if ( event == null ) {
            return null;
        }

        EventData eventData = new EventData();

        eventData.setEventId( event.getEventId() );
        eventData.setName( event.getName() );
        eventData.setDescription( event.getDescription() );

        return eventData;
    }
}
