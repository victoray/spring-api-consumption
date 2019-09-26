package com.odinson.springapiconsumption;

import com.odinson.springapiconsumption.entity.Cat;
import com.odinson.springapiconsumption.entity.Category;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI("https://cat-fact.herokuapp.com/facts/591d9bb2227c1a0020d26826");
        Cat item = restTemplate.getForObject(uri, Cat.class);
        log.info(item.toString());
    }
}
