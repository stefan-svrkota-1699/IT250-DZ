package rs.ac.metropolitan.methotels.pages;

import java.util.ArrayList;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import rs.ac.metropolitan.methotels.data.Soba;

public class DodavanjeSoba {

    @Property
    private Soba soba;

    @Persist
    @Property
    private ArrayList listaSoba;

    void onActivate() {
        if (listaSoba == null) {
            listaSoba = new ArrayList<Soba>();
        }
    }

    Object onSuccess() {
        listaSoba.add(soba);
        return this;
    }

}
