package com.mapper.devices.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(HomeController.class) //Тест для HomeController
public class HomeControllerTest {


    @Autowired
    private MockMvc mockMvc; //Внедрить MockMvc

    @Test
    @WithMockUser(username = "admin", roles={"ADMIN"})
    public void testHomePage() throws Exception {
       mockMvc.perform(get("/")) //Выполнить запрос GET
//        mockMvc.perform(get("/").with(user("admin").password("1234").roles("USER","ADMIN")))
                .andExpect(status().isOk())// Ожидается код ответа HTTP 200
                .andExpect(view().name("home")) //Ожидается имя представления home
                .andExpect(content().string(
                        containsString("Welcome to...")));  //Ожидается наличие строки «Welcome to...»
    }




}
