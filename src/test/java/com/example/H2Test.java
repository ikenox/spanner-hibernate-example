package com.example;

import org.hibernate.cfg.AvailableSettings;
import org.junit.Test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Map;

public class H2Test {
    @Test
    public void testSample() {
        Map<String, Object> properties = Map.of(
            AvailableSettings.DRIVER, "org.h2.Driver",
            AvailableSettings.URL, "jdbc:h2:mem:test",
            AvailableSettings.DIALECT, "org.hibernate.dialect.H2Dialect",
            AvailableSettings.HBM2DDL_DATABASE_ACTION, "drop-and-create"
        );
        EntityManagerFactory test = Persistence.createEntityManagerFactory("test", properties);
    }
}
