package cc.niushuai.projects.demos.log.entity;

/**
 * TODO
 *
 * @author niushuai
 * @date 2021/12/13 10:51
 */
public class UserInfo {

    private String id;
    private String username;

    public UserInfo() {
    }

    public UserInfo(String id, String username) {
        this.id = id;
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
