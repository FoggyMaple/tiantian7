package demo59Movie;

public class MovieOperator {
    private Movie[] movies;
    public MovieOperator(Movie[] movies){
        this.movies = movies;
    }

    public void printAllMovies(){
        System.out.println("系统全部电影信息如下：");
        System.out.println("=====================");
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println("编号：" + m.getId());
            System.out.println("名称：" + m.getName());
            System.out.println("价格：" + m.getPrice());
            System.out.println("演员：" + m.getActor());
            System.out.println("=======================");
        }
    }

    public void searchMoviesById(int id){
        for (int i = 0; i < movies.length; i++) {
            if(movies[i].getId() == id){
                System.out.println("该电影详情如下：");
                System.out.println("=======================");
                System.out.println("编号：" + movies[i].getId());
                System.out.println("名称：" + movies[i].getName());
                System.out.println("价格：" + movies[i].getPrice());
                System.out.println("演员：" + movies[i].getActor());
                System.out.println("得分：" + movies[i].getScore());
                System.out.println("导演：" + movies[i].getDirector());
                System.out.println("其他：" + movies[i].getInfo());
                System.out.println("=======================");
                return;
            }
        }
        System.out.println("未查询到ID为" + id + "的电影信息。");
    }
}
