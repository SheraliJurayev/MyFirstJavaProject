package school.managment.system;

/**
 * This class is responsible for keeping the track
 * of teacher's name, id and salary.
 */
public class Teacher {
    private int  id ;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new Teacher objects.
     * @param id id for the teacher.
     * @param name name for the teacher.
     * @param salary salary for the teacher.
     */
    public Teacher(int id, String name ,int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     *
     * @return the id of the teacher.
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return name of the teacher.
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return the salary of the teacher.
     */
    public int getSalary(){
        return salary;
    }

    /**
     * Set the salary.
     * @param salary
     */
    public void setSalary(int salary){
        this.salary = salary;
    }

    /**
     * Adds to salary.
     * Removes from the total money earned by the school.
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }
}
