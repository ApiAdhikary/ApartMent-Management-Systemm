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
@Table(name = "room", catalog = "ams", schema = "")
@NamedQueries({
    @NamedQuery(name = "Room_1.findAll", query = "SELECT r FROM Room_1 r")
    , @NamedQuery(name = "Room_1.findByRoomno", query = "SELECT r FROM Room_1 r WHERE r.roomno = :roomno")
    , @NamedQuery(name = "Room_1.findByPrice", query = "SELECT r FROM Room_1 r WHERE r.price = :price")
    , @NamedQuery(name = "Room_1.findByType", query = "SELECT r FROM Room_1 r WHERE r.type = :type")
    , @NamedQuery(name = "Room_1.findByAvail", query = "SELECT r FROM Room_1 r WHERE r.avail = :avail")})
public class Room_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "roomno")
    private String roomno;
    @Basic(optional = false)
    @Column(name = "price")
    private String price;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "avail")
    private String avail;

    public Room_1() {
    }

    public Room_1(String roomno) {
        this.roomno = roomno;
    }

    public Room_1(String roomno, String price, String type, String avail) {
        this.roomno = roomno;
        this.price = price;
        this.type = type;
        this.avail = avail;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        String oldRoomno = this.roomno;
        this.roomno = roomno;
        changeSupport.firePropertyChange("roomno", oldRoomno, roomno);
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        String oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        String oldType = this.type;
        this.type = type;
        changeSupport.firePropertyChange("type", oldType, type);
    }

    public String getAvail() {
        return avail;
    }

    public void setAvail(String avail) {
        String oldAvail = this.avail;
        this.avail = avail;
        changeSupport.firePropertyChange("avail", oldAvail, avail);
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
        if (!(object instanceof Room_1)) {
            return false;
        }
        Room_1 other = (Room_1) object;
        if ((this.roomno == null && other.roomno != null) || (this.roomno != null && !this.roomno.equals(other.roomno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "as.Room_1[ roomno=" + roomno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
