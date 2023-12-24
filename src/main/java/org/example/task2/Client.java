package org.example.task2;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class Client {
    private int Id;
    private String Name;
    private int Age;
    private Gender clientSex;
    private String Email;

    public static int counterId = 0;


    public Client(String clientName, int clientAge, Gender clientSex, String clientEmail) {
        this.Name = clientName;
        this.Age = clientAge;
        this.clientSex = clientSex;
        this.Email = clientEmail;

        Id = ++counterId;
    }
}