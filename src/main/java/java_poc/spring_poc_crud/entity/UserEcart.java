package java_poc.spring_poc_crud.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
/* @Data: This annotation is from Lombok, a Java library that helps reduce boilerplate code.
It automatically generates getter and setter methods for all fields,
as well as toString, equals, and hashCode methods.
*/
@AllArgsConstructor
/*
@AllArgsConstructor: Another Lombok annotation,
which generates a constructor with one parameter for each field in the class.
 */
@NoArgsConstructor
/*
@NoArgsConstructor: This Lombok annotation generates a no-argument constructor
 */

/*
This JPA annotation specifies that the class is an entity and is mapped to a database table
 */

@Entity
public class UserEcart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long parcellId;
    private String receiverName;
    private int receiverContact;
    private String receiverAddress;
    private int itemPrice;
    private String itemStatus;
    private String executiveName;
}
