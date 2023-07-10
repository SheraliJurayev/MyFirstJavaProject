package school.managment.system;
/**
 * Created by Sh_Jurayeff on 10.07.2023
 * This class is responsible for keep the track of students fees , name , grade and fees
 * paid
 * */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    /**
     * To create a new student by initializing.
     * Fees for every students in $10,000.
     * Fees paid initially is 0.
     *
     * @param id    id for the student: unique
     * @param name  name of the student
     * @param grade grade of the student
     */

    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    // Not going to alter student's name, student id.

    /**
     * Used to update the student's grade.
     *
     * @param grade new grade of the student.
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Keep adding the fees to feesPaid Field.
     * add the fees to the fees paid.
     * the school is going to receive the funds.
     *
     * @param fees the fees that the student pays.
     */

    public void updateFeesPaid(int fees) {
        feesPaid += fees;

    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getGrade() {
        return grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
