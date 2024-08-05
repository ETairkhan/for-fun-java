public class MainProgram{
    public static void main(String[] args){
        Teacher teacher = new Teacher();
        int grading =teacher.grade();
        System.out.println("the grade: " + grading);
    }
}