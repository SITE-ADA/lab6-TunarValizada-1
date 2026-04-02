package az.edu.ada.wm2.lab6.config;

import org.h2.server.web.JakartaWebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class H2ConsoleConfig {

    @Bean
    public ServletRegistrationBean<JakartaWebServlet> h2ConsoleServlet() {
        // Explicit mapping ensures the H2 web console is available at /h2-console/*.
        return new ServletRegistrationBean<>(
                new JakartaWebServlet(),
                "/h2-console/*"
        );
    }
}

