package com.mt4e.dev.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.*;


@NoArgsConstructor
@ToString @EqualsAndHashCode
@Entity
@Getter @Setter
public class User {

  @Id
  @GeneratedValue
  private int id;

  private @NotNull String name;
}
