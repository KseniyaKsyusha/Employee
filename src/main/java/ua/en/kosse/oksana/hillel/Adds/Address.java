package ua.en.kosse.oksana.hillel.Adds;

import ua.en.kosse.oksana.hillel.Employee;

public class Address {
    private String adr;
    private Employee employee;

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Address{" +
                "adr = '" + adr + '\'' +
                ", employee = " +" \n "+ employee +
                '}';
    }
}
