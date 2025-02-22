package section14.custom;

public class InputErrorException extends Exception {

    // private String message;

    // InputErrorException(String message) {
    //     this.message = message;
    // }

    @Override
    public String getMessage() {
        return "음수 나이는 입력할 수 없습니다.";
    }
}
