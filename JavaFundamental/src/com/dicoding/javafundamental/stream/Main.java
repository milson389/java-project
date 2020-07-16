package com.dicoding.javafundamental.stream;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("D://latihan_input.txt");
            out = new FileOutputStream("latihan_output.txt");
            int c;

            while (( c = in.read()) != -1){
                out.write(c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileReader in1 = null;
        FileWriter out1 = null;
        try {
            in1 = new FileReader("D://latihan_input.txt");
            out1 = new FileWriter("latihan_ouput1.txt");
            int c;
            while ((c = in1.read()) != -1) {
                out1.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in1 != null) {
                    in1.close();
                }
                if (out1 != null) {
                    out1.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String dirname = "/java/latihan1";
        File file = new File(dirname);
        // Buat directory
        file.mkdirs();
    }
}
