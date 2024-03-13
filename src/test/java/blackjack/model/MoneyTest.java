package blackjack.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MoneyTest {

    @Test
    @DisplayName("전달 받은 금액으로 Money를 생성한다.")
    void createMoney() {
        int money = 1_000;
        assertThat(new Money(money).getMoney()).isEqualTo(money);
    }

    @Test
    @DisplayName("현재 금액에 전달 받은 숫자를 곱한다.")
    void multiply() {
        Money money = new Money(1_000);
        Money newMoney = money.multiply(1.5);

        assertThat(newMoney.getMoney()).isEqualTo(1_500);
    }
}
