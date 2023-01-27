import transport.Transport;

import java.util.Objects;

public class mechanic {
    private final String firstName;
    private final String lastName;
    private String company;
    private final skill skill;

    public mechanic(String firstName, String lastName, String company, skill skill) {
        if (firstName == null || firstName.isEmpty()) {
            this.firstName = "Иван";
        } else {
            this.firstName = firstName;
        }
        if (lastName == null || lastName.isEmpty()) {
            this.lastName = "Иванов";
        } else {
            this.lastName = lastName;
        }
        setCompany(company);
        this.skill = skill;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setCompany(String company) {
        if (company == null || company.isEmpty()) {
            this.company = "Нет информации";
        } else {
            this.company = company;
        }
    }

    public skill getSkill() {
        return skill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        mechanic mechanic = (mechanic) o;
        return Objects.equals(firstName, mechanic.firstName) && Objects.equals(lastName, mechanic.lastName) && Objects.equals(company, mechanic.company) && Objects.equals(skill, mechanic.skill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, company, skill);
    }
    private void technicalService(Transport transport) {
        System.out.println("Механик "+ firstName + " " + lastName + " проводит техническое обслуживание " + skill + "," + transport.getBrand() + " " + transport.getModel());
    }

    private void fixCar(Transport transport) {
        System.out.println("Механик "+ firstName + " " + lastName + " чинит автомобиль " + skill + "," + transport.getBrand() + " " + transport.getModel());
    }
}
