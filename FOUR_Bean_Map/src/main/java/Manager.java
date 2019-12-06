import java.util.Map;

public class Manager {
    private Map<String,User> userMap;
    public Map<String, User> getUserMap() {
        return userMap;
    }
    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }
}
