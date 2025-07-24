package qaguru.config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class ProjectConfiguration {

    public static WebConfig config = ConfigFactory.create(WebConfig.class);


    public static void setConfig() {

        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browserSize = config.getBrowserSize();
        Configuration.browser = config.getBrowserName();
        Configuration.browserVersion = config.getBrowserVersion();
        Configuration.pageLoadStrategy = "eager";


        if (config.isRemote()) {
            Configuration.remote = config.getRemoteUrl();

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("selenoid:options", Map.of(
                    "enableVNC", true,
                    "enableVideo", true
            ));
            Configuration.browserCapabilities = capabilities;
        }
    }
}
