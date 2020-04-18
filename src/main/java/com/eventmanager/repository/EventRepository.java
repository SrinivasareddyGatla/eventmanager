package com.eventmanager.repository;

import com.eventmanager.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends CrudRepository<Event,Long> {

    Event findByEventId(final long eventId);
}
