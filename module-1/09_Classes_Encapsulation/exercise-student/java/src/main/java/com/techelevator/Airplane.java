package com.techelevator;

public class Airplane {
    private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats;
    private int availableFirstClassSeats;
    private int totalCoachSeats;
    private int bookedCoachSeats;
    private int availableCoachSeats;

    public String getPlaneNumber()
        {return planeNumber;}

    public int getTotalFirstClassSeats()
        {return totalFirstClassSeats;}

    public int getBookedFirstClassSeats ()
    {return bookedFirstClassSeats;}

    public int getAvailableFirstClassSeats() {
        return totalFirstClassSeats - bookedFirstClassSeats; }

    public int getTotalCoachSeats(){
        return totalCoachSeats;}

    public int getBookedCoachSeats(){
        return bookedCoachSeats;}

    public int getAvailableCoachSeats(){
        return totalCoachSeats - bookedCoachSeats; }

    public Airplane (String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }
    public boolean reserveSeats (boolean forFirstClass,int totalNumberOfSeats){
        boolean isItBooked = false;

        if (forFirstClass && getAvailableFirstClassSeats() >= totalNumberOfSeats){
            isItBooked = true;
            bookedFirstClassSeats += totalNumberOfSeats;
        }else if (!forFirstClass && getAvailableCoachSeats() >= totalNumberOfSeats){
            isItBooked = true;
            bookedCoachSeats += totalNumberOfSeats;
        }
        return isItBooked;
    }
}