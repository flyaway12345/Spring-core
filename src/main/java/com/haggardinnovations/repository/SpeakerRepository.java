package com.haggardinnovations.repository;

import com.haggardinnovations.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
