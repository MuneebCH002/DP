/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proxypatterndemo;

/**
 *
 * @author User
 */
public class Proxypatterndemo {

    public static void main(String[] args) {
        Image image = new VirtualProxy("test_10mb.jpg");

        
        image.display();
        System.out.println("");
        image.display();
        
        Image unsupportedImage = new VirtualProxy("test_20mb.png");
       
        unsupportedImage.display(); //check the unsupported image
    }
}
