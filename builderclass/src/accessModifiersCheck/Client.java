package accessModifiersCheck;
import accessModifiers.Student;
public class Client {
    public static void main(String[] args) {
        Student st = new Student();
        st.name ="sai";
        // student.psp = 95.0; -> psp is protected.
        // student.universityName = "ABC"; private
        // student.batchId = 987; -> default is accessible within the same package.

    }
}
