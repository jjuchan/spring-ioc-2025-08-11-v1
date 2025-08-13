package com.ll.framework.ioc;

import com.ll.domain.testPost.testPost.service.TestPostService;

public class ApplicationContext {
    public ApplicationContext() {

    }

    public <T> T genBean(String beanName) {

        if (beanName.equals("testPostService")) {
            return (T) new TestPostService();
        }
        return  null;
    }

}
