package business;

public class Sudent {

  int studentId;
  String studentName;

  public Sudent() {
  }

  public Sudent(int studentId, String studentName) {
    this.studentId = studentId;
    this.studentName = studentName;
  }

  public int getStudentId() {
    return studentId;
  }

  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

}
