//Esta classe vai conter as funções de edição de texto 

public class Utilitaria {

    public String limparTexto(String texto){
        String textoLimpo = "";

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == '.' || letra == '-' || letra == '/' || letra == '\\') {
                continue;
            } else {
                textoLimpo += letra;
            }
        }

        return textoLimpo;
    }

}
