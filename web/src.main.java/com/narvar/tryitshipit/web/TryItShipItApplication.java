package com.narvar.tryitshipit.web;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.narvar.tryitshipit.web.persistence")
public class TryItShipItApplication {
}
