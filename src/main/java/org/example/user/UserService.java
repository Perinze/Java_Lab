package org.example.user;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class UserService {

    public UserService() {
        users = new HashMap<>();
    }

    public User login(String name, String password) {
        User user = users.get(name);
        if (null == user) {
            //throw new RuntimeException("user not found");
            return null;
        }
        if (!password.equals(user.password)) {
            //throw new RuntimeException("wrong password");
            return null;
        }
        return user;
    }

    public void register(User user) {
        System.out.println(user.toString());
        users.putIfAbsent(user.name, user);
    }

    public boolean check(String field, String value) {
        switch (field) {
            case "name":
            case "tel":
            case "email":
                try {
                    if (duplicate(field, value)) {
                        return false;
                    }
                } catch (NoSuchFieldException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
        }
        return true;
    }

    private boolean duplicate(String f, String v) throws NoSuchFieldException, IllegalAccessException {
        Class cls = User.class;
        Field field = cls.getDeclaredField(f);
        field.setAccessible(true);
        for (User user : users.values()) {
            if (v.equals(field.get(user))) {
                return true;
            }
        }
        return false;
    }

    private Map<String, User> users;
}
