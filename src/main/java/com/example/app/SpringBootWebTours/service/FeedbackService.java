package com.example.app.SpringBootWebTours.service;

import com.example.app.SpringBootWebTours.entity.Feedback;
import com.example.app.SpringBootWebTours.repository.FeedbackRepository;
import com.example.app.SpringBootWebTours.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class FeedbackService {

    @Autowired
    FeedbackRepository repository;

    public List<Feedback> getClients() {
        Iterable<Feedback> iterable = repository.findAll();
        List<Feedback> list =
                StreamSupport.stream(iterable.spliterator(), false)
                        .map(feedback -> new Feedback(feedback.getId(),
                                Constants.URL_IMAGES + feedback.getImg(),
                                feedback.getName(),
                                feedback.getDescr()))
                        .toList();
        return new ArrayList<>(list);
    }
}
