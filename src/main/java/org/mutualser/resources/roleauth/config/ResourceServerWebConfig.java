package org.mutualser.resources.roleauth.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan({ "org.mutualser.resources.roleauth.web.controller" })
public class ResourceServerWebConfig implements WebMvcConfigurer {
    //
}
