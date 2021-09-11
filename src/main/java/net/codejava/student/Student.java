package net.codejava.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String address;

    protected Student() {
    }

    protected Student(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    // геттеры и сеттеры не показаны для краткости. Создайте их с помощью средств своей IDE, или вручную.

}
