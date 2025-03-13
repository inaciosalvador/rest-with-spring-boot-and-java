package br.com.inacio.service;

import br.com.inacio.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findAll(){

        logger.info("Find all People!");

        List<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    public Person findById(String id){

        logger.info("Find one Person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Inacio");
        person.setLastName("Salvador");
        person.setAddress("Avenida Conselheiro Aguiar, 1010 - Boa Viagem");
        person.setGender("Male");
        return person;

    }

    public Person create(Person person) {

        logger.info("Creating one Person!");
        person.setId(counter.incrementAndGet());
        return person;
    }

    public Person update(Person person) {

        logger.info("Updating one Person!");
        return person;
    }

    public void delete(String id){

        logger.info("Deleting one Person!");

    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Firstname" + i);
        person.setLastName("LastName" + i);
        person.setAddress("Qualquer endereço");
        person.setGender("Male");
        return person;
    }
}
