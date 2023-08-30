package pl.coderslab.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "pl.coderslab.beans")
@Configuration
public class ApplicationConfig {
}
