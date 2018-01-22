package com.hendisantika.springthymeleafpagination.service;

import com.hendisantika.springthymeleafpagination.domain.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-thymeleaf-pagination
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 23/01/18
 * Time: 06.27
 * To change this template use File | Settings | File Templates.
 */
public interface PersonService {
    /**
     * Finds a "page" of persons
     *
     * @param pageable
     * @return {@link Page} instance
     */
    Page<Person> findAllPageable(Pageable pageable);
}
