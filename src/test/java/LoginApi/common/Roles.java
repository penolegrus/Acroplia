package LoginApi.common;

public class Roles {

    private String id;
    private String type;

    public Roles() {
    }

    public Roles(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

}
