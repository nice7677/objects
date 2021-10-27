# Chapter 5. 책임 할당하기

데이터 중심 설계로 인해 발생하는 문제점을 해결할 수 있는 가장 기본적인 방법은 데이터가 아닌 책임에 초점을 맞추는 것이다.

책임에 초점을 맞춰서 설계할 때 직면하는 가장 큰 어려움은 어떤 객체에게 어떤 책임을 할당할지를 결정하기가 쉽지 않다는 것이다.

책임 할당 과정은 일종의 트레이드오프 활동이다. 동일한 문제를 해결할 수 있는 다양한 책임 할당 방법이 존재하며 어떤 방법이 최선인지는 상황과 문맥에 따라 달라진다.

따라서 올바른 책임을 할당하기 위해서는 다양한 관점에서 설계를 평가할 수 있어야 한다.

이번 장에서는 GRASP 패턴을 배우고 응집도와 결합도 캡슐화 같은 다양한 기준에 따라 책임을 할당하고 결과를 트레이드오프 할 수 있는 기준을 배울 것이다.

데이터 중심의 설계에서 책임 중심의 설계로 전환하기 위해서는 다음의 두 가지 원칙을 따라야 한다.

- 데이터보다 행동을 먼저 결정하라
- 협력이라는 문맥 안에서 책임을 결정하라

### 데이터보다 행동을 먼저 결정하라