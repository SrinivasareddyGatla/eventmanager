package com.eventmanager.controller;

import com.eventmanager.data.EventData;
import com.eventmanager.mapper.EventMapper;
import com.eventmanager.model.Event;
import com.eventmanager.repository.EventRepository;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private EventMapper eventMapper;

    @PostMapping("/event")
    public void createEvent(@RequestBody final EventData event) {
       final Event eventModel = eventMapper.map(event);
       eventRepository.save(eventModel);
    }

    @GetMapping
    public List<EventData> getAllEvents(){
        return eventMapper.reverseMap(IterableUtils.toList(eventRepository.findAll()));
    }
}
