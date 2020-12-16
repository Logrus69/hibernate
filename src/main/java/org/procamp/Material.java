package org.procamp;

import javax.persistence.*;

@Entity
@Table(name = "material")
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "material_seq")
    @SequenceGenerator(name = "material_seq", sequenceName = "material_inst_id_seq", allocationSize = 1)
    @Column(name = "inst_id")
    private Long materialId;
    private String material;
    private String price;
    private String supplier;
    private String measurement;
    private String balance;

    @ManyToOne
    @JoinColumn(name = "activityId")
    private Activity activity;

    public Activity getActivity() {return activity; }

    public void setActivity(Activity activity) {this.activity = activity; }

    public Long getMaterialId() {return materialId; }

    public void setMaterialId(Long materialId) {this.materialId = materialId; }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
