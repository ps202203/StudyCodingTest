package  programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/131130?language=java#
public class SoloPlaying {
    public static void main(String[] args) {
        int[] cards = {8,6,3,7,2,5,1,4};

        //상자 안에 들어있는 카드 번호가 순서대로 담긴 "배열 cards"가 매개변수로 제공 ex) cards = [8,6,3,7,2,5,1,4]
        int answer = 0; //  1번 상자 그룹에 속한 상자의 수 * 2번 상자 그룹에 속한 상자의 수
        int result1 = 0 , result2 = 0; // 1번 상자 그룹에 속한 상자의 수, 2번 상자 그룹에 속한 상자의 수

        //1번상자그룹을 처음에 0번째부터 cards.length -1번째까지 열 경우 반복
        for(int i = 0; i < cards.length; i++){
            int[] cardsOpened;  //1번상자그룹에서 열었던 상자 표기 배열, 0 = closed, 1 = opened
            cardsOpened = new int[cards.length];
            result1 = result2 = 0; // 이전까지 시행했던 1번상자, 2번상자 결과값 초기화

            int n = i;
            //cardsOpened[n] = 0이 될 때 까지 1번상자그룹 오픈
            while(cardsOpened[n] != 1){
                cardsOpened[n] = 1;
                n = cards[n] - 1;
                result1++;
            }

            //1번상자결과값이 0일 경우, 결과를 내지 않고 다음 순서로 넘어간다.
            if(result1 == 0){ continue; }

            //2번상자그룹을 처음에 0번째부터 cards.length -1번째까지 오픈
            for(int j = 0; j < cards.length - 1; j++){
                // cardsOpened[j] = 1일경우 이미 오픈한 상자임으로 첫 오픈 때는 다음으로 넘어간다.
                if(cardsOpened[j] == 1){ continue; }
                result2 = 0;
                int[] cardsOpened2;  //2번상자그룹에서 열었던 상자 표기 배열, 0 = closed, 1 = opened
                cardsOpened2 = new int[cards.length];
                //cardsOpened2[k] = 0이 될 때 까지 2번상자그룹 오픈
                int k = j;
                while(cardsOpened2[k] != 1){
                    if(cardsOpened[k] == 1) { break; }
                    cardsOpened2[k] = 1;
                    k = cards[k] - 1;
                    result2++;
                }
                if( answer < result1 * result2){ answer = result1 * result2;}
            }
        }
        System.out.println("정답은 : " +answer);
        System.out.println("result1 : " +result1);
        System.out.println("result2 : " +result2);

    }
}
