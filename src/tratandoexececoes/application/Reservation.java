package tratandoexececoes.application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private  static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Integer roomMunber;
    private Date checkin;
    private Date checkout;

    public Reservation() {
    }

    public Reservation(Integer roomMunber, Date checkin, Date checlout) {
        this.roomMunber = roomMunber;
        this.checkin = checkin;
        this.checkout = checlout;
    }

    public Integer getRoomMunber() {
        return roomMunber;
    }

    public void setRoomMunber(Integer roomMunber) {
        this.roomMunber = roomMunber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }
    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public long durantion(){
        //diferenA EM MILESSEGUNDOS
        long diff = checkin.getTime()-checkin.getTime();
        return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
    }
    public void UpdateDates (Date checkin, Date checlout){
        this.checkin = checkin;
        this.checkout = checlout;
    }

    @Override
    public String toString() {
        return
                "room " + roomMunber +
                ", checkin=" + sdf.format(checkin) +
                ", checlout=" + sdf.format(checkout) +
                '}';
    }
}
