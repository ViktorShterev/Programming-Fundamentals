package ObjectsAndClasses.Exercise;

import java.util.Scanner;

public class Articles {
    static class Article {
        private String title;
        private String content;
        private String author;

        public Article (String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }
        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return this.content;
        }

        public String getAuthor() {
            return this.author;
        }

        public String getTitle() {
            return this.title;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String title = input.split(", ")[0];
        String content = input.split(", ")[1];
        String author = input.split(", ")[2];

        int n = Integer.parseInt(scanner.nextLine());

        Article article = new Article(title, content, author);

        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();

            if (command.startsWith("Edit")) {
                String newContent = command.split(": ")[1];
                article.setContent(newContent);
            } else if (command.startsWith("ChangeAuthor")) {
                String newAuthor = command.split(": ")[1];
                article.setAuthor(newAuthor);
            } else if (command.startsWith("Rename")) {
                String newTitle = command.split(": ")[1];
                article.setTitle(newTitle);
            }
        }
            System.out.printf("%s - %s: %s", article.getTitle(), article.getContent(), article.getAuthor());
    }
}
