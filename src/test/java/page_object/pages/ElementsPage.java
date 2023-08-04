package page_object.pages;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ElementsPage {

    @Test
    void fillFormTest() {
        open("https://demoqa.com/text-box");
        Configuration.browserSize=("1920х1080");
        $("[id=userName]").setValue("Иван Иванович");
        $("[id=userEmail]").setValue("mail@mail.ru");
        $("[id=currentAddress]").setValue("адресс");
        $("[id=permanentAddress]").setValue("еще какой-то адрес");
        $("[id=submit]").click();

    }


}
