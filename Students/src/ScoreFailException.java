public class ScoreFailException extends Exception{
    private String message;
    public ScoreFailException(){}
    public ScoreFailException(String message){
        super(message);
        this.message=message;
    }
}
