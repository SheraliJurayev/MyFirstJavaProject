package school.managment.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher shodiya  = new Teacher(1,"Shodiya" , 500);
        Teacher nilufar = new Teacher(2,"Nilufar" , 700);
        Teacher sitora = new Teacher(3,"Sitora" , 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(shodiya);
        teacherList.add(nilufar);
        teacherList.add(sitora);

        Student abdurahmon = new Student(1,"Abdurahmon" ,5);
        Student sherali = new Student(2,"Sherali" ,4);
        Student ilyos = new Student(3,"Ilyosbek" ,3);

        List<Student> studentList = new ArrayList<>();
        studentList.add(abdurahmon);
        studentList.add(sherali);
        studentList.add(ilyos);

        School sixth = new School(teacherList,studentList);

        Teacher asadbey = new Teacher(4 ,"Nargiza",1000);
        sixth.addTeacher(asadbey);

        abdurahmon.payFees(5000);
        sherali.payFees(6000);
        ilyos.payFees(9000);
        ilyos.payFees(11000);

        System.out.println("Sixth school has earned $" + sixth.getTotalMoneyEarned());

        System.out.println("----------Making Sixth school pay salary-----------");
        nilufar.receiveSalary(nilufar.getSalary());
        System.out.println("Sixth school has spent for salary to " + nilufar.getName()
        + "and now has $" + sixth.getTotalMoneyEarned());

        System.out.println(sherali);

        nilufar.receiveSalary(nilufar.getSalary());

        System.out.println(nilufar);
    }
}
