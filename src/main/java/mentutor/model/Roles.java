package mentutor.model;

import static mentutor.model.PageNavigation.*;

public enum Roles {
    Admin("admin.mentutor@gmail.com", "Admin123$", ADMIN_HOMEPAGE),
    Mentor("lutfiyanrizaamadaa@gmail.com", "TesDicoba1!", MENTOR_HOMEPAGE),
    Mentee("menteeriza@gmail.com", "TesDicoba1!", MENTEE_HOMEPAGE);

    public final String username;
    private final String password;
    private final String pageURL;

    Roles(String username, String password, String pageURL) {
        this.username = username;
        this.password = password;
        this.pageURL = pageURL;
    }

    private String username(){
        return username;
    }
    private String password(){
        return password;
    }
    private String pageURL(){
        return pageURL;
    }
}
