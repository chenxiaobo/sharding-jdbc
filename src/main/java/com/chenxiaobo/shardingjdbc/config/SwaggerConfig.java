package com.chenxiaobo.shardingjdbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Title: SwaggerConfig
 * @Description: TODO
 * @Author <a href="mailto:chenxb1993@126.com">陈晓博</a>
 * @Date 2019-12-02 21:45
 * @Version V1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.chenxiaobo.shardingjdbc.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("sharding-jdbc")
                .description("sharding-jdbc")
                .termsOfServiceUrl("sharding-jdbc").contact(new Contact("cxb","",""))
                .version("1.0.0")
                .build();
    }

}
