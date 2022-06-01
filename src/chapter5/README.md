## SimepleDotComGame 테스트코드

메소드 public static void main (STring[] args) 

1. 사용자가 추측한 값을 저장할 numOfGuesses라는 int 변수를 선언합니다.
2. SimpleDotCom 객체를 생성합니다.
3. 셀 위치의 시작점으로 쓸 0 이상 4 이하의 난수를 계산합니다.
4. 시작점 ~ 시작점+2 까지의 값을 갖는 int형 배열 변수를 선언합니다.
5. SimpleDotCom 객체에 선언한 int 배열 변수를 인자로 전달해 닷컴의 위치를 지정합니다. 
6. 닷컴이 살아있는 동안(while)
   1. 명령행을 통해 사용자로부터 위치를 받습니다.
   2. numOfGuesses 값을 1 증가시킵니다.
   3. 입력받은 위치를 SimpleDotCom에 전달해 닷컴을 맞췄는지 확인합니다.
      1.  맞췄다면 "hit" 을 출력합니다.
   4. 닷컴이 죽었는지 확인후 죽었다면 "kill"을 출력한 후 반복문을 종료합니다.(break)