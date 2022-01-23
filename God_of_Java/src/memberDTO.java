public class memberDTO {
    public String name;
    public String phone;
    public String email;

    public memberDTO() {
        //아무정보도 모를 때
    }

    public memberDTO(String name) {
        this.name = name;
    }

    public memberDTO(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public memberDTO(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}
