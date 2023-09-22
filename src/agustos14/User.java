package agustos14;

import java.time.LocalDateTime;

public class User {
    // 1- Bir user(Kullanıcı) class oluşturun fields: name , registerDate(kayıtZamanı) (LocalDateTime cinsinden)
String name;
LocalDateTime registerTime;

    public User() { // p'siz cons. olusturuldu
    }

    public User(String name, LocalDateTime registerTime) {//p'li cons. olusturuldu
        this.name = name;
        this.registerTime = registerTime;
    }
}
