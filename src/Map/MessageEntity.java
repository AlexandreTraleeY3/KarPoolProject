package Map;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "MESSAGE", schema = "T00198379", catalog = "")
public class MessageEntity {
    private short messageid;
    private Timestamp senttime;
    private String messagedata;
    private String isread;

    @Id
    @Column(name = "MESSAGEID")
    public short getMessageid() {
        return messageid;
    }

    public void setMessageid(short messageid) {
        this.messageid = messageid;
    }

    @Basic
    @Column(name = "SENTTIME")
    public Timestamp getSenttime() {
        return senttime;
    }

    public void setSenttime(Timestamp senttime) {
        this.senttime = senttime;
    }

    @Basic
    @Column(name = "MESSAGEDATA")
    public String getMessagedata() {
        return messagedata;
    }

    public void setMessagedata(String messagedata) {
        this.messagedata = messagedata;
    }

    @Basic
    @Column(name = "ISREAD")
    public String getIsread() {
        return isread;
    }

    public void setIsread(String isread) {
        this.isread = isread;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MessageEntity that = (MessageEntity) o;

        if (messageid != that.messageid) return false;
        if (senttime != null ? !senttime.equals(that.senttime) : that.senttime != null) return false;
        if (messagedata != null ? !messagedata.equals(that.messagedata) : that.messagedata != null) return false;
        if (isread != null ? !isread.equals(that.isread) : that.isread != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) messageid;
        result = 31 * result + (senttime != null ? senttime.hashCode() : 0);
        result = 31 * result + (messagedata != null ? messagedata.hashCode() : 0);
        result = 31 * result + (isread != null ? isread.hashCode() : 0);
        return result;
    }
}
