package kr.springboot.ch1.step2;

class Bag {

    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    /**
     * 부 생성자는 주 생성자 위에 선언한다.
     * @param amount
     */
    public Bag(long amount) {
        this(amount, null);
    }

    /**
     * 제약을 강제할 수 있도록 생성자 추가
     *
     * @param amount
     */
    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    /**
     * Bag도 다른 클래스들과 마찬가지로 캡슐화를 진행하여 응집도를 높인다.
     * 안에있던 public 메서드들을 다 private으로 변경하여 외부에서 접근할 수 없도록 한다.
     * @param ticket
     * @return
     */
    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L;
        } else {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }


}
