package week04;

public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();

        // try ~ catch ~ finally
        // try: 시도하자
        // catch : 잡다(붙잡다)
        // finally : 마침내~

        // 일단 try~, 예외가 발생하면 그걸 잡아!<catch>
        // 그리고, 정상적으로 수행되든, 예외가 발생하든 결국
        //  마침내 수행되야 하는 로직을 'finally 수행해
        try {
            // 일단 실행
            ourClass.thisMethodIsDangerous();
        } catch (OurBadException e) {
            System.out.println(e.getMessage());
        } finally {
            // 무조건 여기는 거침
            System.out.println("우리는 방금 예외를 처리했습니다");
            System.out.println("정상이든 비정상이든 여기를 거칩니다");
        }


    }
}
