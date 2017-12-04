package Map;

import javax.persistence.*;

@Entity
@Table(name = "MEMBERT", schema = "T00198379", catalog = "")
public class MembertEntity {
    private short memberId;
    private String namemember;
    private String address;
    private String phoneno;
    private String email;
    private String membertype;
    private String age;
    private String tnumber;
    private String pass;

    @Id
    @Column(name = "MEMBER_ID")
    public short getMemberId() {
        return memberId;
    }

    public void setMemberId(short memberId) {
        this.memberId = memberId;
    }

    @Basic
    @Column(name = "NAMEMEMBER")
    public String getNamemember() {
        return namemember;
    }

    public void setNamemember(String namemember) {
        this.namemember = namemember;
    }

    @Basic
    @Column(name = "ADDRESS")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "PHONENO")
    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "MEMBERTYPE")
    public String getMembertype() {
        return membertype;
    }

    public void setMembertype(String membertype) {
        this.membertype = membertype;
    }

    @Basic
    @Column(name = "AGE")
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Basic
    @Column(name = "TNUMBER")
    public String getTnumber() {
        return tnumber;
    }

    public void setTnumber(String tnumber) {
        this.tnumber = tnumber;
    }

    @Basic
    @Column(name = "PASS")
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MembertEntity that = (MembertEntity) o;

        if (memberId != that.memberId) return false;
        if (namemember != null ? !namemember.equals(that.namemember) : that.namemember != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (phoneno != null ? !phoneno.equals(that.phoneno) : that.phoneno != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (membertype != null ? !membertype.equals(that.membertype) : that.membertype != null) return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        if (tnumber != null ? !tnumber.equals(that.tnumber) : that.tnumber != null) return false;
        if (pass != null ? !pass.equals(that.pass) : that.pass != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) memberId;
        result = 31 * result + (namemember != null ? namemember.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phoneno != null ? phoneno.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (membertype != null ? membertype.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (tnumber != null ? tnumber.hashCode() : 0);
        result = 31 * result + (pass != null ? pass.hashCode() : 0);
        return result;
    }
}
