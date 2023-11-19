package Designpatterns.builder;

public class Client {
    public static void main(String[] args) {//here we are not creating objects with new object
        // we are making to create it in Designpatterns.builder class and student class to dont know the client
//        side

//        Builder Designpatterns.builder = Student.getBuilder();
//        Designpatterns.builder.setName("abc");
//        Designpatterns.builder.setAge(12);
//        Student st = Designpatterns.builder.build();
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
