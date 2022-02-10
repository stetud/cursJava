package curs10;

import java.io.IOException;

public class Stocuri {
    Object[] keys;

    public Stocuri() throws IOException {
        Calorii calorii = new Calorii();
        keys = calorii.readKeys();
    }

    public boolean verificaLegumaInStoc(String nume) {

        for (Object key : keys) {
            if (nume.equals(key))
                return true;
        }
        return false;
    }
}
