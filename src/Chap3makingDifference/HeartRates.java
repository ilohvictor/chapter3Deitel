package Chap3makingDifference;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int month;
    private int year;
    private int day;
    private int age;
    private int heartRate;

    public HeartRates(String firstName, String lastName,int month ,int year , int day){
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year =  year;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int getMonth(){
        return month;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getDay(){
        return day;
    }
    public int realAge(){
        this.age = year - 2019;
        return age;
    }
    public int heartTarget(){
        this.heartRate = 220 - age;
        return heartRate;
    }

}