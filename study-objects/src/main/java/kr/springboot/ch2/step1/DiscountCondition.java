package kr.springboot.ch2.step1;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);

}
