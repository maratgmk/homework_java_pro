package company;

import java.time.LocalDate;

public class Developer extends Employee{
    private final String programmingLanguage;
    private boolean isRemote;

    public Developer(String name, LocalDate date, double salary, String department, String programmingLanguage, boolean isRemote) {
        super(name, date, salary, department);
        this.programmingLanguage = programmingLanguage;
        this.isRemote = isRemote;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public boolean isRemote() {
        return isRemote;
    }

    public void setRemote(boolean remote) {
        if (!remote){
            throw new IllegalArgumentException("Работа в офисе не является удаленной!");
        }
        isRemote = true;
    }

    @Override
    public void work() {
        System.out.println("Написал код " + "if(true)System.out.print(!false)");

    }

    @Override
    public void takeBreak() {
        System.out.println("Drink americano");

    }
}
