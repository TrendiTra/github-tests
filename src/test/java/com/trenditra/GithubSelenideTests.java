package com.trenditra;
/*
Разработайте следующий автотест:

 - Откройте страницу Selenide в Github

 - Перейдите в раздел Wiki проекта

 - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions

 - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
 */

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GithubSelenideTests {

    @Test
    void findCodeForJunit5() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();

        $x("//a[contains(text(),'Soft assertions')]").shouldHave(text("Soft assertions"));

        $x("//a[contains(text(),'Soft assertions')]").click();

        $("#wiki-body").shouldHave(text("3. Using JUnit5 extend test class:"));
    }
}
