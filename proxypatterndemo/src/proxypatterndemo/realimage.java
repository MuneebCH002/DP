/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxypatterndemo;

/**
 *
 * @author User
 */public class realimage implements Image {
    private String fileName;

    public realimage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
        // Load image from disk logic here
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
        // Display image logic here
    }
}
