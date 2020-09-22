import Composition.*;

public class Main {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main", "main");

        Menu aboutMenu = new Menu("about", "about");
        MenuItem aboutUsMenu = new MenuItem("about us", "aboutus");
        MenuItem headerMenu = new MenuItem("header", "header");
        MenuItem footerMenu = new MenuItem("footer", "footer");
        MenuItem aboutYouMenu = new MenuItem("about you", "aboutyou");
        MenuItem aboutAboutYouMenu = new MenuItem("about about you", "aboutaboutyou");
        MenuItem aboutMeMenu = new MenuItem("about me", "aboutme");

        aboutMenu.add(aboutMeMenu);
        aboutMenu.add(aboutUsMenu);
        aboutMenu.add(aboutYouMenu);
        aboutYouMenu.add(aboutAboutYouMenu);
        mainMenu.add(headerMenu);
        mainMenu.add(aboutMenu);
        mainMenu.add(footerMenu);

        String st = mainMenu.toString();

        System.out.println(st);
    }
}
