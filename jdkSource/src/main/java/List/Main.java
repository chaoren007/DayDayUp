package List;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * <p> @TODO <p>
 * <p>Author: LiquorSea</p>
 * <p>Version: 1.0.0</p>
 * <p>Create Date：2019/10/30</p>
 * <p>Modified By：LiquorSea</p>
 * <p>Modified Date: 2019/10/30 </p>
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list  = new ArrayList<>();
        LinkedList<Student> linkedList = new LinkedList<>();
        Student Ming = new Student("000001", "xiaoMing");
        Student Hong = new Student("000002", "xiaoHong");
        list.add(Ming);
        list.add(Hong);
        linkedList.add(Ming);
        System.out.println(list.size());
        for (Student student : list) {
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
    }
}

class Student {
    private  String id;
    private  String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public  String getId() {
        return id;
    }

    public  void setId(String id) {
        this.id = id;
    }

    public  String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }
}
