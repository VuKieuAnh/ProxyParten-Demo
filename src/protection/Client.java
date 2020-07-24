package protection;

public class Client {
    public static void main(String[] args) {
        UserService admin = new UserServiceProxy("admin", "KieuAnh");
        admin.load();
        admin.insert();

        UserService user1 = new UserServiceProxy("user", "UserName");
        user1.load();
        user1.insert();
    }
}
