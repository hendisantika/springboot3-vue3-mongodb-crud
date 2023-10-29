package com.hendisantika.backend.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot3-vue3-mongodb-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/29/23
 * Time: 07:44
 * To change this template use File | Settings | File Templates.
 */
@Document(collection = "user")
@Data
public class User {
    private String _id;
    private String firstName;
    private String lastName;
    private String emailId;
}
