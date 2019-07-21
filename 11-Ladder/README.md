# 사다리 게임

## 기능 요구사항
* 사다리 게임에 참여하는 사람에 이름을 최대5글자까지 부여할 수 있다. 사다리를 출력할 때 사람 이름도 같이 출력한다.
* 사람 이름은 쉼표(,)를 기준으로 구분한다.
* 사람 이름을 5자 기준으로 출력하기 때문에 사다리 폭도 넓어져야 한다.
* 사다리 타기가 정상적으로 동작하려면 라인이 겹치지 않도록 해야 한다.
    * |-----|-----| 모양과 같이 가로 라인이 겹치는 경우 어느 방향으로 이동할지 결정할 수 없다.
* 사다리 실행 결과를 출력 한다.
* 개인별 이름을 입력하면 개인별 결과를 출력하고, "all"을 입력하면 전체 참여자의 실행 결과를 출력한다.
    
# 기능 목록
1. 게임 참여자
    - 최대 5글자의 이름을 갖는다.
    - 사다리가 출력될 때 참여자들의 이름도 출력된다.

2. 사다리
    - 가로 한 라인에 연속 2번이상 연결될 수 없다.

- 입출력
    - 사람 이름은 쉼표(,)를 기준으로 입력 받는다.
    - 사람 이름을 5자 기준으로 출력한다.
    - 사다리도 사람 이름 최대 길이인 5자 기준으로 폭이 출력된다.
    - 참가자 이름을 입력하면 결과가 출력된다.
    - "all"을 입력하면 전체 참여자의 실행 결과가 출력된다.