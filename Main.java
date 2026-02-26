import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws FileNotFoundException{
    UnitTest test = new UnitTest("student-answers.csv"); 
    int totalCorrect = 0;
    int totalStudents = 0;
    int totalPass = 0;
    for (StudentAnswer student: test.getStudentAnswers()){
      boolean pass =  test.totalCorrect(student.getName()) >= 14;
      System.out.println(student.getName() + ": " + test.totalCorrect(student.getName()) + ". Passed: " + pass + ".");
      totalCorrect += test.totalCorrect(student.getName()) ;
      totalStudents ++;
      if (pass){
        totalPass ++;
      }
    }
    System.out.println("Total passing: " + totalPass);
    System.out.println("Average score: " + ((double) (totalCorrect/totalStudents))); 
  }
}
