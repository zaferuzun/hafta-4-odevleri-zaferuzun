package com.innova.solid.openClosed.principled;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GeneralModel {

    private String characterName;
    private int characterHealt;

}
