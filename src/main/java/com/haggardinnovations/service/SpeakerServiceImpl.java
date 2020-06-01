package com.haggardinnovations.service;

import com.haggardinnovations.model.Speaker;
import com.haggardinnovations.repository.HibernateSpeakerRepositoryImpl;
import com.haggardinnovations.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("Speaker Service Impl no args constructor");
    }

    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("Speaker Service Impl repository constructor");

        this.repository = repository;
    }

    public List<Speaker> finalAll(){
        return  repository.findAll();
    }
    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("Speaker Service Impl setter");

        this.repository = repository;
    }
}
