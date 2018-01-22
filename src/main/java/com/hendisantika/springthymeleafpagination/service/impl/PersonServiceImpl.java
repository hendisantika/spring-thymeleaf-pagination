package com.hendisantika.springthymeleafpagination.service.impl;

import com.hendisantika.springthymeleafpagination.domain.Person;
import com.hendisantika.springthymeleafpagination.repository.PersonRepository;
import com.hendisantika.springthymeleafpagination.service.PersonService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-thymeleaf-pagination
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 23/01/18
 * Time: 06.28
 * To change this template use File | Settings | File Templates.
 */
@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Page<Person> findAllPageable(Pageable pageable) {
        return personRepository.findAll(pageable);
    }
}
