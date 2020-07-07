package challenge;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
        boolean vazio = texto.isEmpty();
        String textoCriptografado = "";
        texto = texto.toLowerCase();
        if (!vazio) {
            for (char caracter : texto.toCharArray()) {
                if (Character.isAlphabetic(caracter)) caracter += 3;
                textoCriptografado += caracter;
            }
        } else throw new IllegalArgumentException("Algo não deu certo!");

        return textoCriptografado;
    }

    @Override
    public String descriptografar(String texto) {
        boolean vazio = texto.isEmpty();
        String textoCriptografado = "";
        texto = texto.toLowerCase();
        if (!vazio) {
            for (char caracter : texto.toCharArray()) {
                if (Character.isAlphabetic(caracter)) caracter -= 3;
                textoCriptografado += caracter;
            }
        } else throw new IllegalArgumentException("Algo não deu certo!");

        return textoCriptografado;
    }
}