package chapter2;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("0이상 9이하의 숫자를 맞춰보세요.");

        while (true) {
            System.out.println("맞춰야 할 숫자는 " + targetNumber + "입니다.");

            p1.guess();
            p2.guess();
            p3.guess();

            guessP1 = p1.number;
            System.out.println("1번 선수가 찍은 숫자: " + guessP1);

            guessP2 = p2.number;
            System.out.println("2번 선수가 찍은 숫자: " + guessP2);

            guessP3 = p3.number;
            System.out.println("3번 선수가 찍은 숫자: " + guessP3);

            if (guessP1 == targetNumber) {
                p1IsRight = true;
            }

            if (guessP2 == targetNumber) {
                p2IsRight = true;
            }

            if (guessP3 == targetNumber) {
                p3IsRight = true;
            }

            if (p1IsRight || p2IsRight || p3IsRight) {
                System.out.println("맞춘 선수가 있습니다.");
                System.out.println("1번 선수 : " + p1IsRight);
                System.out.println("2번 선수 : " + p2IsRight);
                System.out.println("3번 선수 : " + p3IsRight);
                System.out.println("게임 끝.");
                break;
            } else {
                System.out.println("다시 시도해야 합니다.");
            }
        }
    }
}
