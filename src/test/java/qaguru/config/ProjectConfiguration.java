package qaguru.config;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class ProjectConfiguration {
    private final WebConfig webConfig;

    public ProjectConfiguration(WebConfig webConfig) {
        this.webConfig = webConfig;
    }

    public void webConfig() {

        System.out.println("env = " + System.getProperty("env"));
        System.out.println("isRemote = " + webConfig.isRemote());

        Configuration.baseUrl = webConfig.getBaseUrl();
        Configuration.browserSize = webConfig.getBrowserSize();
        Configuration.browser = webConfig.getBrowserName();
        Configuration.browserVersion = webConfig.getBrowserVersion();
        Configuration.pageLoadStrategy = "eager";

        if (webConfig.isRemote()) {
            System.out.println("Remote mode enabled. URL: " + webConfig.getRemoteUrl());
            Configuration.remote = String.valueOf(webConfig.getRemoteUrl());

//            String remoteUrl = String.format(
//                    "https://%s:%s@%s/wd/hub",
//                    webConfig.selenoidLogin(),
//                    webConfig.selenoidPassword(),
//                    webConfig.selenoidHost()
//            );
//            Configuration.remote = remoteUrl;

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("selenoid:options", Map.of(
                    "enableVNC", true,
                    "enableVideo", true
            ));
            Configuration.browserCapabilities = capabilities;
        }
    }
}
