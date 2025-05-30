package backend.backend.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration

public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedHeaders("*")
            .allowedOrigins("http://siat-frontend-cmion.s3-website.ap-northeast-2.amazonaws.com")
            .allowedMethods("*")
            .allowCredentials(true) ;
    }
}
