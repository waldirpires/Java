import java.util.ArrayList;
import java.util.List;

public class AdapterParaAsciiImp implements AdapterParaAscii {
    

    @Override
    public List<Short> adptarParaAscii(String dado) {
        List<Short> resultado = new ArrayList<Short>();
        for ( int i = 0; i < dado.length(); ++i ) {
            char c = dado.charAt( i );
            short j = (short) c;
            resultado.add(j);
        }
        return resultado;
    }

}
