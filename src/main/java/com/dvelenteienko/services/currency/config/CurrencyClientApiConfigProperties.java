package com.dvelenteienko.services.currency.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "service.currency-client-api")
public class CurrencyClientApiConfigProperties {

    private String url;
    private String apiKey;
    private String baseCurrencyAttr;
    private String currencyAttr;
}
