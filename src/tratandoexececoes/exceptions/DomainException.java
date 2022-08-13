package tratandoexececoes.exceptions;
//extends Exception é obrigado a tratar
//extends RunTimeExcecpiton nao é obrigado a tratar, nao precisa de tray catch
//nao precisa de throws DomianException na classe reservation enos metodos ,mas quando der
// uma DomainException em algum metodo o programa vai quebrar
//nao podemos deixar o programa quebrar
//fazemos um novo catch(RuntimeException ){ sout ("unexpected error") para erros inesperados
//catch (ParseException e ){
//            System.out.println("invalid day format");//esse erro eu sei que pode acontecer
//        }
//        catch (DomainException e){//tratamos essa exececao com a msg personalizada
//            System.out.println("error in reservation: "+ e.getMessage());
//        }
//              esse catch é um tipo generico
//        catch (RuntimeException e){//e essa com um erro inesperados
//            System.out.println("unexpected error");
//        }
public class DomainException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public DomainException (String msg){
        super(msg);
    }



}
