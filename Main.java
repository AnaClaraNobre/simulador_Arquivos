public class Main{
    public static void main(String[] args) {
        FileMethods fMethods = new FileMethods();

        // createDirectoryExample(fMethods);
        // deleteDirectoryExample(fMethods);
        // renameDirectoryExample(fMethods);
        // listFilesExample(fMethods);
        // createFileExample(fMethods);
        // deleteFileExample(fMethods);
        // renameFileExample(fMethods);
        //copyFileExample(fMethods)
    }


    private static void createDirectoryExample(FileMethods fsSimulator) {
        fsSimulator.createDirectory("testDiretoryTwo");
    }

    private static void renameDirectoryExample(FileMethods fsSimulator) {
        fsSimulator.renameDirectory("testDir", "testDirirory");
    }

    private static void deleteDirectoryExample(FileMethods fsSimulator) {
        fsSimulator.deleteDirectory("testDiretoryTwo");
    }

    private static void copyFileExample(FileMethods fsSimulator) {
        fsSimulator.copyFile("source.txt", "testDir/destination.txt");
    }
    
    private static void listFilesExample(FileMethods fsSimulator) {
        fsSimulator.listFiles("testDiretório");
    }

    private static void renameFileExample(FileMethods fsSimulator) {
        fsSimulator.renameFile("testDir/destination.txt", "testDir/renamedDestination.txt");
    }

    private static void deleteFileExample(FileMethods fsSimulator) {
        fsSimulator.deleteFile("testDir/renamedDestination.txt");
    }

    private static void createFileExample(FileMethods fsSimulator) {
        String filePath = "testDir/sample.txt";
        String content = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        fsSimulator.createFile(filePath, content);
    }
}