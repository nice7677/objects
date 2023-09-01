package kr.springboot.ch1.step1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

@DisplayName("초대장 클래스")
class InvitationTest {

    @Nested
    @DisplayName("초대장 생성의 경우 생성자의 값이")
    class Describe_createInvitation {

        @DisplayName("null인 경우")
        @Nested
        class Context_with_when_is_null {

            @DisplayName("생성에 실패 한다.")
            @Test
            void createInvitationFail() {

                assertThatThrownBy(() -> new Invitation(null))
                        .isInstanceOf(IllegalArgumentException.class)
                        .hasMessage("when is null");

            }

        }

        @DisplayName("LocalDateTime인 경우")
        @Nested
        class Context_with_when_is_not_null {

            @DisplayName("생성에 성공 한다.")
            @Test
            void createInvitation() {

                LocalDateTime when = LocalDateTime.of(2023, 2, 1, 12, 0);
                Invitation newInvitation = new Invitation(when);
                assertAll(
                        () -> assertThat(newInvitation.getWhen().getYear()).isEqualTo(2023),
                        () -> assertThat(newInvitation.getWhen().getMonthValue()).isEqualTo(2),
                        () -> assertThat(newInvitation.getWhen().getDayOfMonth()).isEqualTo(1),
                        () -> assertThat(newInvitation.getWhen().getHour()).isEqualTo(12),
                        () -> assertThat(newInvitation.getWhen().getMinute()).isEqualTo(0)
                );

            }

        }

    }

}
