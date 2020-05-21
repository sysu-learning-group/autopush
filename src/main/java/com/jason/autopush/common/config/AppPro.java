package com.jason.autopush.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "user")
public class AppProp {

    private String active;
    //    ws所使用的端口
    private Integer wsPort;
    private List<String> ignoreUrl;

}
