//Classe que tem as funções de validação

public class Validacao {

    public boolean validarRG(String texto){
        Utilitaria utilitaria = new Utilitaria();
        texto = utilitaria.limparTexto(texto);
        String digitoRg = texto.substring(texto.length()-1); //pega somente a ultima "letra" do rg digitado
        int soma = 0, resto = 0, digito = 0;
        String digitoConvertido = "";
        boolean rgValido = false;

        for (int i = 0; i < texto.length() - 1; i++) {
            int numero = Character.getNumericValue(texto.charAt(i)) ; //pega o char(caracter retirado do texto) e converte em int
            soma += ((i+2) * numero);
        }

        resto = (soma % 11);
        digito = 11 - resto;

        if (digito == 10) {
            digitoConvertido = "X";
        } else if(digito == 11){
            digitoConvertido = "0";
        } else {
            digitoConvertido = Integer.toString(digito);
        }

        if (digitoConvertido.equals(digitoRg)) {
            rgValido = true;
        }
        
        return rgValido;
    }

    public boolean validarCpf(String texto){
        boolean cpfValido = false;
        Utilitaria utilitaria = new Utilitaria();
        texto = utilitaria.limparTexto(texto);
        String digitoCpf = texto.substring(texto.length()-2, texto.length()); //pega os dois ultimos digitos
        int soma = 0, resto = 0, digito;
        String digitoConvertido = "";

        for (int i = 0; i < (texto.length()-3)+digitoConvertido.length(); i++) {
            int numero = Character.getNumericValue(texto.charAt(i));
            soma += ((i+2) * numero);
        }

        resto = soma%11;
        digito = 11 - resto;

        if (digito >= 10 ) {
            digitoConvertido += "0";
        } else {
            digitoConvertido += ""+digito;
        }

        soma = 0;

        for (int i = 0; i < (texto.length()-3)+digitoConvertido.length(); i++) {
            int numero = Character.getNumericValue(texto.charAt(i));
            soma += ((i+2) * numero);
        }

        resto = soma%11;
        digito = 11 - resto;

        if (digito >= 10 ) {
            digitoConvertido += "0";
        } else {
            digitoConvertido += ""+digito;
        }

        if (digitoConvertido.equals(digitoCpf)) {
            cpfValido = true;
        } 

        return cpfValido;
    }
}
