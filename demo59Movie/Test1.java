package demo59Movie;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Movie[] movies = new Movie[4];
        movies[0] = new Movie(1 , "喜剧之王" , 55 , 4.9 , "周星驰" , "周星驰、张柏芝" , "讲述了一段演技炸裂的故事。");
        movies[1] = new Movie(2 , "功夫足球" , 52 , 4.8 , "周星驰" , "周星驰、赵薇" , "讲述了一段踢足球的故事。");
        movies[2] = new Movie(3 , "审死官" , 30 , 4.9 , "周星驰" , "周星驰、梅艳芳" , "讲述了一段官官相护却被宋世杰击破的故事。");
        movies[3] = new Movie(4 , "功夫" , 50 , 5.0 , "周星驰" , "周星驰、林子冲" , "讲述了一段功夫的故事。");

        Scanner sc = new Scanner(System.in);

//        movies[0].setPrice(100);
//        System.out.println(movies[3].getActor());

        while (true) {
            System.out.println("电影系统");
            System.out.println("1、展示所有电影信息");
            System.out.println("2、根据ID查找电影信息");
            System.out.println("3、退出");
            int temp = sc.nextInt();
            MovieOperator operator = new MovieOperator(movies);
            switch (temp){
                case 1:
                    operator.printAllMovies();
                    break;
                case 2:
                    System.out.println("请输入要查找的电影ID：");
                    operator.searchMoviesById(sc.nextInt());
                    break;
                case 3:
                    return;
                default:
                    System.out.println("您的输入有误，请重新输入！");
            }
        }
    }
}
