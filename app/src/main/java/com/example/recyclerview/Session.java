package com.example.recyclerview;

public class Session {
    //private  String username;
    private String ReceivedSessiontID;
    private String ReceivedPatientID;
    private String ReceivedInsoletID;
    private String ReceivedStartTime;
    private String ReceivedEndTime;
    private String ReceivedIsPart;

    // Consttrucotr
    public Session(String sessionId) {
        this.ReceivedSessiontID = sessionId;
    }
//    public Session(Object sessiconObj ) {
    // + elegxo gia null times.
// this.ReceivedSessiontID = sessiconObj.getString("sessionId");
//    }

    public String getReceivedSessiontID() {
        return ReceivedSessiontID;
    }

    public void setReceivedSessiontID(String sessionId) {
        this.ReceivedSessiontID = sessionId;
    }

}
