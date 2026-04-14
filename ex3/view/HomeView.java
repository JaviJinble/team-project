package ex3.view;

public class HomeView implements View{

    public void render() {
        System.out.println("=====<<HOME>>======");
        System.out.println("1. 계좌생성");
        System.out.println("2. 입금 / 출금");
        System.out.println("3. 계좌 조회");
        System.out.println("4. 전체 계좌 목록");
        System.out.println("5. 거래내역 저장 ");
        System.out.println("6. 거래내역 출력");
        System.out.println("q. 계좌생성");
        System.out.println("===================");
    }

}
