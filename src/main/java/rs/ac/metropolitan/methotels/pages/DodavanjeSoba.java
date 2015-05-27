package rs.ac.metropolitan.methotels.pages;

import java.util.ArrayList;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;
import rs.ac.metropolitan.methotels.entities.Soba;


public class DodavanjeSoba {

    @Property
    private Soba soba;

    @Property
    private ArrayList listaSoba;

    @Inject
    private Session session;

    void onActivate() {
        if (listaSoba == null) {
            listaSoba = new ArrayList<Soba>();
        }
        listaSoba = (ArrayList) session.createCriteria(Soba.class).list();
    }

    @CommitAfter
    Object onSuccess() {
        session.persist(soba);
        return this;
    }

}
