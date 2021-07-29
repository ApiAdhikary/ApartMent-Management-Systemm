/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
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
 * @author User
 */
@Entity
@Table(name = "paymentmethod", catalog = "ams", schema = "")
@NamedQueries({
    @NamedQuery(name = "Paymentmethod_1.findAll", query = "SELECT p FROM Paymentmethod_1 p")
    , @NamedQuery(name = "Paymentmethod_1.findByRoomno", query = "SELECT p FROM Paymentmethod_1 p WHERE p.roomno = :roomno")
    , @NamedQuery(name = "Paymentmethod_1.findByName", query = "SELECT p FROM Paymentmethod_1 p WHERE p.name = :name")
    , @NamedQuery(name = "Paymentmethod_1.findByType", query = "SELECT p FROM Paymentmethod_1 p WHERE p.type = :type")
    , @NamedQuery(name = "Paymentmethod_1.findByMonth", query = "SELECT p FROM Paymentmethod_1 p WHERE p.month = :month")
    , @NamedQuery(name = "Paymentmethod_1.findByPrice", query = "SELECT p FROM Paymentmethod_1 p WHERE p.price = :price")
    , @NamedQuery(name = "Paymentmethod_1.findByPaid", query = "SELECT p FROM Paymentmethod_1 p WHERE p.paid = :paid")
    , @NamedQuery(name = "Paymentmethod_1.findByRet", query = "SELECT p FROM Paymentmethod_1 p WHERE p.ret = :ret")})
public class Paymentmethod_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "roomno")
    private String roomno;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "month")
    private String month;
    @Basic(optional = false)
    @Column(name = "price")
    private String price;
    @Basic(optional = false)
    @Column(name = "paid")
    private String paid;
    @Basic(optional = false)
    @Column(name = "ret")
    private String ret;

    public Paymentmethod_1() {
    }

    public Paymentmethod_1(String roomno) {
        this.roomno = roomno;
    }

    public Paymentmethod_1(String roomno, String name, String type, String month, String price, String paid, String ret) {
        this.roomno = roomno;
        this.name = name;
        this.type = type;
        this.month = month;
        this.price = price;
        this.paid = paid;
        this.ret = ret;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        String oldRoomno = this.roomno;
        this.roomno = roomno;
        changeSupport.firePropertyChange("roomno", oldRoomno, roomno);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        String oldType = this.type;
        this.type = type;
        changeSupport.firePropertyChange("type", oldType, type);
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        String oldMonth = this.month;
        this.month = month;
        changeSupport.firePropertyChange("month", oldMonth, month);
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        String oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        String oldPaid = this.paid;
        this.paid = paid;
        changeSupport.firePropertyChange("paid", oldPaid, paid);
    }

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        String oldRet = this.ret;
        this.ret = ret;
        changeSupport.firePropertyChange("ret", oldRet, ret);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomno != null ? roomno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paymentmethod_1)) {
            return false;
        }
        Paymentmethod_1 other = (Paymentmethod_1) object;
        if ((this.roomno == null && other.roomno != null) || (this.roomno != null && !this.roomno.equals(other.roomno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "as.Paymentmethod_1[ roomno=" + roomno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
