package pages.courses;

import annotations.UrlPrefix;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

import static org.assertj.core.api.Assertions.assertThat;

@UrlPrefix("/lessons/avtomatizaciya-web-testirovaniya/")
public class PythonCoursePage extends BasePage<PythonCoursePage> {

    private final String title = "Курс по автоматизации тестирования и поиска неисправностей в бекенде и фронтенде с использованием Selenium и языка Python";

    public PythonCoursePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void checkOpenPage() {
        assertThat(getTitlePage()).isEqualToIgnoringCase(title);
    }
}