package com.rcloud.sample;

import java.net.MalformedURLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RcloudSpringbootSampleApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void generateAsciiDocs() throws MalformedURLException {
        // 输出Ascii格式
//        Swagger2MarkupConfig config = new Swagger2MarkupConfigBuilder().withMarkupLanguage(MarkupLanguage.ASCIIDOC).build();
//        Swagger2MarkupConverter.from(new URL("http://192.168.1.114:8082/v2/api-docs?group=default")).withConfig(config).build()
//            .toFolder(Paths.get("src/docs/asciidoc/generated"));
    }

}
