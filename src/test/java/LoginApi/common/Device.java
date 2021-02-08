package LoginApi.common;

public class Device {

    private String uuid;
    private String platform;
    private String vendor;
    private String model;
    private String osVersion;
    private String locale;
    private Tokens tokens;

    public Device() {
    }

    public Device(String uuid, String platform, String vendor, String model, String osVersion, String locale, Tokens tokens) {
        this.uuid = uuid;
        this.platform = platform;
        this.vendor = vendor;
        this.model = model;
        this.osVersion = osVersion;
        this.locale = locale;
        this.tokens = tokens;
    }

    public String getUuid() {
        return uuid;
    }

    public String getPlatform() {
        return platform;
    }

    public String getVendor() {
        return vendor;
    }

    public String getModel() {
        return model;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public String getLocale() {
        return locale;
    }

    public Tokens getTokens() {
        return tokens;
    }
}
