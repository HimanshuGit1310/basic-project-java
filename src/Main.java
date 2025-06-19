import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String filePath = "src\\For Granted - Dyalla.wav";
        File file = new File(filePath);

        try(AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file)) {

            Scanner scanner = new Scanner(System.in);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            System.out.println("clip is running");

            String response = "";

            while(!response.equals("Q")) {

                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter Your Choice : ");
                response = scanner.next().toUpperCase();

                switch(response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid Choice");
                }

            }

        }


        catch (IOException e) {
            System.out.println("Could not locate the file");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("File does not supported");
        }
        catch (LineUnavailableException e) {
            System.out.println("resource not found");
        }
        finally {
            System.out.println("You have Exited");
        }
    }
}


