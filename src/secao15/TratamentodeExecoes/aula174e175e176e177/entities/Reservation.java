package secao15.TratamentodeExecoes.aula174e175e176e177.entities;

import secao15.TratamentodeExecoes.aula174e175e176e177.exceptions.DomainException;

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

    public Reservation(Integer roomMunber, Date checkin, Date checlout) throws DomainException{
        if (!checkout.after(checkin)) {// aqui estou usando o negativo
            //} else if (checkout.before(checkIn)) { outra opcao, aqui estou usando e acertivo
            throw new DomainException( "check-out date must be after checkin date ");
        }
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
    public void  UpdateDates (Date checkin, Date checkout) throws DomainException{//metodo com parametros checkin e checkout
        Date now= new Date();
        if (checkin.before(now)||checkout.before(now)) {
            // ele se aplica as datas de agora, com aplicacoes que vao rodar agora
            //so digitar datas a partir da data real new DAte()
            throw new DomainException( "reservation dates for updates must be future dates");
        }
        if (!checkin.after(getCheckin())) {
            throw new DomainException( "check-out date must be after check-in date");
        }
        if (!checkout.after(checkin)) {// aqui estou usando o negativo
            //} else if (checkout.before(checkIn)) { outra opcao, aqui estou usando e acertivo
            throw new DomainException( "check-out date must be after checkin date ");
        }
        this.checkin = checkin;//this.checkin recebe checkin do parametro que vai ser digitado
        this.checkout = checkout;//this.checkout recebe checkout do parametro que vai   ser digitado

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
