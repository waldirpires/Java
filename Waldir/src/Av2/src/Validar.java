import java.util.Calendar;

public class Validar {
    public static void validarUsuario(Usuario user){
        if(user.getIdade() < 0 || user.getIdade() < 18 || user.getIdade() > 100){
            throw new IdadeException("idade");
        }

        if(user.getAnoNasc() < 1980 || user.getAnoNasc() == Calendar.getInstance().getWeekYear()){
            throw new AnoException("Ano");
        }

        if(user.getMesNas() > 12 || user.getMesNas() <1){
            throw new MesException("Mes");
        }

        if(user.getNome().equals("") || user.getNome() == null){
            throw new NomeException("nome");
        }
    }
}
