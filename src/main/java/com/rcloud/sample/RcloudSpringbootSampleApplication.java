package com.rcloud.sample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.rcloud.common.file.FileServiceConfig;
import com.rcloud.springboot.swagger.EnableSwagger2Doc;

@SpringBootApplication
@MapperScan("com.rcloud.sample.mapper*")
@EnableSwagger2Doc
@Import({
    FileServiceConfig.class
})
public class RcloudSpringbootSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(RcloudSpringbootSampleApplication.class, args);
    }
}
