/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxypatterndemo;

/**
 *
 * @author User
 */
public class VirtualProxy implements Image {//rename the proxy the virtual prxy 
    private realimage realImage;
    private String fileName;

    public VirtualProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            if (isSupported(fileName)) {
                realImage = new realimage(fileName);
            } else {
                fakeDisplay(fileName);
            }
        }
        if (realImage != null) {
            realImage.display();
        }
    }

    private boolean isSupported(String fileName) {
        return fileName.toLowerCase().endsWith(".jpg");
    }

    private void fakeDisplay(String fileName) {//add another fake display method
        System.out.println("Displaying fake content for unsupported image: " + fileName);
    }
}
