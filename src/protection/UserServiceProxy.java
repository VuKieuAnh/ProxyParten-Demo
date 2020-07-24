package protection;

public class UserServiceProxy implements UserService {
    private String role;

    private UserService userService;

    private boolean isAdmin() {
        return "admin".equalsIgnoreCase(this.role);
    }

    public UserServiceProxy(String role, String username) {
        this.role = role;
        this.userService = new UserServiceImpl(username);
    }

    @Override
    public void load() {
        userService.load();
    }

    @Override
    public void insert() {
        if (isAdmin()) {
            userService.insert();
        } else {
            throw new IllegalAccessError("Access denied");
        }
    }
}
