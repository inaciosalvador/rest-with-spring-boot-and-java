package br.com.inacio.service;

import br.com.inacio.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

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
}
