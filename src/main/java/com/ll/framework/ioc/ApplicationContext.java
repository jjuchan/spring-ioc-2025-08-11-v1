package com.ll.framework.ioc;

import com.ll.domain.testPost.testPost.repository.TestPostRepository;
import com.ll.domain.testPost.testPost.service.TestPostService;

import java.util.HashMap;
import java.util.Map;

public class ApplicationContext {
    private static final Map<String, Object> beans = new HashMap<>();

    public ApplicationContext() {
    }

    static {
        TestPostService testPostService = new TestPostService();
        beans.put("testPostService", testPostService);

        TestPostRepository testPostRepository = new TestPostRepository();
        beans.put("testPostRepository", testPostRepository);
    }

    public <T> T genBean(String beanName) {
        return (T) beans.get(beanName);
    }
}
