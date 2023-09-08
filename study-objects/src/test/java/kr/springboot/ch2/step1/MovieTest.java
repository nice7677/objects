package kr.springboot.ch2.step1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Movie 클래스")
public class MovieTest {

    @Nested
    @DisplayName("DiscountPolicy 주입되는 값이")
    class Describe_amountDiscountPolicy {

        @Nested
        @DisplayName("AmountDiscountPolicy 일 경우")
        class Context_with_amountDiscountPolicy {

            @Test
            @DisplayName("할인 정책으로 금액 할인 정책이 적용되고 두개의 순서 조건과 두개의 기간 조건을 이용해 할인 여부를 판단한다.")
            void it_is_amountDiscountPolicy_rule() {

                Movie avatar = new Movie("아바타",
                        Duration.ofMinutes(120),
                        Money.wons(10000),
                        new AmountDiscountPolicy(Money.wons(800),
                                new SequenceCondition(1),
                                new SequenceCondition(10),
                                new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59)),
                                new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59))
                        ));
                // 추상화 클래스 활용법

                assertThat(avatar.getFee()).isEqualTo(Money.wons(10000));

            }

        }

        @Nested
        @DisplayName("PercentDiscountPolicy 일 경우")
        class Context_with_percentDiscountPolicy {

            @Test
            @DisplayName("10%의 비율 할인 정책이 적용되고 두개의 기간 조건과 한개의 순서 조건을 이요해 할인 여부를 판단한다.")
            void it_is_percentDiscountPolicy_rule() {

                Movie titanic = new Movie("아바타",
                        Duration.ofMinutes(180),
                        Money.wons(11000),
                        new PercentDiscountPolicy(
                                0.1,
                                new PeriodCondition(DayOfWeek.SATURDAY, LocalTime.of(0, 0), LocalTime.of(16, 59)),
                                new SequenceCondition(1),
                                new PeriodCondition(DayOfWeek.SATURDAY, LocalTime.of(0, 0), LocalTime.of(13, 59))
                        ));
                // 추상화 클래스 활용법

                assertThat(titanic.getFee()).isEqualTo(Money.wons(11000));

            }

        }

    }

}
