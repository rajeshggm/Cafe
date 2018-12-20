/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafee;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Rajesh
 */
@Entity
@Table(name = "dbdetails", catalog = "ONE", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Dbdetails.findAll", query = "SELECT d FROM Dbdetails d")
    , @NamedQuery(name = "Dbdetails.findById", query = "SELECT d FROM Dbdetails d WHERE d.id = :id")
    , @NamedQuery(name = "Dbdetails.findByUrl", query = "SELECT d FROM Dbdetails d WHERE d.url = :url")
    , @NamedQuery(name = "Dbdetails.findByDriver", query = "SELECT d FROM Dbdetails d WHERE d.driver = :driver")
    , @NamedQuery(name = "Dbdetails.findByUsername", query = "SELECT d FROM Dbdetails d WHERE d.username = :username")
    , @NamedQuery(name = "Dbdetails.findByPass", query = "SELECT d FROM Dbdetails d WHERE d.pass = :pass")
    , @NamedQuery(name = "Dbdetails.findByLat", query = "SELECT d FROM Dbdetails d WHERE d.lat = :lat")
    , @NamedQuery(name = "Dbdetails.findByLng", query = "SELECT d FROM Dbdetails d WHERE d.lng = :lng")
    , @NamedQuery(name = "Dbdetails.findByTablename", query = "SELECT d FROM Dbdetails d WHERE d.tablename = :tablename")})
public class Dbdetails implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private BigDecimal id;
    @Column(name = "url")
    private String url;
    @Column(name = "driver")
    private String driver;
    @Column(name = "username")
    private String username;
    @Column(name = "pass")
    private String pass;
    @Column(name = "lat")
    private Double lat;
    @Column(name = "lng")
    private Double lng;
    @Column(name = "tablename")
    private String tablename;

    public Dbdetails() {
    }

    public Dbdetails(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        BigDecimal oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        String oldUrl = this.url;
        this.url = url;
        changeSupport.firePropertyChange("url", oldUrl, url);
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        String oldDriver = this.driver;
        this.driver = driver;
        changeSupport.firePropertyChange("driver", oldDriver, driver);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        String oldPass = this.pass;
        this.pass = pass;
        changeSupport.firePropertyChange("pass", oldPass, pass);
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        Double oldLat = this.lat;
        this.lat = lat;
        changeSupport.firePropertyChange("lat", oldLat, lat);
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        Double oldLng = this.lng;
        this.lng = lng;
        changeSupport.firePropertyChange("lng", oldLng, lng);
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        String oldTablename = this.tablename;
        this.tablename = tablename;
        changeSupport.firePropertyChange("tablename", oldTablename, tablename);
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
        if (!(object instanceof Dbdetails)) {
            return false;
        }
        Dbdetails other = (Dbdetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cafee.Dbdetails[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
