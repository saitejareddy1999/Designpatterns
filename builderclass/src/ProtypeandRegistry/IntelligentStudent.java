package ProtypeandRegistry;

public class IntelligentStudent extends Student{
    private int iq;
    public IntelligentStudent(){}
    public IntelligentStudent(IntelligentStudent intelligentStudent){
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
//        IntelligentStudent ist = new IntelligentStudent();
//        ist.setName(ist.getName());
//        ist.setAge(ist.getAge());
//        ist.setPsp(ist.getPsp());
//        ist.setAveragepsp(ist.getAveragepsp(81.0));
//        ist.setBatchname(ist.getBatchname());
//        ist.iq = this.iq;
//        return ist;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
