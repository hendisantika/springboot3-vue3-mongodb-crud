package com.hendisantika.backend.repository;

import com.hendisantika.backend.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot3-vue3-mongodb-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/29/23
 * Time: 07:59
 * To change this template use File | Settings | File Templates.
 */
public interface UserRepository extends MongoRepository<User, String> {
}
