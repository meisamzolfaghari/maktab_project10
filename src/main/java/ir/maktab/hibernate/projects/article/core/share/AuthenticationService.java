package ir.maktab.hibernate.projects.article.core.share;


import ir.maktab.hibernate.projects.article.model.User;

import java.util.Objects;

public class AuthenticationService {
    private User loginUser;
    private static AuthenticationService authenticationService = null;

    public static AuthenticationService getInstance() {
        return Objects.requireNonNullElseGet(authenticationService, () -> authenticationService = new AuthenticationService());
    }

    private AuthenticationService() { }

    public void setLoginUser(User user) {
        this.loginUser = user;
    }

    public User getLoginUser() {
        return loginUser;
    }

}
