package Component;

import javafx.scene.control.Label;

public class Tovar extends Label { // наш класс, в котором есть
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
        return "Имя товара ("+name+") - его цена: "+price;// вернеуть сторчку цены и имени
    }
}
