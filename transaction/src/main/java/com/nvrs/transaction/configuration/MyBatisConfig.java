package com.nvrs.transaction.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.web.reactive.function.client.WebClient;

import javax.sql.DataSource;
import java.net.http.HttpClient;
import java.util.logging.Logger;

@Configuration
public class MyBatisConfig {

    @Autowired
    DataSource dataSource;

    @Value("${merchant_service_url}")
    private String merchantServiceURL;

    @Bean(name="transactionManager")
    public DataSourceTransactionManager transactionManager(){
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name="httpClient")
    public WebClient httpClient(){
        return WebClient.builder().baseUrl(merchantServiceURL).build();
    }


}
