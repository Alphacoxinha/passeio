package br.senac.rn.passeio.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class PasseioApplicationConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings( CorsRegistry registry){
        registry.addMapping("/**").allowedOrigins("https://a9262602-passeio.herokuapp.com").allowedMethods("GET", "POST");
    }

}
