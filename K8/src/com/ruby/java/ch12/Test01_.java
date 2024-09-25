package com.ruby.java.ch12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test01_ {
   public static void main(String[] args) {
      // 파일 이름을 매개변수로 받아서 복사하는 메서드 호출
      if (args.length != 2) {
         System.out.println("Usage: java ArgsTest <source file> <destination file>");
         return;
      }
      System.out.println(args[0] + " " + args[1]);
      
      

      String sourceFile = args[0];
      String destFile = args[1];

      long start = System.currentTimeMillis();
      copyFile(args[0], args[1]);
      System.out.println("copyFile : " + (System.currentTimeMillis()-start));
      
      start = System.currentTimeMillis();
      copyFile1(args[0], args[1]);
      System.out.println("copyFile1 : " + (System.currentTimeMillis()-start));
   }

   // BufferedInputStream, BufferedOutputStream 사용
   private static void copyFile(String sourceFile, String destFile) {
      try (BufferedInputStream fi = new BufferedInputStream(new FileInputStream(sourceFile));
           BufferedOutputStream fo = new BufferedOutputStream(new FileOutputStream(destFile))) {

         int c;
         while ((c = fi.read()) != -1) {
            fo.write(c);
         }
         System.out.println("File copied successfully with buffering!");

      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   // 일반 FileInputStream, FileOutputStream 사용
   private static void copyFile1(String sourceFile, String destFile) {
      try (FileInputStream fe = new FileInputStream(sourceFile);
           FileOutputStream fo = new FileOutputStream(destFile)) {

         int c;
         while ((c = fe.read()) != -1) {
            fo.write(c);
         }
         System.out.println("File copied successfully without buffering!");

      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
