package Map;

import javax.persistence.*;

@Entity
@Table(name = "VEHICLES", schema = "T00198379", catalog = "")
public class VehiclesEntity {
    private short regnumber;
    private String make;
    private String modelcar;
    private String color;

    @Id
    @Column(name = "REGNUMBER")
    public short getRegnumber() {
        return regnumber;
    }

    public void setRegnumber(short regnumber) {
        this.regnumber = regnumber;
    }

    @Basic
    @Column(name = "MAKE")
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Basic
    @Column(name = "MODELCAR")
    public String getModelcar() {
        return modelcar;
    }

    public void setModelcar(String modelcar) {
        this.modelcar = modelcar;
    }

    @Basic
    @Column(name = "COLOR")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehiclesEntity that = (VehiclesEntity) o;

        if (regnumber != that.regnumber) return false;
        if (make != null ? !make.equals(that.make) : that.make != null) return false;
        if (modelcar != null ? !modelcar.equals(that.modelcar) : that.modelcar != null) return false;
        if (color != null ? !color.equals(that.color) : that.color != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) regnumber;
        result = 31 * result + (make != null ? make.hashCode() : 0);
        result = 31 * result + (modelcar != null ? modelcar.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
