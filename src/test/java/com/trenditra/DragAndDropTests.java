package com.trenditra;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Запрограммируйте Drag&Drop с помощью Selenide.actions()
 *
 *  - Откройте https://the-internet.herokuapp.com/drag_and_drop
 *
 *  - Перенесите прямоугольник А на место В
 *
 *  - Проверьте, что прямоугольники действительно поменялись
 *
 * P.S. В Selenide есть команда $(element).dragAndDrop($(to-element)), проверьте работает ли тест, если использовать её вместо actions()
 */

public class DragAndDropTests {

    @Test
    void dragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDrop(to($("#column-b")));

        $("#column-b").shouldHave(text("A"));
    }
}
