import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UnitTest {

  // instance variables
  private  final String[] key = {"B", "D", "C", "A", "E", "A", "B", "A", "E", "B", "B", "E", "E", "D", "D", "A", "C", "C", "A", "E"};
  private StudentAnswer[] studentAnswers = new String[14];
  // constructor
  public UnitTest(String csv) throws IOException{
    File f = new File(csv);
    try {
      Scanner scan = new Scanner(f);

      scan.nextLine();
      int i=0;
      while (scan.hasNext()){
        String[] line = scan.nextLine().split(",");
        String[] tempAnswers = new String[line.length -1];
        for (int j =1; j < line.length; j ++){
          tempAnswers[j] = line[j];
        }
        studentAnswers[i] = new StudentAnswer(line[0], tempAnswers);
        i++;
      }
      scan.close();
    } catch (FileNotFoundException e){
      e.printStackTrace();
    }
    
  }
  
  // instance methods


  
}
