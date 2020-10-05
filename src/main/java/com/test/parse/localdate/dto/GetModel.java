package com.test.parse.localdate.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@Getter
@Setter
@NoArgsConstructor
public class GetModel {

    private String name;
    private LocalDateTime requestDateTime;

}
