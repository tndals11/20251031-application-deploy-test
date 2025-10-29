package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DummyService {

    public void checkNull() {
        String str = null; // ⚠️ 의도적 오류
        System.out.println(str.length());
    }
}
