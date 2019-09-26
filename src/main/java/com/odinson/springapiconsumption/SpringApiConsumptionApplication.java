package com.odinson.springapiconsumption;

import com.odinson.springapiconsumption.entity.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.net.URI;


@SpringBootApplication
public class SpringApiConsumptionApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringApiConsumptionApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringApiConsumptionApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            URI uri = new URI("https://cat-fact.herokuapp.com/facts/");
            All item = restTemplate.getForObject(uri, All.class);
            log.info(item.toString());
        };
    }


}




