package com.test.parse.localdate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class LocalDateParseTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void ModelAttribute_LocalDate_변환된다() throws Exception{

        //given
        String url = "/get?name=park&requestDateTime=2020-10-05T10:00:00";

        //when
        ResultActions resultActions = this.mockMvc.perform(get(url));

        //then
        resultActions
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("get 성공")));

    }

    @Test
    public void requestParameter의_LocalDate는_변환된다() throws Exception {
        //given
        String url = "/requestParameter?requestDateTime=2020-10-05T10:00:00";

        //when
        ResultActions resultActions = this.mockMvc.perform(get(url));

        resultActions
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("requestParameter 성공")));
    }

    @Test
    public void post요청시_requestBody의_LocalDate는_변환된다() throws Exception {
        //given
        String url = "/post";

        //when
        ResultActions resultActions = this.mockMvc.perform(
                post(url)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"name\":\"park\", \"requestDateTime\":\"2018-12-15T10:00:00\"}"));

        //then
        resultActions
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("post 성공")));

    }

    @Test
    public void responseModel의_LocalDateTime은_변화된다() throws Exception {
        //given
        String url = "/response";

        //when
        ResultActions resultActions = this.mockMvc.perform(get(url));

        //then
        resultActions
                .andExpect(status().isOk())
                .andExpect(content().json("{\"name\":\"park\", \"requestDateTime\":\"2020-10-05T10:00:00\"}"));


    }

}
