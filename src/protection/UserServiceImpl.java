package protection;

public class UserServiceImpl implements UserService {
    private String name;

    public UserServiceImpl(String name) {
        this.name = name;
    }

    @Override
    public void load() {
        System.out.println(name + " load");
    }

    @Override
    public void insert() {
        System.out.println(name+ " insert");
    }
}
