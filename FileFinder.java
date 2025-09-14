import java.io.File;

class FileFinder {
    public static void main(String[] arg){
        FileFinder f= new FileFinder();

        File file = new File("C:\\Users\\CodeLine\\code_creators_git\\From_Manal");
        String fileName = "MixStart.txt";
        System.out.println( f.findFileByName(file, fileName));

    }


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