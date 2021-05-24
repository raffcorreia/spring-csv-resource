package com.raffcorreia.springcsvresource.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BandMember {
    Integer id;
    String name;
    String role;
    Integer birthYear;
}
