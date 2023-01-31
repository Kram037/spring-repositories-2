package co.develhope.springrepositories2.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;

    @Column(nullable = false)
    private String name;

    @Column
    private LocalDate firstAppearance;

    @Column(nullable = false)
    private String inventor;



}