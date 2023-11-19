package Designpatterns.ProtypeandRegistry;

public class Student implements prototype<Student> {
    private String Name;
    private double psp;
    private int age;
    private double Averagepsp;
    private String Batchname;
    private String internalState = "success";

    public void setName(String name) {
        Name = name;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAveragepsp(double averagepsp) {
        Averagepsp = averagepsp;
    }

    public void setBatchname(String batchname) {
        Batchname = batchname;
    }

    public String getName() {
        return Name;
    }

    public double getPsp() {
        return psp;
    }

    public int getAge() {
        return age;
    }

    public double getAveragepsp(double v) {
        return Averagepsp;
    }

    public String getBatchname() {
        return Batchname;
    }
    public Student(){


    }
    public Student(Student student){
        this.Name = student.Name;
        this.age = student.age;
        this.psp = student.psp;
        this.Batchname = student.Batchname;
        this.Averagepsp = student.Averagepsp;
        this.internalState = student.internalState;
    }

    @Override
    public Student clone() {
        return new Student(this);
//        Student st = new Student();
//        st.Averagepsp = this.Averagepsp;
//        st.age = this.age;
//        st.psp = this.psp;
//        st.Name = this.Name;
//        st.Batchname = this.Batchname;
//        st.internalState = this.internalState;
//        return st;
    }
}
