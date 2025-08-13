package com.ll.framework.ioc;


import com.ll.domain.testPost.testPost.service.TestPostService;

import java.util.HashMap;
import java.util.Map;

public class ApplicationContext {
    private final Map<String, TestPostService> beans = new HashMap<>();

    public ApplicationContext() {
        beans.put("testPostService", new TestPostService());

    }

    public <T> T genBean(String beanName) {
        //t2 테스트 통과 ver.1
        /**
         *  if (beanName.equals("testPostService")) {
         *             return (T) new TestPostService();
         *         }
         *         return  null;
         */

        //t2 테스트 통과 ver.2
        return (T) beans.get(beanName);

    }

}
