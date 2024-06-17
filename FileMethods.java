import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileMethods{
    
    public void createDirectory(String path) {
        File directory = new File(path);
        if (!directory.exists()) {
            if (directory.mkdirs()) {
                System.out.println("Diretório criado: " + directory.getAbsolutePath());
            } else {
                System.out.println("Falha ao criar o diretório: " + path);
            }
        } else {
            System.out.println("O diretório já existe: " + directory.getAbsolutePath());
        }
    }

    public static void deleteDirectory(String path) {
        File directory = new File(path);
        if (directory.exists()) {
            if (directory.delete()) {
                System.out.println("Diretório apagado: " + path);
            } else {
                System.out.println("Falha ao apagar o diretório: " + path);
            }
        } else {
            System.out.println("O diretório não existe: " + path);
        }
    }

    public static void renameDirectory(String oldPath, String newPath) {
        File oldDirectory = new File(oldPath);
        File newDirectory = new File(newPath);
        if (oldDirectory.exists()) {
            if (oldDirectory.renameTo(newDirectory)) {
                System.out.println("Diretório renomeado de " + oldPath + " para " + newPath);
            } else {
                System.out.println("Falha ao renomear o diretório: " + oldPath);
            }
        } else {
            System.out.println("O diretório não existe: " + oldPath);
        }
    }

    public static void listFiles(String path) {
        File directory = new File(path);
        if (directory.exists() && directory.isDirectory()) {
            String[] files = directory.list();
            if (files != null) {
                for (String file : files) {
                    System.out.println(file);
                }
            } else {
                System.out.println("O diretório está vazio: " + path);
            }
        } else {
            System.out.println("O diretório não existe ou não é um diretório: " + path);
        }
    }

     public static void copyFile(String sourcePath, String destinationPath) {
        File sourceFile = new File(sourcePath);
        File destinationFile = new File(destinationPath);
        try {
            Files.copy(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Arquivo copiado de " + sourcePath + " para " + destinationPath);
        } catch (IOException e) {
            System.out.println("Erro ao copiar o arquivo: " + e.getMessage());
        }
    }

    public static void deleteFile(String path) {
        File file = new File(path);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("Arquivo apagado: " + path);
            } else {
                System.out.println("Falha ao apagar o arquivo: " + path);
            }
        } else {
            System.out.println("O arquivo não existe: " + path);
        }
    }

    public static void renameFile(String oldPath, String newPath) {
        File oldFile = new File(oldPath);
        File newFile = new File(newPath);
        if (oldFile.exists()) {
            if (oldFile.renameTo(newFile)) {
                System.out.println("Arquivo renomeado de " + oldPath + " para " + newPath);
            } else {
                System.out.println("Falha ao renomear o arquivo: " + oldPath);
            }
        } else {
            System.out.println("O arquivo não existe: " + oldPath);
        }
    }

     public void createFile(String path, String content) {
        File file = new File(path);
        try (FileWriter writer = new FileWriter(file)) {
            if (file.createNewFile()) {
                writer.write(content);
                System.out.println("Arquivo criado: " + file.getAbsolutePath());
            } else {
                System.out.println("O arquivo já existe: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo: " + e.getMessage());
        }
    }
}