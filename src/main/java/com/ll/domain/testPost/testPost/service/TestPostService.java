package com.ll.domain.testPost.testPost.service;

import com.ll.domain.testPost.testPost.repository.TestPostRepository;
import com.ll.framework.ioc.ApplicationContext;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TestPostService {
    private final TestPostRepository testPostRepository;


    public TestPostService() {
        testPostRepository = new TestPostRepository();
    }

}
