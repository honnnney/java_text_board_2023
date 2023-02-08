package com.ksh.exam.board;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("== 게시판 v 0.1 ==");
    System.out.println("== 프로그램 시작 ==");

    int count = 0;

    while (true){
      System.out.printf("명령) ");
      String cmd = scanner.nextLine();

      count++;

      if (cmd.equals("/usr/article/write")){
        System.out.println("게시물 등록");
        System.out.printf("제목 : ");
        String title = scanner.nextLine();
        System.out.printf("내용 : ");
        String body = scanner.nextLine();
        //System.out.printf("제목 : %s\n", title);
        //System.out.printf("내용 : %s\n", detail);
        System.out.printf("%d번 게시물이 등록되었습니다.\n", count);
      }

      else if (cmd.equals("exit")){
        break;
      }

      else {
        System.out.printf("입력된 명령어 : %s\n", cmd);
      }
    }

    System.out.println("== 프로그램 종료 ==");
    scanner.close();
  }
}