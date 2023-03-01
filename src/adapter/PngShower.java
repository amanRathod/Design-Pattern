package adapter;

public class PngShower implements AdvancedImageViewer{
    @Override
    public void showPng(String fileName) {
        System.out.println("Image type png " + "and Image name " + fileName);
    }

    @Override
    public void showJpg(String fileName) {

    }
}
