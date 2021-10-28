package Exam07;
import java.util.*;

class Student_07 {
    int id;
    String tel;
    public Student_07(int id, String tel) {
        this.id = id; this.tel = tel;
    }
    public int getId() {
        return id;
    }
    public String getTel(){
        return tel;
    }
}

public class HashMapStudentEx_07 {
    public static void main(String[] args) {
        HashMap<String, Student_07> map = new HashMap<String, Student_07>();

        map.put("황기태", new Student_07(1, "010-111-1111"));
        map.put("이재문", new Student_07(2, "010-222-2222"));
        map.put("김남윤", new Student_07(3, "010-333-3333"));
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("검색할 이름?");
            String name = scanner.nextLine();
            if(name.equals("exit"))
                break;
            Student_07 student = map.get(name);
            if(student == null)
                System.out.println(name + "은 없는 사람입니다.");
            else
                System.out.println("id:" + student.getId() + ", 전화:" + student.getTel());
        }
        scanner.close();
    }
}
