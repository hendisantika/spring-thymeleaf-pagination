package com.hendisantika.springthymeleafpagination.repository;

import com.hendisantika.springthymeleafpagination.domain.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-thymeleaf-pagination
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 23/01/18
 * Time: 06.26
 * To change this template use File | Settings | File Templates.
 */

@Repository
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
}
