package adapter;

public class JpgShower implements AdvancedImageViewer{
    @Override
    public void showPng(String fileName) {

    }

    @Override
    public void showJpg(String fileName) {
        System.out.println("Image type jpg " + "and Image name " + fileName);
    }
}
