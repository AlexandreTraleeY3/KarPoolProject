package Map;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Table(name = "TRIP", schema = "T00198379", catalog = "")
public class TripEntity {
    private short tripid;
    private String pickup;
    private String destination;
    private Timestamp departuretime;
    private short seatsavailable;
    private Time departuredate;
    private long price;

    @Id
    @Column(name = "TRIPID")
    public short getTripid() {
        return tripid;
    }

    public void setTripid(short tripid) {
        this.tripid = tripid;
    }

    @Basic
    @Column(name = "PICKUP")
    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    @Basic
    @Column(name = "DESTINATION")
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Basic
    @Column(name = "DEPARTURETIME")
    public Timestamp getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(Timestamp departuretime) {
        this.departuretime = departuretime;
    }

    @Basic
    @Column(name = "SEATSAVAILABLE")
    public short getSeatsavailable() {
        return seatsavailable;
    }

    public void setSeatsavailable(short seatsavailable) {
        this.seatsavailable = seatsavailable;
    }

    @Basic
    @Column(name = "DEPARTUREDATE")
    public Time getDeparturedate() {
        return departuredate;
    }

    public void setDeparturedate(Time departuredate) {
        this.departuredate = departuredate;
    }

    @Basic
    @Column(name = "PRICE")
    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TripEntity that = (TripEntity) o;

        if (tripid != that.tripid) return false;
        if (seatsavailable != that.seatsavailable) return false;
        if (price != that.price) return false;
        if (pickup != null ? !pickup.equals(that.pickup) : that.pickup != null) return false;
        if (destination != null ? !destination.equals(that.destination) : that.destination != null) return false;
        if (departuretime != null ? !departuretime.equals(that.departuretime) : that.departuretime != null)
            return false;
        if (departuredate != null ? !departuredate.equals(that.departuredate) : that.departuredate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) tripid;
        result = 31 * result + (pickup != null ? pickup.hashCode() : 0);
        result = 31 * result + (destination != null ? destination.hashCode() : 0);
        result = 31 * result + (departuretime != null ? departuretime.hashCode() : 0);
        result = 31 * result + (int) seatsavailable;
        result = 31 * result + (departuredate != null ? departuredate.hashCode() : 0);
        result = 31 * result + (int) (price ^ (price >>> 32));
        return result;
    }
}
