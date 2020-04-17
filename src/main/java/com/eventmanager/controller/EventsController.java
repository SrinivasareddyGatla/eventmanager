package com.eventmanager.controller;

import com.eventmanager.data.EventData;
import com.eventmanager.mapper.EventRequestMapper;
import com.eventmanager.model.Event;
import com.eventmanager.repository.EventRepository;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class EventsController {

    @Autowired
    private EventRepository eventRepository;

    @PostMapping("/events")
    public void createEvents(@RequestBody final List<EventData> events) {
        final ArrayList<Event> eventModels = new ArrayList<>();
        events.forEach(eventData -> eventModels.add(EventRequestMapper.INSTANCE.covnertEvent(eventData)));
        eventRepository.saveAll(eventModels);
    }
}
