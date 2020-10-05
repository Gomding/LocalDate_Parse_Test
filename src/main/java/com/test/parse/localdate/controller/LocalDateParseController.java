package com.test.parse.localdate.controller;

import com.test.parse.localdate.dto.GetModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LocalDateParseController {

    @GetMapping("/get")
    public String get(GetModel getModel) {

        log.info("get 요청 데이터 = {}", getModel);

        return "get 성공";
    }

}
