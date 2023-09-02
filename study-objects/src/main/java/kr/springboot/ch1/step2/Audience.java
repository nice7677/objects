package kr.springboot.ch1.step2;

class Audience {

    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    /**
     * Audience도 public의 getter를 지우고
     * 캡슐화를 진행한다.
     * @param ticket
     * @return
     */
    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }

}
