package network;

public class ResponseModel {

    private String message;
    private String status;
    private String com;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public String getCom() {
        return com;
    }

    public void myMethod() {
        // Isi dari method disini
        System.out.println("Message: " + getMessage());
        System.out.println("Status: " + getStatus());
        System.out.println("Com: " + getCom());
    }
}