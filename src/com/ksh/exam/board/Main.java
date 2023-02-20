package com.ksh.exam.board;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Article article = new Article();
    article.title = "";
    article.body = "";
    article.id  = 0;

    System.out.println("== 게시판 v 0.1 ==");
    System.out.println("== 프로그램 시작 ==");

    int articleLastId = 0;

    while (true){
      System.out.printf("명령) ");
      String cmd = scanner.nextLine();

      if (cmd.equals("/usr/article/write")){
        System.out.println("== 게시물 등록 ==");
        System.out.printf("제목 : ");
        article.title = scanner.nextLine();
        System.out.printf("내용 : ");
        article.body = scanner.nextLine();
        article.id = articleLastId + 1;
        articleLastId++;

        System.out.println("생성 된 게시물 객체 : " + article);

        System.out.printf("%d번 게시물이 등록되었습니다.\n", article.id);
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

class Article {
  String title;
  String body;
  int id;

  @Override
  public String toString() {
    return String.format("{id: %d, title: %s, body: %s}", id, title, body);
  }
}