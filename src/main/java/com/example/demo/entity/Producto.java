package com.example.demo.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(value = "producto")
@Getter
@Setter
@NoArgsConstructor
public class Producto {

    //@MongoId(FieldType.OBJECT_ID)
    @Id
    private String id;
    private String nombre;
    private float precio;
    private int stock;

    }
