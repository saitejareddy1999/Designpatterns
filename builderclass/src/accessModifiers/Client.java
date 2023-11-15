package accessModifiers;

public class Client {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "sai";
//        st.universityName = "GITAM";//it is a private not accessible
        st.batchId =123;
        st.psp = 90.9;
    }
}
