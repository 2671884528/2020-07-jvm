package com.gyg.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @auther 郭永钢
 * @data 2020/7/26 21:55
 * @desc: 流式编程
 */
class User {
    int age;
    String name;
    boolean sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public User(int age, String name, boolean sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;

    }
}

public class Main {

    public static void main(String[] args) {
        User user1 = new User(10, "gyg", true);
        User user2 = new User(18, "yu", false);
        User user3 = new User(20, "gy", true);
        User user4 = new User(9, "yugy", false);
        List<User> list = Arrays.asList(user1, user2, user3,user4);

        list.stream()
                .filter(user -> {return user.getAge() >=10;})
                .filter(user -> {return user.getName().contains("y");})
                .map(user -> {return user.getName().toUpperCase();})
                .sorted((o1, o2) -> o2.compareTo(o1))
                .limit(2)
                .forEach(System.out::println);
    }
}
