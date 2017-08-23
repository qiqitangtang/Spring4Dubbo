package com.tangqi.dubbo.impl;

import com.tangqi.dubbo.service.DemoService;
import com.tangqi.dubbo.service.User;

import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl implements DemoService {
  
    public String sayHello(String name) {  
        return "Hello " + name;  
    }  
  
    public List getUsers() {  
        List list = new ArrayList();
        User u1 = new User();

  
        User u2 = new User();

        User u3 = new User();

  
        

        list.add(u1);  
        list.add(u2);  
          
        return list;  
    }  
}  