package LoginApi.user.auth.resource;

import LoginApi.common.Device;

public class UserAuthResource {

    private String email;
    private String password;
    private String redirect;
    private Device device;
    private String createdAt;
    private String updatedAt;




    public UserAuthResource() {
    }

    public UserAuthResource(String email, String password, String redirect, Device device, String createdAt, String updatedAt) {
        this.email = email;
        this.password = password;
        this.redirect = redirect;
        this.device = device;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UserAuthResource(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRedirect() {
        return redirect;
    }

    public Device getDevice() {
        return device;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}


