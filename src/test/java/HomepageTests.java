import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.proxy.RequestMatcher;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;


public class HomepageTests {

    private final SelenideElement homepageHeading = $("h1.heading");

    @BeforeAll
    public static void setup() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com/";
        Configuration.browser = "chrome";
        Configuration.downloadsFolder = "/build/downloads";
        Configuration.timeout = 15000;
    }

    @Test
    public void ensureTheHomepageOpensAndHasTheCorrectUrl() {
        Selenide.open(Configuration.baseUrl);
        webdriver().shouldHave(url(Configuration.baseUrl));
    }

    @Test
    public void waitForHomepageToLoadAndTitleToBeDisplayed() {
        Selenide.open(Configuration.baseUrl);
        homepageHeading.shouldBe(visible, Duration.ofSeconds(20));
        homepageHeading.shouldHave(text("Welcome to the-internet"), Duration.ofSeconds(10));
    }

    @AfterAll
    public static void teardown() {
        WebDriverRunner.driver().close();
    }
}
