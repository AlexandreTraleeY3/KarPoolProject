package Map;

import javax.persistence.*;
import java.sql.Time;
import java.util.Arrays;

@Entity
@Table(name = "DRIVER", schema = "T00198379", catalog = "")
public class DriverEntity {
    private String licenceno;
    private String insurancedetails;
    private String nctcert;
    private Time licenceissue;
    private Time licenceexpirydate;
    private String vehichlereg;
    private byte[] licencepic;

    @Id
    @Column(name = "LICENCENO")
    public String getLicenceno() {
        return licenceno;
    }

    public void setLicenceno(String licenceno) {
        this.licenceno = licenceno;
    }

    @Basic
    @Column(name = "INSURANCEDETAILS")
    public String getInsurancedetails() {
        return insurancedetails;
    }

    public void setInsurancedetails(String insurancedetails) {
        this.insurancedetails = insurancedetails;
    }

    @Basic
    @Column(name = "NCTCERT")
    public String getNctcert() {
        return nctcert;
    }

    public void setNctcert(String nctcert) {
        this.nctcert = nctcert;
    }

    @Basic
    @Column(name = "LICENCEISSUE")
    public Time getLicenceissue() {
        return licenceissue;
    }

    public void setLicenceissue(Time licenceissue) {
        this.licenceissue = licenceissue;
    }

    @Basic
    @Column(name = "LICENCEEXPIRYDATE")
    public Time getLicenceexpirydate() {
        return licenceexpirydate;
    }

    public void setLicenceexpirydate(Time licenceexpirydate) {
        this.licenceexpirydate = licenceexpirydate;
    }

    @Basic
    @Column(name = "VEHICHLEREG")
    public String getVehichlereg() {
        return vehichlereg;
    }

    public void setVehichlereg(String vehichlereg) {
        this.vehichlereg = vehichlereg;
    }

    @Basic
    @Column(name = "LICENCEPIC")
    public byte[] getLicencepic() {
        return licencepic;
    }

    public void setLicencepic(byte[] licencepic) {
        this.licencepic = licencepic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DriverEntity that = (DriverEntity) o;

        if (licenceno != null ? !licenceno.equals(that.licenceno) : that.licenceno != null) return false;
        if (insurancedetails != null ? !insurancedetails.equals(that.insurancedetails) : that.insurancedetails != null)
            return false;
        if (nctcert != null ? !nctcert.equals(that.nctcert) : that.nctcert != null) return false;
        if (licenceissue != null ? !licenceissue.equals(that.licenceissue) : that.licenceissue != null) return false;
        if (licenceexpirydate != null ? !licenceexpirydate.equals(that.licenceexpirydate) : that.licenceexpirydate != null)
            return false;
        if (vehichlereg != null ? !vehichlereg.equals(that.vehichlereg) : that.vehichlereg != null) return false;
        if (!Arrays.equals(licencepic, that.licencepic)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = licenceno != null ? licenceno.hashCode() : 0;
        result = 31 * result + (insurancedetails != null ? insurancedetails.hashCode() : 0);
        result = 31 * result + (nctcert != null ? nctcert.hashCode() : 0);
        result = 31 * result + (licenceissue != null ? licenceissue.hashCode() : 0);
        result = 31 * result + (licenceexpirydate != null ? licenceexpirydate.hashCode() : 0);
        result = 31 * result + (vehichlereg != null ? vehichlereg.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(licencepic);
        return result;
    }
}
