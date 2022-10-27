package j11_배열.StudentManagement;

public class StudentRepository {

    private Student[] students;

    public StudentRepository(Student[] students) {
        students = new Student[0];
    }

    public void addStudent(Student student) {
        int index = indexOfEmpty();

        if (index == -1) {
            index = increaseArray();
        }
        students[index] = student;
    }

    private int indexOfEmpty() {

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                return i;
            }
        }
        return -1;

    }

    private int increaseArray() {
        Student[] tempArray = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            tempArray[i] = students[i];
        }
        students = tempArray;

        return tempArray.length -1;
    }

}
