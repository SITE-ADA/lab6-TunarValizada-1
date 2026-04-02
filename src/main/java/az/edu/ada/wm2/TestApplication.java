package az.edu.ada.wm2;

import az.edu.ada.wm2.lab6.Lab6Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * Test bootstrap configuration.
 *
 * The provided unit tests live under {@code az.edu.ada.wm2.*} packages.
 * Having a {@code @SpringBootApplication} in this package allows Spring
 * test annotations like {@code @SpringBootTest} / {@code @DataJpaTest}
 * to find a {@code @SpringBootConfiguration} by package scanning.
 */
@SpringBootApplication(scanBasePackages = "az.edu.ada.wm2")
@ComponentScan(
        basePackages = "az.edu.ada.wm2",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ASSIGNABLE_TYPE,
                classes = Lab6Application.class
        )
)
public class TestApplication {
}

