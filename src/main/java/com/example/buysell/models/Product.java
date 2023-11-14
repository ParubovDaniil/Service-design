package com.example.buysell.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity //указываем на то что класс является тем классом,который эмулирует таблицу из базы данных
@Table(name = "products") //название таблицы
@Data
@AllArgsConstructor//ЧТо бы был конструктор со всеми полями которые присутствуют
@NoArgsConstructor //
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description",columnDefinition = "text")//для того что бы колонка не была типа varchar а была типа text
    private String description;
    @Column(name = "price")
    private int price;
    @Column(name = "city")
    private String city;
    @Column(name = "author")
    private String author;
}
