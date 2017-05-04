package com.tangqi.dubbo.service;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Auhtor: tangqi@otasim.com
 * @Description:
 * @Date: Create in 11:09 2017/5/4
 * @Modified By:
 */
@Data
@NoArgsConstructor
@ToString
public class User implements Serializable{
    private String name;
    private int age;
    private String sex;
}
