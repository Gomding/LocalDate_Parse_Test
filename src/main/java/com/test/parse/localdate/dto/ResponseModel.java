package com.test.parse.localdate.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class ResponseModel {

    private final String name;
    private final LocalDateTime requestDateTime;


}
