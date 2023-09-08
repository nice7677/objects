package kr.springboot.ch2.step2;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);

}
