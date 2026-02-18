public class StudentAnswer {
  // instance variables
  private String studentName;
  private String[] answer = new String[20];
  // constructor
  public StudentAnswer(String n, String[] arr){
    studentName = n;
    for ( int i=0; i<answer; i++){
        answer[i] = arr[i];
    }
  }
  
  // instance methods
public String getName(){
    return studentName;
}
public String[] getAnswer(){
    return answer;
}
public toString(){
    String fin = name + "\n"
    for ( int i=0; i<answer; i++){
        fin += (i+1) + ") \t" + answer[i] + "\n";
    }
    return  fin;
}

  
}