# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## TODO

*[x] 자동차 이름 입력문구 출력
*[x] n 개의 자동차 이름을 입력
  *[x] 자동차의 이름은 쉼표로 구분
  *[x] 이름은 5글자 이하만 가능
  *[x] 5글자이상 또는 쉼표다음에 빈문자열일경우 IllegalArgumentException 에러메시지 출력후 다시 입력받도록 시도
  *[x] 자동차 이름이 동일할경우 IllegalStateException 에러메시지 출력후 다시 입력받도록 시도
*[ ] 자동차 이동횟수 입력문구 출력
*[ ] 자동차 n번 이동 입력
  *[ ] 숫자를 입력받지않았다면 IllegalArgumentException 에러메시지 출력후 다시 입력받도록 시도
*[ ] 이동횟수로 반복 
  *[x] 각 자동차별로 랜덤숫자를 생성
    *[x] 4 이상일경우 전진, 미만일경우 정차
  *[ ] 이동횟수에 따라 진행상황 출력
*[ ] 모든 이동횟수가 지나면 우승자 출력
  *[ ] 두명이상일경우 쉼표로 구분하여 출력
    


