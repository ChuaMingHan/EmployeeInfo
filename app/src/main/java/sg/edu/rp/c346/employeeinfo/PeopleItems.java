package sg.edu.rp.c346.employeeinfo;

import java.util.Calendar;

/**
 * Created by 17010265 on 07/17/2018.
 */

public class PeopleItems {

    private String people;
    private String position;
    private String salary;

    public PeopleItems(String people, String position, String salary) {
        this.people = people;
        this.position = position;
        this.salary = salary;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "PeopleItem{" +
                "people='" + people + '\'' +
                "position='" + position + '\'' +
                "salary='" + salary + '\'' +
                '}';
    }
}

