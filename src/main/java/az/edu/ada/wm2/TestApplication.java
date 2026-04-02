package az.edu.ada.wm2;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Test bootstrap configuration.
 *
 * The provided unit tests live under {@code az.edu.ada.wm2.*} packages.
 * Having a {@code @SpringBootApplication} in this package allows Spring
 * test annotations like {@code @SpringBootTest} / {@code @DataJpaTest}
 * to find a {@code @SpringBootConfiguration} by package scanning.
 */
@SpringBootApplication(scanBasePackages = "az.edu.ada.wm2")
public class TestApplication {
}

