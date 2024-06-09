package br.com.fiap.produtomvc.services;

import br.com.fiap.produtomvc.model.Navio;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

@Service
public class MarineTrafficService {

//    @Value("${marinetraffic.api.key}")
    private String apiKey;

//    private final RestTemplate restTemplate;
//    private final ObjectMapper objectMapper;

    private final String baseUrl = "https://services.marinetraffic.com/api/exportvessels/v:5/";

//    public MarineTrafficService(RestTemplate restTemplate, ObjectMapper objectMapper) {
//        this.restTemplate = restTemplate;
//        this.objectMapper = objectMapper;
//    }
//
//
//    public List<Navio> getAllNavioData() {
//        RestTemplate restTemplate = new RestTemplate();
//        ;
//        try {
//            ResponseEntity<Navio> response = restTemplate.getForEntity(
//                    String.format(baseUrl, Navio.class),
//                    Navio.class);
//            return Arrays.asList(response.getBody());
//        } catch (HttpClientErrorException e) {
//            throw new RuntimeException("Não foi possivel consultar o trajeto dos navios" + e.getMessage());
//        }
//
//    }



    public List<Navio> getAllTest() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Use ClassPathResource to get the InputStream of the file in classpath
            ClassPathResource resource = new ClassPathResource("./static/data/Navios.json");
            InputStream inputStream = resource.getInputStream();

            // Read the JSON from the InputStream
            return objectMapper.readValue(inputStream, new TypeReference<List<Navio>>() {});
        } catch (IOException e) {
            throw new RuntimeException("Failed to read JSON file", e);
        }
    }


}