package config;

import org.aeonbits.owner.Config;
import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:${env}.properties"
})
public interface WebConfig extends Config {
    @Key("browser")
    @DefaultValue("chrome")
    String getBrowserName();

    @Key("browserVersion")
    @DefaultValue("113")
    String getBrowserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("baseUrl")
    @DefaultValue("https://loylabs.ru/")
    String getBaseUrl();

    @Key("remoteUrl")
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub")
    URL getRemoteUrl();

    @Key("isRemote")
    @DefaultValue("false")
    boolean isRemote();
}
