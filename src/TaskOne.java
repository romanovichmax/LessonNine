import java.nio.file.*;
public class TaskOne {
    public static void main(String[] args) {

        //Creating the Path object using the static method get() of Paths class;
        Path testFilePath = Paths.get("/home/Max/TaskOne.txt");

        //Info about the file;
        System.out.println("Printing file information: ");
        System.out.println("\t file name: " + testFilePath.getFileName());
        System.out.println("\t root of the path: " + testFilePath.getRoot());
        System.out.println("\t parent of the target: " + testFilePath.getParent());

        //Return the path elements;
        System.out.println("Printing elements of the path: ");
        for (Path element : testFilePath) {
            System.out.println("\t path element: " + element);
        }
    }
}
