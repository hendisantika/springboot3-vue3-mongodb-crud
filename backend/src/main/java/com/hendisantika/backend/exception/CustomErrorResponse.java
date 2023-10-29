package com.hendisantika.backend.exception;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot3-vue3-mongodb-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/29/23
 * Time: 08:00
 * To change this template use File | Settings | File Templates.
 */
public class CustomErrorResponse {
    @JsonFormat(shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime timestamp;
    private int status;
    private String error;
}
