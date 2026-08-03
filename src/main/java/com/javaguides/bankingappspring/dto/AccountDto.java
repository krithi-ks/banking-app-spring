/* Use Record Class as DTO - automatically creates getter, setter,
constructors, hashcode, equals, ...*/

package com.javaguides.bankingappspring.dto;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//// auto creates getter, setters
//@Data
//@AllArgsConstructor
//public class AccountDto {
//    private Long id;
//    private String accountHolderName;
//    private double balance;
//}


//Record class - immutable
public record AccountDto(Long id,
                         String accountHolderName,
                         double balance){

}
