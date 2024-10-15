import java.io.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //write2File();
        readFromFile();

    }

    private static void readFromFile() {
        User user1 = null;
        User user2 = null;


        try {
            FileInputStream fileIn = new FileInputStream("myUsers.ser"); //resposible for reading from the file
            ObjectInputStream objectIn = new ObjectInputStream(fileIn); //Responsible for building the objects

            //read from file
            user1 = (User) objectIn.readObject();
            user2 = (User) objectIn.readObject();

            //close the streams
            fileIn.close();
            objectIn.close();
        } catch (Exception error) {
            System.out.println("Could not read :(");
        }

        user1.introduction();
        user2.introduction();


    }

    private static void write2File() {
        // Create the users we want to write to the file
        User liv = new User("Liv", "TassaIsCute", 38);
        User edvin = new User("Edvin", "Lösenord123", 23);

        try {
            FileOutputStream fileOut = new FileOutputStream("myUsers.ser"); //The stream writing to the file
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut); //The stream describing the object

            //write to the file
            objectOut.writeObject(liv);
            objectOut.writeObject(edvin);

            //Close the streams
            objectOut.close();
            fileOut.close();

            System.out.println("I have WRITTEN!");
        } catch (IOException error) {
            System.out.println("could not write to file");
        }
    }


}