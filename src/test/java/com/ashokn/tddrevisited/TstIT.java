package com.ashokn.tddrevisited;

import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TstIT {

    @Test
    public void greetTest(){
        get("/greet/Ashok").then().assertThat().body("message",equalTo("Hello! Ashok"));
    }
}
