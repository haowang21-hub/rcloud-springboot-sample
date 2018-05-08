package com.rcloud.sample;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.github.swagger2markup.Swagger2MarkupConfig;
import io.github.swagger2markup.Swagger2MarkupConverter;
import io.github.swagger2markup.builder.Swagger2MarkupConfigBuilder;
import io.github.swagger2markup.markup.builder.MarkupLanguage;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RcloudSpringbootSampleApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void generateAsciiDocs() throws MalformedURLException {
        // 输出Ascii格式
        Swagger2MarkupConfig config = new Swagger2MarkupConfigBuilder().withMarkupLanguage(MarkupLanguage.ASCIIDOC).build();
        Swagger2MarkupConverter.from(new URL("http://192.168.1.114:8082/v2/api-docs?group=default")).withConfig(config).build()
            .toFolder(Paths.get("src/docs/asciidoc/generated"));
    }

}
