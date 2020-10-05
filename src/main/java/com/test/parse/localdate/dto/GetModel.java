package com.test.parse.localdate.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@ToString
@Getter
@Setter
@NoArgsConstructor
public class GetModel {

    private String name;

    // GET 요청에 JsonFormat 어노테이션을 사용함
    // @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "Asia/Seoul")

    // DateTimeFormat은 Spring에서 지원하는 어노테이션 LocalDate 나 LocalDateTime 과 같은 날짜관련 타입의 직렬화를 지원함
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime requestDateTime;

}
