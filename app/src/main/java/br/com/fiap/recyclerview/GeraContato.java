package br.com.fiap.recyclerview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 29/03/2017.
 */

public class GeraContato {
    public static List<Contato> listaContatos() {
        List<Contato> contatos = new ArrayList<>();
        contatos.add(new Contato("João", "11 1111-1111", "Olá", R.drawable.ic_face_black_24dp));
        contatos.add(new Contato("João", "11 1111-1111", "Olá", R.drawable.ic_face_black_24dp));

        return contatos;
    }
}