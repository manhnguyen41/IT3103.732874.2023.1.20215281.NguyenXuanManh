package lab05.AimsProject.exception;

public class PlayerException extends Exception{
    private String description;

    public PlayerException(String description) {
        this.description = description;
    }

    @Override
    public String getMessage() {
        return description;
    }
}
