package company;

import java.time.LocalDate;

public class HRManager extends Employee {
    private int numberOfRecruitments;
    private String[] candidateList;


    public HRManager(String name, LocalDate date, double salary, String department, int numberOfRecruitments, String[] candidateList) {
        super(name, date, salary, department);
        this.numberOfRecruitments = numberOfRecruitments;
        this.candidateList = candidateList;
    }

    public int getNumberOfRecruitments() {
        return numberOfRecruitments;
    }

    public String[] getCandidateList() {
        return candidateList;
    }

    public void setNumberOfRecruitments(int numberOfRecruitments) {
        if (numberOfRecruitments < 0)
            throw new IllegalArgumentException("Число соискателей не может быть отрицательным.");
        this.numberOfRecruitments = numberOfRecruitments;
    }

    public void setCandidateList(String[] candidateList) {
        this.candidateList = candidateList;
    }

    @Override
    public void work() {
        System.out.println("Принесите справку о справке");

    }

    @Override
    public void takeBreak() {
        System.out.println("Drink cappuccino");

    }
}
