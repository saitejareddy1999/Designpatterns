package builder;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {//here we are not creating objects with new object
        // we are making to create it in builder class and student class to dont know the client
//        side

//        Builder builder = Student.getBuilder();
//        builder.setName("abc");
//        builder.setAge(12);
//        Student st = builder.build();
//        System.out.println("DEBUG");
        try {
            Student st = Student.getBuilder()
                    .setName("xyz")
                    .setAge(20)
                    .setUnvName("gitam")
                    .build();
            System.out.println("DEBUG");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
