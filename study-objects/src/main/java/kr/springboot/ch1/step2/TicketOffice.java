package kr.springboot.ch1.step2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TicketOffice {

    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    /**
     * TicketOffice도 캡슐화를 진행한다.
     * 하지만 여긴 audience에 대한 의존성이 추가 되었다.
     * @param audience
     */
    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }

    private Ticket getTicket() {
        return tickets.remove(0);
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }

}
