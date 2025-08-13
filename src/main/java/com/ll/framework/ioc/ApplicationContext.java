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
        TestPostRepository testPostRepository = new TestPostRepository();
        beans.put("testPostRepository", testPostRepository);

        TestPostService testPostService = new TestPostService(testPostRepository);
        beans.put("testPostService", testPostService);

    }

    public <T> T genBean(String beanName) {
        return (T) beans.get(beanName);
    }
}
