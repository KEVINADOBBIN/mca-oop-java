import java.io.*;

class CopyFile {
    public static void main(String[] args) throws IOException {

        int ch; 
        if (args.length < 2) { 
            System.out.println("KEVIN A DOBBIN\n"); 
            System.out.println("Inadequate Arguments");
            return;
        }

        String fname1 = args[0]; // corrected variable name
        String fname2 = args[1];

        FileInputStream fr = new FileInputStream(fname1);
        FileOutputStream fw = new FileOutputStream(fname2);

        System.out.println("Copying File: " + fname1 + " To " + fname2);

        try {
            while (fr.available() > 0) {
                ch = fr.read();
                fw.write(ch);
            }
        } catch (IOException e) {
            System.out.println("Error in file handling: " + e);
        } finally {
            fr.close();
            fw.close();
        }

        System.out.println("Successfully Copied: " + fname1 + " to " + fname2);
    }
}
