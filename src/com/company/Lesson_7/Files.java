package com.company.Lesson_7;

import java.io.File;
import java.io.IOException;

public class Files {
    public static void main(String[] args) throws IOException {
        File folder = new File("C:/Users/Lenovo/Downloads/TMS_tasks_Anna/src/com/folder");
        File censorship = new File("C:/Users/Lenovo/Downloads/TMS_tasks_Anna/src/com/list");
        File formatter = new File("C:/Users/Lenovo/Downloads/TMS_tasks_Anna/src/com/formatter");
        if (!folder.exists()) {
            folder.mkdir();
        }
        if (!censorship.exists()){
            censorship.mkdir();
        }

        if (!formatter.exists()){
            formatter.mkdir();
        }
        // определяем объекты для каталога
        File firstFile = new File("C:/Users/Lenovo/Downloads/TMS_tasks_Anna/src/com/directory/firstFile.txt");
        File secondFile = new File("C:/Users/Lenovo/Downloads/TMS_tasks_Anna/src/com/directory/copiedFile.txt");

        File newFile = new File("C:/Users/Lenovo/Downloads/TMS_tasks_Anna/src/com/folder/readFile.txt");
        File anotherFile = new File("C:/Users/Lenovo/Downloads/TMS_tasks_Anna/src/com/folder/writeFile.txt");

        File blacklist = new File("C:/Users/Lenovo/Downloads/TMS_tasks_Anna/src/com/list/blackList.txt");
        File text = new File("C:/Users/Lenovo/Downloads/TMS_tasks_Anna/src/com/list/text.txt");

        File format = new File("C:/Users/Lenovo/Downloads/TMS_tasks_Anna/src/com/formatter/formatFile.txt");
        File writeformat = new File("C:/Users/Lenovo/Downloads/TMS_tasks_Anna/src/com/formatter/writeFormat.txt");

        newFile.createNewFile();
        anotherFile.createNewFile();

        firstFile.createNewFile();
        secondFile.createNewFile();

        blacklist.createNewFile();
        text.createNewFile();

        format.createNewFile();
        writeformat.createNewFile();
        }
    }
