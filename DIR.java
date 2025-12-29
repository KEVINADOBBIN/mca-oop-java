import java.io.File;

class DIR {

    // Recursive method to print files and subdirectories
    static void print(File[] arr, int level) {
        if (arr == null || arr.length == 0)
            return;

        for (File f : arr) {
            for (int i = 0; i < level; i++)
                System.out.print("\t"); // Indent based on level

            if (f.isFile()) {
                System.out.println(f.getName());
            } else if (f.isDirectory()) {
                System.out.println("DIR: " + f.getName());
                print(f.listFiles(), level + 1); // Recursive call for subdirectory
            }
        }
    }

    public static void main(String[] args) {

        String path = "D:\\kevin java"; // Change to your directory path
        File dir = new File(path);

        if (dir.exists() && dir.isDirectory()) {
            File[] arr = dir.listFiles();
            System.out.println("**********");
            System.out.println("Files from directory: " + path);
            System.out.println("**********");
            print(arr, 0);
        } else {
            System.out.println("Directory does not exist: " + path);
        }
    }
}
