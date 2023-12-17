package homework;

public class Client {

    private String name;
    private Date birthDate;
    private Date cardIssuedDate;

    public Client(String name, Date birthDate, Date cardIssuedDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.cardIssuedDate = cardIssuedDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getCardIssuedDate() {
        return cardIssuedDate;
    }

    public void setCardIssuedDate(Date cardIssuedDate) {
        this.cardIssuedDate = cardIssuedDate;
    }
}



