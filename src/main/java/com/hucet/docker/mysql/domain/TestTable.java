package com.hucet.docker.mysql.domain;

import javax.persistence.*;

@Entity
@Table(name = "test_table")
public class TestTable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    public TestTable(String name) {
        this.name = name;
    }
}
