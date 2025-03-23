package edu.icet.ecom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="customer")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String address;

    private Integer contactNumber;

    private  String email;

    @Column(name = "is_deleted",columnDefinition = "TinyInt(1)",nullable = false)
    private boolean isDeleted;

    public  void  softDelete(){
        this.isDeleted =true;
    }



}
