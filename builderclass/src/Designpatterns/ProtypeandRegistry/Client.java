package Designpatterns.ProtypeandRegistry;

public class Client {
    public static void fillRegistery(StudentRegistery studentRegistery){
        Student apr22Prototype = new Student();
        apr22Prototype.setAveragepsp(81.0);
        apr22Prototype.setBatchname("apr22");
        studentRegistery.add("apr22",apr22Prototype);
        IntelligentStudent sep22Prototype = new IntelligentStudent();
        sep22Prototype.setAveragepsp(91.0);
        sep22Prototype.setBatchname("sep22");
        sep22Prototype.setIq(180);
        studentRegistery.add("sep22",sep22Prototype);
    }

    public static void main(String[] args) {
        StudentRegistery studentRegistery = new StudentRegistery();
        fillRegistery(studentRegistery);
        Student sai = studentRegistery.get("apr22").clone();
        sai.setName("sai");
        sai.setAge(25);
        sai.setPsp(90);
        Student teja = studentRegistery.get("sep22").clone();
        teja.setName("teja");
        teja.setAge(25);
        teja.setPsp(99);
        System.out.println("DEBUG");
    }
//    public static void main(String[] args) {
//        Student apr22batch = new Student();
//        apr22batch.setAveragepsp(81.0);
//        apr22batch.setBatchname("apr22");
//        Student sep22batch = new Student();
//        sep22batch.setAveragepsp(91.0);
//        sep22batch.setBatchname("sep22");
//        Student sai = apr22batch.clone();
//        sai.setName("sai");
//        sai.setAge(25);
//        sai.setPsp(90);
//        Student teja = sep22batch.clone();
//        teja.setName("teja");
//        teja.setAge(25);
//        teja.setPsp(99);
//        System.out.println("DEBUG");
//
//    }
}
