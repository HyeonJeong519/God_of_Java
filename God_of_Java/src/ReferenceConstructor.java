public class ReferenceConstructor {
    public void makeMeberObject(){
        memberDTO dto1 = new memberDTO();
        memberDTO dto2 = new memberDTO("HyeonJeong");
        memberDTO dto3 = new memberDTO("HyeonJeong","01000000000");
        memberDTO dto4 = new memberDTO("HyeonJeong","01000000000","jen@naver.com");
    }
    public static void main(String[] args) {
        ReferenceConstructor reference = new ReferenceConstructor();
        reference.makeMeberObject();
    }
}
