package hw2_7;

import java.util.Objects;

public class Employee {
    private Integer passport;
    private String Names;

    public Integer getPassport() {
        return passport;
    }

    public void setPassport(Integer passport) {
        this.passport = passport;
    }

    public String getNames() {
        return Names;
    }

    public void setNames(String names) {
        Names = names;
    }

    public Employee(Integer passport, String names) {
        this.passport = passport;
        Names = names;
    }

    public static void printAllEmployee() {
    }

    public Employee() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "passport=" + passport +
                ", Names='" + Names + '\'' +
                '}';
    }
}

