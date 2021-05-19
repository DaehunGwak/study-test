package daehun.selenium.boilerplate;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class TemplateTest {

    static final String MAIN_PAGE_URL = "https://vibe.naver.com";
    static WebDriver driver;

    @BeforeAll
    static void setUp() {
        driver = new FirefoxDriver();
        driver.get(MAIN_PAGE_URL);
    }

    @Test
    @DisplayName("메인 페이지 렌더링 테스트")
    void mainPageRenderingTest() {
        WebElement home = driver.findElement(By.className("home"));
        assertThat(home.isDisplayed()).isTrue();
    }

    @AfterAll
    static void tearDown() {
        driver.close();
    }
}
