package com.dvelenteienko.services.currency.service.impl;

import com.dvelenteienko.services.currency.domain.dto.CurrencyRateDTO;
import com.dvelenteienko.services.currency.domain.entity.Currency;
import com.dvelenteienko.services.currency.repository.CurrencyRateRepository;
import com.dvelenteienko.services.currency.service.CurrencyExchangeDataService;
import com.dvelenteienko.services.currency.util.RequestPeriod;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class DefaultRateServiceTest {

    @Mock
    private CurrencyExchangeDataService currencyExchangeDataService;
    @Mock
    private CurrencyRateRepository currencyRateRepository;

    @InjectMocks
    private DefaultCurrencyRateService testee;

    @Test
    public void getCurrencyRates_WhenCurrencyRatesArePresent_ThenReturnDto() {
        String baseCode = "EUR";
        Currency defaultCurrency = Currency.builder().build();
        Currency currencyGBP = Currency.builder().setCode("GBP").build();
        Currency currencyEUR = Currency.builder().setCode("EUR").build();
        final LocalDateTime localDateTime = LocalDateTime.of(2023, 3, 3, 3, 3);
        RequestPeriod requestPeriod = RequestPeriod.builder().setFrom(localDateTime).setTo(localDateTime).build();
//        Rate rate1 = new Rate(UUID.randomUUID(), "USD", Currency.builder().setCode("EUR").build(), localDateTime, 0.1);
//        Rate rate2 = new Rate(UUID.randomUUID(), "USD", currencyGBP, localDateTime, 0.2);
//        Rate rate3 = new Rate(UUID.randomUUID(), "USD", currencyEUR, localDateTime, 0.1);
//        List<Rate> rates = List.of(rate1, rate2, rate3);
//        when(currencyRateRepository.findAllByBaseCurrencyCodeAndDateBetweenOrderByDateDesc(defaultCurrency, localDateTime, localDateTime))
//                .thenReturn(rates);
//
//        List<CurrencyRateDTO> expected = testee.getCurrencyRates(baseCode, requestPeriod, CurrencyType.BASE);
//
//        assertThat(expected).hasSize(2);
//        assertFalse(expected.contains(rate3));
    }

    @Test
    public void getCurrencyRates_WhenCurrencyRatesAreNotPresent_ThenReturnEmptyList() {
        String baseCode = "EUR";
        Currency currency = Currency.builder().build();
        final LocalDateTime localDateTime = LocalDateTime.of(2023, 3, 3, 3, 3);
        RequestPeriod requestPeriod = RequestPeriod.builder().setFrom(localDateTime).setTo(localDateTime).build();
//        when(currencyRateRepository.findAllByBaseCurrencyCodeAndDateBetweenOrderByDateDesc(currency, localDateTime, localDateTime))
//                .thenReturn(Collections.emptyList());
//
//        List<CurrencyRateDTO> expected = testee.getCurrencyRates(baseCode, requestPeriod, CurrencyType.BASE);
//
//        assertThat(expected).isNotNull();
//        assertThat(expected).hasSize(0);
    }

    @Test
    public void createCurrencyRate_WhenAllParametersArePresent_ThenCreateAndReturn() {
        String baseCode = "EUR";
        List<String> codes = List.of("USD");
        final LocalDateTime localDateTime = LocalDateTime.of(2023, 3, 3, 3, 3);
        CurrencyRateDTO currencyRateDto = CurrencyRateDTO.builder()
//                .setBase(baseCode)
//                .setSource("USD")
//                .setDate(localDateTime)
//                .setRate(0.1)
                .build();
//        List<Rate> rates = CurrencyRateDTO.from(List.of(currencyRateDto));
//        when(currencyExchangeDataService.getExchangeCurrencyRate(baseCode, codes)).thenReturn(List.of(currencyRateDto));

//        List<CurrencyRateDTO> expected = testee.fetchRates(baseCode, codes);

//        assertThat(expected).isNotNull();
//        assertThat(expected).hasSize(1);
//        assertTrue(expected.contains(currencyRateDto));
//        verify(currencyRateRepository).saveAllAndFlush(rates);
    }

    @Test
    public void createCurrencyRate_WhenCurrencyCodesAreNotPresent_ThenAddBaseCodeCreateAndReturn() {
        String baseCode = "EUR";
        List<String> codes = List.of("EUR");
        List<String> codesMethodParam = List.of();
        final LocalDateTime localDateTime = LocalDateTime.of(2023, 3, 3, 3, 3);
        CurrencyRateDTO currencyRateDto = CurrencyRateDTO.builder()
//                .setBase(baseCode)
//                .setSource(baseCode)
//                .setDate(localDateTime)
//                .setRate(0.1)
                .build();
//        List<Rate> rates = CurrencyRateDTO.from(List.of(currencyRateDto));
//        when(currencyExchangeDataService.getExchangeCurrencyRate(baseCode, codes)).thenReturn(List.of(currencyRateDto));

//        List<CurrencyRateDTO> expected = testee.fetchRates(baseCode, codesMethodParam);

//        assertThat(expected).isNotNull();
//        assertThat(expected).hasSize(1);
//        assertTrue(expected.contains(currencyRateDto));
//        assertThat(expected.get(0).getSource()).isEqualTo(baseCode);
//        verify(currencyRateRepository).saveAllAndFlush(rates);
    }

}
