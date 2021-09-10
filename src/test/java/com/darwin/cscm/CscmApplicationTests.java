package com.darwin.cscm;

import com.darwin.cscm.constant.CommodityEnum;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CscmApplicationTests {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void contextLoads() {

    }

}
