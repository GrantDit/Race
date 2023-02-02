package transport;
import java.util.Objects;
public class Mechanic {
    private final String firstName;
    private final String lastName;
    private String company;
    private final Skill Skill;

    public Mechanic(String firstName, String lastName, String company, Skill skill) {
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
        this.Skill = skill;
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

    public Skill getSkill() {
        return Skill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(firstName, mechanic.firstName) && Objects.equals(lastName, mechanic.lastName) && Objects.equals(company, mechanic.company) && Objects.equals(Skill, mechanic.Skill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, company, Skill);
    }

    public void technicalService(Transport transport) {
        System.out.println("Механик " + firstName + " " + lastName + " проводит техническое обслуживание " + "," + transport.getBrand() + " " + transport.getModel());
    }

    public void fixCar(Transport transport) {
        System.out.println("Механик " + firstName + " " + lastName + " чинит автомобиль " + "," + transport.getBrand() + " " + transport.getModel());
    }

    @Override
    public String toString() {
        return "Механик " + firstName + " " + lastName + " работает в компании " + company +
                " может работать с видом транспорта : " + Skill;
    }
}
