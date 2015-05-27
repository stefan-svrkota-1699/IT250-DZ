package rs.ac.metropolitan.methotels.data;

import org.apache.tapestry5.ioc.annotations.Inject;

public class Soba {

    private String ime;
    private int sprat;
    private boolean tv;
    private boolean djakuzi;
    private boolean internet;

    @Inject
    public Soba() {
    }

    public Soba(String ime, int sprat, boolean tv, boolean djakuzi, boolean internet) {
        this.ime = ime;
        this.sprat = sprat;
        this.tv = tv;
        this.djakuzi = djakuzi;
        this.internet = internet;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getSprat() {
        return sprat;
    }

    public void setSprat(int sprat) {
        this.sprat = sprat;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isDjakuzi() {
        return djakuzi;
    }

    public void setDjakuzi(boolean djakuzi) {
        this.djakuzi = djakuzi;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

}
