package com.fastcampus.todo.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @AttributeOverride(
            name = "city",
            column = @Column(name = "metrocity")
    )
    private String city;
    private String province;
}