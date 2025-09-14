import java.io.File;

class FileFinder {
    public static void main(String[] arg){
        FileFinder f= new FileFinder();

        File file = new File("C:\\Users\\CodeLine\\code_creators_git\\From_Manal");
        String fileName = "MixStart.txt";
        System.out.println( f.findFileByName(file, fileName));



    }


    /**
     * TO-DO: Change this method to be recursive.
     \*
     * This method searches for a file with a specific name within a directory
     * and its subdirectories. The current implementation uses a Queue for an
     * iterative, breadth-first search.
     \*
     * @param rootDir The directory to start the search from.
     * @param fileName The name of the file to find.
     * @return The File object if found, otherwise null.
     */
    public File findFileByName(File rootDir, String fileName) {


        if (!rootDir.isDirectory()) {
            return null;
        }

            File[] files = rootDir.listFiles();
                for (File file : files) {
                    if (file.isFile() && file.getName().equalsIgnoreCase(fileName)) {
                        return file;
                    } else if (file.isDirectory()) {
                        return findFileByName(file, fileName);
                    }
                }
        return null;
    }
}