package rs.ac.metropolitan.methotels.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import org.apache.tapestry5.ioc.annotations.Inject;

@Entity
@Table(name = "soba")
@NamedQueries({
    @NamedQuery(name = "Soba.findAll", query = "SELECT s FROM Soba s")})
public class Soba implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Naziv")
    private String naziv;
    @Basic(optional = false)
    @Column(name = "Sprat")
    private int sprat;
    @Basic(optional = false)
    @Column(name = "TV")
    private boolean tv;
    @Basic(optional = false)
    @Column(name = "Internet")
    private boolean internet;
    @Basic(optional = false)
    @Column(name = "Djakuzi")
    private boolean djakuzi;

    @Inject
    public Soba() {
    }

    public Soba(Integer id) {
        this.id = id;
    }

    public Soba(Integer id, String naziv, int sprat, boolean tv, boolean internet, boolean djakuzi) {
        this.id = id;
        this.naziv = naziv;
        this.sprat = sprat;
        this.tv = tv;
        this.internet = internet;
        this.djakuzi = djakuzi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getSprat() {
        return sprat;
    }

    public void setSprat(int sprat) {
        this.sprat = sprat;
    }

    public boolean getTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean getInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public boolean getDjakuzi() {
        return djakuzi;
    }

    public void setDjakuzi(boolean djakuzi) {
        this.djakuzi = djakuzi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Soba)) {
            return false;
        }
        Soba other = (Soba) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rs.ac.metropolitan.methotels.entities.Soba[ id=" + id + " ]";
    }

}
