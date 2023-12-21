package company;

import java.time.LocalDate;

public class Manager extends Employee {
    private final int teamSize;
    private final String[] teamMembers;

    public Manager(String name, LocalDate date, double salary, String department, int teamSize, String[] teamMembers) {
        super(name, date, salary, department);
        this.teamSize = teamSize;
        this.teamMembers = teamMembers;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public String[] getTeamMembers() {
        return teamMembers;
    }


    @Override
    public void work() {
        System.out.println("Hey, quick work!");

    }

    @Override
    public void takeBreak() {
        System.out.println("Drink espresso. ");

    }
}
