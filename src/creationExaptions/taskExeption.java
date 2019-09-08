package creationExaptions;

public class taskExeption extends Exception {
    private String msg;
    public taskExeption(String msg){
        this.msg = msg;
    }
    public String getMsg(){
        return msg;
    }
}
