package com.dzw.pojo;


import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class Boss {

    private String name;

    private String company;

    private String hobby;

    private Car car;



}
