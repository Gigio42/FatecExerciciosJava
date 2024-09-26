package aula08;

import java.io.*;

public class PessoaJuridicaPersistente extends PessoaJuridica {

    public String gravar() {

        String s = "";
        try {
            FileOutputStream fos = new FileOutputStream(cnpj + ".obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.flush();
            oos.close();
            s = "Arquivo gravado com sucesso!";
        } catch (IOException e) {
            s = "falha na gravação" + e.getMessage();
        }

        return s;
    }

    public static PessoaJuridica ler(String cnpj) {
        PessoaJuridica p = null;
        try {
            FileInputStream fos = new FileInputStream(cnpj + ".obj");
            ObjectInputStream oos = new ObjectInputStream(fos);
            p = (PessoaJuridica) oos.readObject();
            oos.close();

        } catch (Exception e) {}

        return p;
    }
}
