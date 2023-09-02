package kr.springboot.ch1.step2;

import java.time.LocalDateTime;

/**
 * 초대장
 */
class Invitation {

    private LocalDateTime when;

    public Invitation(LocalDateTime when) {
        if (null == when) {
            throw new IllegalArgumentException("when is null");
        }
        this.when = when;
    }

    public LocalDateTime getWhen() {
        return when;
    }

}
