package com.restcountries.restcountries;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestcountriesApplication {

  private static final Logger log = LoggerFactory.getLogger(RestcountriesApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(RestcountriesApplication.class, args);
  }

  @Bean
  public RestTemplate restTemplate(RestTemplateBuilder builder) {
    return builder.build();
  }

  @Bean
  public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
    return args -> {
      Country country = restTemplate.getForObject("https://restcountries.eu/rest/v2/alpha/id", Country.class);
      log.info(country.toString());
    };
  }

}
