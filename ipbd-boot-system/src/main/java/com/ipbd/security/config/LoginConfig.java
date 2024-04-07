package com.ipbd.security.config;

import com.ipbd.api.module.message.SmsApi;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * 登录配置信息
 *
 */
@Configuration
public class LoginConfig {

    @Bean
    // 当你的bean被注册之后，如果而注册相同类型的bean，就不会成功，它会保证你的bean只有一个，即你的实例只有一个
    @ConditionalOnMissingBean
    SmsApi smsApi() {
        // 返回一个SmsApi接口的匿名内部类实现
        return new SmsApi() {
            @Override
            public boolean send(String mobile, Map<String, String> params) {
                return false;
            }

            @Override
            public boolean sendCode(String mobile, String key, String value) {
                return false;
            }

            @Override
            public boolean verifyCode(String mobile, String code) {
                return false;
            }
        };
    }
}
