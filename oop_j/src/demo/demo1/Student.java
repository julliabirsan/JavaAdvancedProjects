package demo.demo1;

public class Student extends Person{
    public String studentId;
    private Materie materie1;
    public Materie materie2;

    public Student(String nume, String cnp, String studentId){
        super(nume, cnp);
        this.studentId = studentId;
        System.out.println("constructor copil");

    }
    public Student(){
        super("drsbjgb", "jhgfjdh");
    }


    public void setStudentId(String studentId){
        this.studentId = studentId;
    }
    public String getStudentId(){
        return studentId;
    }

    @Override
    public void speak(String text){
        System.out.println(text + "student");
    }
    public void speak(String text1, String text2){

    }
}
