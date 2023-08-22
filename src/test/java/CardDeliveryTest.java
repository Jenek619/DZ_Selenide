import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CardDeliveryTest {

    @Test
    public void shouldCardDeliveryTest() {
        open("http://localhost:9999");
        $("method=post");
        $("[type='text']").setValue("Нижний Новгород");
        $("[type='tel']").setValue("25.08.2023");
        $("[name='name']").setValue("Чистов Евгений");
        $("[name='phone']").setValue("+79200000000");
        $("[data-test-id='agreement']").click();
        $("[role='button']").click();
        $(withText("Успешно!")).shouldBe(Condition.exist);
    }

}
