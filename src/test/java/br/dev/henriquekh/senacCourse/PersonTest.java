package br.dev.henriquekh.senacCourse;

import static org.junit.Assert.assertNotNull;
import java.time.LocalDate;
import org.junit.Test;

public class PersonTest {
    @Test
    public void shouldContructPerson() {
        Person person = new Person("Henrique", "123.456.789-10", "test@lol.com", "(99) 91212-1212",
                LocalDate.parse("2007-04-20"),
                "Desempregado", 0,
                "Meio do nada", "Azul", "Brasileiro", new Man(), MaritalStatus.Single, 0);

        assertNotNull(person);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowInvalidCPF() {
        new Person("Henrique", "1236.789-10", "test@lol.com", "(99) 91212-1212",
                LocalDate.parse("2007-04-20"),
                "Desempregado", 0,
                "Meio do nada", "Azul", "Brasileiro", new Man(), MaritalStatus.Single, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowInvalidEmail() {
        new Person("Henrique", "123.456.789-10", "t:est\\;;;@l..ol.com", "(99) 91212-1212",
                LocalDate.parse("2007-04-20"),
                "Desempregado", 0,
                "Meio do nada", "Azul", "Brasileiro", new Man(), MaritalStatus.Single, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowInvalidPhone() {
        new Person("Henrique", "123.456.789-10", "test@lol.com", "(!9) 91212-1212",
                LocalDate.parse("2007-04-20"),
                "Desempregado", 0,
                "Meio do nada", "Azul", "Brasileiro", new Man(), MaritalStatus.Single, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowInvalidChildren() {
        new Person("Henrique", "123.456.789-10", "test@lol.com", "(99) 91212-1212",
                LocalDate.parse("2007-04-20"),
                "Desempregado", 0,
                "Meio do nada", "Azul", "Brasileiro", new Man(), MaritalStatus.Single, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowInvalidSalary() {
        new Person("Henrique", "123.456.789-10", "test@lol.com", "(99) 91212-1212",
                LocalDate.parse("2007-04-20"),
                "Desempregado", -10000,
                "Meio do nada", "Azul", "Brasileiro", new Man(), MaritalStatus.Single, 0);
    }
}
