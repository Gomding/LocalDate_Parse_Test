package com.test.parse.localdate.controller;

import com.test.parse.localdate.dto.GetModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Slf4j
@RestController
public class LocalDateParseController {

    // ModelAttribute 방식으로 Dto 객체를 가져옴
    @GetMapping("/get")
    public String get(GetModel getModel) {

        log.info("get 요청 데이터 = {}", getModel);

        return "get 성공";
    }

    @GetMapping("requestParameter")
    public String requestParameter(
            @RequestParam("requestParameter")LocalDateTime requestDateTime) {

        log.info("requestParameter 요청 데이터 = {}", requestDateTime);

        return "requestParameter 성공";

    }

}
