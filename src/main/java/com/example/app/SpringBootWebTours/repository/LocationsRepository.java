package com.example.app.SpringBootWebTours.repository;

import com.example.app.SpringBootWebTours.entity.Locations;
import com.example.app.SpringBootWebTours.utils.Constants;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

@Repository
public class LocationsRepository {

    private static final Logger LOGGER =
            Logger.getLogger(LocationsRepository.class.getName());

    List<Locations> list;

    public List<Locations> getLocations() throws IOException {

        File jsonFile = new ClassPathResource(Constants.URL_FILES +
                Constants.FILE_LOCATIONS).getFile();
        String path = jsonFile.getAbsolutePath();

        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(path));
            list = gson.fromJson(reader,
                    new TypeToken<List<Locations>>() {}.getType());
            reader.close();
            return list.stream()
                    .map(client -> new Locations(client.getId(),
                            Constants.URL_IMAGES + client.getImg(),
                            client.getDescr()))
                    .toList();
        } catch (Exception ex) {
            LOGGER.info("LocationsRepository msg: " + ex.getMessage());
            // Якщо помилка, повертаємо порожню колекцію
            return Collections.emptyList();
        }
    }
}
