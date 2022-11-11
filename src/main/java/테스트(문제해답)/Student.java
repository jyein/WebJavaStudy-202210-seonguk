package 테스트;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Student student) {
        if (student.id < id) {
            return 1;
        }else if (student.id > id) {
            return -1;
        }
        return 0;
    }
}