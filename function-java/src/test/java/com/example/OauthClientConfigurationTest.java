package com.example;

import io.micronaut.security.oauth2.configuration.OauthClientConfiguration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.testcontainers.junit.jupiter.Testcontainers;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.assertFalse;

@Testcontainers(disabledWithoutDocker = true)
class OauthClientConfigurationTest extends AbstractTest {

    @BeforeAll
    public static void setupSpec() {
        try {
            startHandler(Collections.singletonMap("dynamodb.table-name", "todo"));
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Test
    void beanOfTypeOauthClientConfigurationDoesNotExist() {
        assertFalse(containsBean(OauthClientConfiguration.class));
    }
}
