package com.ipbd.framework.common.xss;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.PathMatcher;

/**
 * XSS 配置文件
 *
 */
@Configuration
@EnableConfigurationProperties(XssProperties.class)
@ConditionalOnProperty(prefix = "ipbd.xss", value = "enabled")
public class XssConfiguration {

    @Bean
    public FilterRegistrationBean<XssFilter> xssFilter(XssProperties properties, PathMatcher pathMatcher) {
        FilterRegistrationBean<XssFilter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new XssFilter(properties, pathMatcher));
        bean.setOrder(Integer.MAX_VALUE);
        bean.setName("xssFilter");

        return bean;
    }
}