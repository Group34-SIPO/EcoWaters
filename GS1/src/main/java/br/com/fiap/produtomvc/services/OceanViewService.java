package br.com.fiap.produtomvc.services;

import br.com.fiap.produtomvc.model.Focos;
import br.com.fiap.produtomvc.model.Navio;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class OceanViewService {


//    @Bean
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }


//    @Value("${oceanview.api.key}")
    private String apiKey;

//    private RestTemplate restTemplate;
//    private ObjectMapper objectMapper;

    private final String baseUrl = "https://oceanview.pfeg.noaa.gov/topp/map";


//    public List<Especies> getAllEspeciesData() {
//        RestTemplate restTemplate = new RestTemplate();
//        ;
//        try {
//            ResponseEntity<Especies> response = restTemplate.getForEntity(
//                    String.format(baseUrl, Especies.class),
//                    Especies.class);
//            return Arrays.asList(response.getBody());
//        } catch (HttpClientErrorException e) {
//            throw new RuntimeException("CEP invalido!" + e.getMessage());
//        }
//    }

    public List<Focos> getAllTest() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Use ClassPathResource to get the InputStream of the file in classpath
            ClassPathResource resource = new ClassPathResource("./static/data/Focos.json");
            InputStream inputStream = resource.getInputStream();

            // Read the JSON from the InputStream
            return objectMapper.readValue(inputStream, new TypeReference<List<Focos>>() {});
        } catch (IOException e) {
            throw new RuntimeException("Failed to read JSON file", e);
        }
    }

    }
