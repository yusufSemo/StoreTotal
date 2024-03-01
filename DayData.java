import java.time.LocalDate;

public class DayData {
    private LocalDate MyDate;
    private float Cash;
    private float Card;
    private float Online;
    private float Total;

    public DayData(int month, int day, int year, float card, float online, float cash){
        //constructor that creates a date with cash,card,online data
        this.MyDate = LocalDate.of(year, month, day);
        this.Cash = cash;
        this.Card = card;
        this.Online = online;
        this.Total = cash+card+online;
    }
    public String getData(){
        return (this.MyDate + "\nCard-" + this.Card + "\nOnline" + this.Online + "\nCash-" + this.Cash + "\nTotal-" + this.Total);
    }
    

}
