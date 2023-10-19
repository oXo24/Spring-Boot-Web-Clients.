package com.example.app.SpringBootWebTours.service;

import com.example.app.SpringBootWebTours.entity.Locations;
import com.example.app.SpringBootWebTours.repository.LocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

@Service
public class LocationsService {

    @Autowired
    LocationsRepository repository;

    public List<Locations> getOffices() throws URISyntaxException, IOException {
        return repository.getLocations();
    }
}
