package buckpal;

import buckpal.application.service.MoneyTransferProperties;
import buckpal.domain.Money;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(BuckPalConfigurationProperties.class)
public class BuckPalConfiguration {
    @Bean
    public MoneyTransferProperties moneyTransferProperties(
            BuckPalConfigurationProperties buckPalConfigurationProperties) {
        return new MoneyTransferProperties(Money.of(buckPalConfigurationProperties.getTransferThreshold()));
    }
}
