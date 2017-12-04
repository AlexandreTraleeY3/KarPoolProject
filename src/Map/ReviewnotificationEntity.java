package Map;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "REVIEWNOTIFICATION", schema = "T00198379", catalog = "")
public class ReviewnotificationEntity {
    private short rNotifid;
    private Timestamp time;

    @Id
    @Column(name = "R_NOTIFID")
    public short getrNotifid() {
        return rNotifid;
    }

    public void setrNotifid(short rNotifid) {
        this.rNotifid = rNotifid;
    }

    @Basic
    @Column(name = "TIME")
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReviewnotificationEntity that = (ReviewnotificationEntity) o;

        if (rNotifid != that.rNotifid) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) rNotifid;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }
}
