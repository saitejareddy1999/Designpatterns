//package Designpatterns.builder;
//
//public class Builder {
//    private String name;
//    private String unvName;
//    private int age;
//    private String batchname;
//    private String phone;
//
//    public Builder setName(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public Builder setUnvName(String unvName) {
//        this.unvName = unvName;
//        return this;
//    }
//
//    public Builder setAge(int age) {
//        this.age = age;
//        return this;
//    }
//
//    public void setBatchname(String batchname) {
//        this.batchname = batchname;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getUnvName() {
//        return unvName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getBatchname() {
//        return batchname;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//    public Student build(){
//        return new Student(this);
//    }
//}
