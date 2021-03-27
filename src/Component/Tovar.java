package Component;

public class Tovar { // наш класс, в котором есть
    //----------------------------------------------------------- переменные
    private String name; // имя
    private String price; // и цена

    //------------------------------------------------------------ действия
    public void setName(String name) {
        this.name = name;
    } //ввод имени
    public void setPrice(String price) {
        this.price = price;
    } //ввод цены

    @Override
    public String toString() {
        return name+" "+price;
    } // вернеуть сторчку цены и имени
}
