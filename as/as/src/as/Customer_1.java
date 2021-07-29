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
@Table(name = "customer", catalog = "ams", schema = "")
@NamedQueries({
    @NamedQuery(name = "Customer_1.findAll", query = "SELECT c FROM Customer_1 c")
    , @NamedQuery(name = "Customer_1.findByName", query = "SELECT c FROM Customer_1 c WHERE c.name = :name")
    , @NamedQuery(name = "Customer_1.findByPhone", query = "SELECT c FROM Customer_1 c WHERE c.phone = :phone")
    , @NamedQuery(name = "Customer_1.findByAddress", query = "SELECT c FROM Customer_1 c WHERE c.address = :address")
    , @NamedQuery(name = "Customer_1.findByPrice", query = "SELECT c FROM Customer_1 c WHERE c.price = :price")
    , @NamedQuery(name = "Customer_1.findByJoindate", query = "SELECT c FROM Customer_1 c WHERE c.joindate = :joindate")
    , @NamedQuery(name = "Customer_1.findByRoomno", query = "SELECT c FROM Customer_1 c WHERE c.roomno = :roomno")
    , @NamedQuery(name = "Customer_1.findByRoomtype", query = "SELECT c FROM Customer_1 c WHERE c.roomtype = :roomtype")})
public class Customer_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Id
    @Basic(optional = false)
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "price")
    private String price;
    @Basic(optional = false)
    @Column(name = "joindate")
    private String joindate;
    @Basic(optional = false)
    @Column(name = "roomno")
    private String roomno;
    @Basic(optional = false)
    @Column(name = "roomtype")
    private String roomtype;

    public Customer_1() {
    }

    public Customer_1(String phone) {
        this.phone = phone;
    }

    public Customer_1(String phone, String name, String address, String price, String joindate, String roomno, String roomtype) {
        this.phone = phone;
        this.name = name;
        this.address = address;
        this.price = price;
        this.joindate = joindate;
        this.roomno = roomno;
        this.roomtype = roomtype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        String oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        String oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public String getJoindate() {
        return joindate;
    }

    public void setJoindate(String joindate) {
        String oldJoindate = this.joindate;
        this.joindate = joindate;
        changeSupport.firePropertyChange("joindate", oldJoindate, joindate);
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        String oldRoomno = this.roomno;
        this.roomno = roomno;
        changeSupport.firePropertyChange("roomno", oldRoomno, roomno);
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        String oldRoomtype = this.roomtype;
        this.roomtype = roomtype;
        changeSupport.firePropertyChange("roomtype", oldRoomtype, roomtype);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (phone != null ? phone.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer_1)) {
            return false;
        }
        Customer_1 other = (Customer_1) object;
        if ((this.phone == null && other.phone != null) || (this.phone != null && !this.phone.equals(other.phone))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "as.Customer_1[ phone=" + phone + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
