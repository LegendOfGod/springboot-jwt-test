package com.example.common.model;

import lombok.Data;

import java.util.Date;

/**
 * @author lqb
 * @date 2021/12/27 10:15
 */
@Data
public class Payload<T> {

    private String id;
    private T userInfo;
    private Date expiration;

}
