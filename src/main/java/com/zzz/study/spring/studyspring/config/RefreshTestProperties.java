package com.zzz.study.spring.studyspring.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties(prefix = "zzz-test.properties-config")
@Data
@RefreshScope
public class RefreshTestProperties {

    private String name;
    private String age;
}
