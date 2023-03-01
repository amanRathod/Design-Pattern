package adapter;

public class GalleryApp implements ImageViewer{

    ImageAdapter imageAdapter;
    @Override
    public void show(String imageFormat, String fileName) {
        //inbuilt support to show jpeg image files
        if(imageFormat.equalsIgnoreCase("jpeg")){
            System.out.println("Showing jpeg file. Name: " + fileName);
        }
        //imageAdapter is providing support to show other file formats
        else if(imageFormat.equalsIgnoreCase("png") || imageFormat.equalsIgnoreCase("jpg")){
            imageAdapter = new ImageAdapter(imageFormat);
            imageAdapter.show(imageFormat, fileName);
        }
        else{
            System.out.println("Invalid image. " + imageFormat + " format not supported");
        }
    }
}
