package kr.springboot.ch1.step2;

class TicketSeller {

    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    /**
     * Step1과 다르게 public의 getter가 지워지고
     * private ticketOffice만 남아 캡슐화가 되었다.
     * ticketOffice를 수정하기 위해서는 TicketSeller의 메서드를 통해서만 가능하다.
     * 이는 즉 결합도가 낮아짐을 의미한다.
     *
     * @param audience
     */
    public void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience);
    }

}
