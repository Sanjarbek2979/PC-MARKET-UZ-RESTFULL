package com.example.task02.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Sanjarbek Allayev, пн 15:29. 14.03.2022
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CartDTO {
private Integer productId;
private Integer amount ;
private Integer cartId;
}
