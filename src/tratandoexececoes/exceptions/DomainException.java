package tratandoexececoes.exceptions;
//extends Exception é obrigado a tratar
//extends RunTimeExcecpiton nao é obrigado a tratar, nao precisa de tray catch
//nao precisa de throws DomianException na classe reservation ,mas quando der erro o programa vai quebrar
//nao podemos deixar o programa quebrar
public class DomainException extends Exception{
    private static final long serialVersionUID = 1L;

    public DomainException (String msg){
        super(msg);
    }



}
