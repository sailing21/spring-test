//package io.reflectoring.demo.config;
//
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.util.TestPropertyValues;
//import org.springframework.context.ApplicationContextInitializer;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.test.context.ContextConfiguration;
//import org.testcontainers.containers.MySQLContainer;
//import org.testcontainers.junit.jupiter.Container;
//import org.testcontainers.junit.jupiter.Testcontainers;
//
//import java.lang.annotation.*;
//
//@Target(ElementType.TYPE)
//@Retention(RetentionPolicy.RUNTIME)
//@Documented
//@SpringBootTest
//@Testcontainers
//@ExtendWith({})
//public @interface MySqlContainerConfig {
//
//    class Initializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
//        @Container
//        static final MySQLContainer<?> mysql = new MySQLContainer<>("mysql:8.0.33")
//                .withDatabaseName("test")
//                .withUsername("root")
//                .withPassword("root_123");
//
//        @Override
//        public void initialize(ConfigurableApplicationContext applicationContext) {
//            mysql.start();
//            TestPropertyValues.of(
//                    "spring.datasource.url=" + mysql.getJdbcUrl(),
//                    "spring.datasource.username=" + mysql.getUsername(),
//                    "spring.datasource.password=" + mysql.getPassword(),
//                    "spring.jpa.hibernate.ddl-auto=update"
//            ).applyTo(applicationContext);
//        }
//    }
//}
