package com.test.parse.localdate.controller;

import com.test.parse.localdate.dto.GetModel;
import com.test.parse.localdate.dto.JsonModel;
import com.test.parse.localdate.dto.ResponseModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/requestParameter")
    public String requestParameter(
            @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
            @RequestParam("requestDateTime")LocalDateTime requestDateTime) {

        log.info("requestParameter 요청 데이터 = {}", requestDateTime);

        return "requestParameter 성공";

    }

    @PostMapping("/post")
    public String post(@RequestBody JsonModel jsonModel) {

        log.info("post 요청 데이터 = {}", jsonModel);

        return "post 성공";
    }

    @GetMapping("/response")
    public ResponseModel responseModel() {
        return new ResponseModel("park", LocalDateTime.of(2020,10,5,10,0,0));
    }

}
