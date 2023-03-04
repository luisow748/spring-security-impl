package com.luisow748.springsecurityimpl.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.yml")
@AllArgsConstructor
public class ConfigProperties {
    private final Environment env;

    public String getConfigValue(String key) {
        return env.getProperty(key);
    }
}
