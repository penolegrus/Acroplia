package LoginApi.common;

public class Tokens {

    private String fcmToken;
    private String apnsToken;

    public Tokens() {
    }

    public Tokens(String fcmToken, String apnsToken) {
        this.fcmToken = fcmToken;
        this.apnsToken = apnsToken;
    }

    public String getFcmToken() {
        return fcmToken;
    }

    public String getApnsToken() {
        return apnsToken;
    }
}
