package tratandoexececoes.entities;

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
        //diferenca em milliseconds
        long diff = checkout.getTime()-checkin.getTime();//calculo para obter a diferrenca entre checkin e checkout
        return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);//aqui converte o valor em milliseconds em dias
    }
    public void UpdateDates (Date checkin, Date checlout){//metodo com parametros checkin e checkout
        this.checkin = checkin;//this.checkin recebe checkin do parametro que vai ser digitado
        this.checkout = checlout;//this.checkout recebe checkout do parametro que vai   ser digitado
    }

    @Override
    public String toString() {
        return
                "room " + roomMunber +
                ", checkin=" + sdf.format(checkin) +
                ", checkout=" + sdf.format(checkout)+", " +
                        durantion()+" nights";
    }
}
