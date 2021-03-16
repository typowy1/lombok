package pl.javastart.lombok;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(of = "id") //bedzie działać tylko dla id, odpowiednik metod
@ToString(of = {"firstName", "lastName"}) //{} jako tablica,
//@ToString(exclude = "id") //wszystko ptocz id ma byc wyswietlane
//@Data zawiera wszystkie powyższe ale jest problem przy encja i zapętleniu w nieskonczonosc, nie stosowac przy encjach do transferu danych do trzymania danych
@AllArgsConstructor //wszystkie pola nalezą do konstruktora
@NoArgsConstructor //konstruktor bez argumentow
@Builder // tworzenie obiektu
public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private int age;

}
