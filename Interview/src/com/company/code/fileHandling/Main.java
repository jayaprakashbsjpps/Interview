package com.jayaprakash.fileHandling;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//        try(InputStreamReader isr = new InputStreamReader(System.in)) {
//            System.out.print("Enter some letters");
//            int letters=isr.read();
//            while(isr.ready()) {
//                System.out.println((char)letters);
//                letters=isr.read();
//            }
//
//            isr.close();
//            System.out.println("Enter some letters");
//
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//         try (FileReader fileReader = new FileReader("note1.txt")) {
//
//             int letters=fileReader.read();
//             while (fileReader.ready()) {
//                 System.out.println((char) letters);
//                 letters = fileReader.read();
//             }
//         } catch (FileNotFoundException e) {
//             throw new RuntimeException(e);
//         } catch (IOException e) {
//             throw new RuntimeException(e);
//         }



//         try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//
//             System.out.println("You typed "+br.readLine());
//
//         } catch (IOException e) {
//             System.out.println(e.getMessage());
//         }

//           try(OutputStreamWriter osw=new OutputStreamWriter(System.out)){
//                osw.write("I am Jayaprakash");
//                osw.write(97);
//                osw.write(10);
//               osw.write('A');
//               osw.write('\n');
//               char[] arr ="helloworld".toCharArray();
//               osw.write(arr);
//              // osw.write(😁);
//           }catch (IOException e) {
//               System.out.println(e.getMessage());
//           }

//            try {
//                File fo = new File("note1.txt");
//                fo.createNewFile();
//            } catch (IOException e) {
//                System.out.println(e.getMessage());
//
//            }

//            try {
//                FileWriter fo = new FileWriter("note1.txt",true);
//                fo.append("I am not happy");
//                fo.close();
//            } catch (IOException e) {
//                System.out.println(e.getMessage());
//
//            }

//            try {
//                //FileReader fr = new FileReader("note1.txt");
//                Scanner scanner = new Scanner(new File("note1.txt"));
//                while(scanner.hasNext()) {
//                    System.out.println(scanner.next());
//                }
//            } catch (IOException e) {
//                System.out.println(e.getMessage());
//
//            }

        try {
            File fo = new File("random1.txt");
            fo.createNewFile();
            if(fo.delete()) {
                System.out.println(fo.getName());
            }

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }




    }
}
