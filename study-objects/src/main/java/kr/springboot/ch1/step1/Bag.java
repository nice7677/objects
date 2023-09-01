package kr.springboot.ch1.step1;

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

    public boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

}
