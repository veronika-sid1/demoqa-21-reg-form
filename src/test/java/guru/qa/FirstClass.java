package guru.qa;

import org.junit.jupiter.api.*;

public class FirstClass {

    @BeforeAll
    static void beforeAll() {
    }

    @AfterAll
    static void afterAll() {
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("    beforeEach()");
    }

    @AfterEach
    void afterEach() {
        System.out.println("    afterEach()");
    }

    @Test
    void firstTest() {
        //open("https://www.google.ru/");
        System.out.println("        firstTest()");
        Assertions.assertTrue(3 > 2);
    }
}
