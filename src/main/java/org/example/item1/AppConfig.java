package org.example.item1;

// 서비스 등록 API
@Configuration
public class AppConfig {
    @Bean
    public HelloService helloService() {
        return new ChineseHelloService();
    }
}
