package com.dante.springweb;

import com.dante.springweb.util.NeoProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NeoPropertiesTest {

    @Autowired
    private NeoProperties neoProperties;

    @Test
    public void testProperties() {
        System.out.println(neoProperties.getTitle());
        System.out.println(neoProperties.getDescription());
    }
}
