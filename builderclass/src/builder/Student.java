package builder;

public class Student {
    private String name;
    private String unvName;
    private int age;
    private String batchName;
    private String phone;
    private Student(Builder builder){
        if (builder.getAge() > 100){
            throw new RuntimeException();
        }
        this.name = builder.getName();
        this.age = builder.getAge();
        this.unvName = builder.getUnvName();
        this.batchName = builder.getBatchname();
        this.phone = builder.getPhone();
    }

    public String getName() {
        return name;
    }

    public String getUnvName() {
        return unvName;
    }

    public int getAge() {
        return age;
    }

    public String getBatchName() {
        return batchName;
    }

    public String getPhone() {
        return phone;
    }
    public static Builder getBuilder(){
        return new Builder();
    }//here student class should know the builder class with new object
    static class Builder {
        private String name;
        private String unvName;
        private int age;
        private String batchname;
        private String phone;

        public Builder setName(String name) {//here if we not return builder object with another
            // methods will not return correct one
            this.name = name;
            return this;
        }

        public Builder setUnvName(String unvName) {
            this.unvName = unvName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public void setBatchname(String batchname) {
            this.batchname = batchname;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getUnvName() {
            return unvName;
        }

        public int getAge() {
            return age;
        }

        public String getBatchname() {
            return batchname;
        }

        public String getPhone() {
            return phone;
        }
        public Student build(){
            return new Student(this);
        }
    }

}
