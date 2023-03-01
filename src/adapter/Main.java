package adapter;

public class Main {
    public static void main(String[] args) {

        GalleryApp gallery = new GalleryApp();

        gallery.show("jpeg", "naruto.jpeg");
        gallery.show("png", "sasuke.png");
        gallery.show("jpg", "jiraya.jpg");
        gallery.show("gif", "sakura.gif");
    }
}
