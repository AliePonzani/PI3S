package Exception;

import java.io.IOException;

public class TesteIOException {
    public static void main(String[] args) throws IOException{ // se utilizar o throws não é necessário usar o try/catch
        byte mByte[] = new byte[100];

        System.out.println("Entre com um valor: ");
       // try {
            System.in.read(mByte);
        //} catch (IOException e) {
            System.out.println("Erro de I/O");
       // }
    }
}
