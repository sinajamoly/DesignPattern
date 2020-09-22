import Composition.*;
import Decorator.BaseNotifier;
import Decorator.FacebookNotifier;
import Decorator.InstagramNotifier;
import Decorator.Notify;

public class Main {
    public static void main(String[] args) {

//    Composition
//        Menu mainMenu = new Menu("Main", "main");
//
//        Menu aboutMenu = new Menu("about", "about");
//        MenuItem aboutUsMenu = new MenuItem("about us", "aboutus");
//        MenuItem headerMenu = new MenuItem("header", "header");
//        MenuItem footerMenu = new MenuItem("footer", "footer");
//        MenuItem aboutYouMenu = new MenuItem("about you", "aboutyou");
//        MenuItem aboutAboutYouMenu = new MenuItem("about about you", "aboutaboutyou");
//        MenuItem aboutMeMenu = new MenuItem("about me", "aboutme");
//
//        aboutMenu.add(aboutMeMenu);
//        aboutMenu.add(aboutUsMenu);
//        aboutMenu.add(aboutYouMenu);
//        aboutYouMenu.add(aboutAboutYouMenu);
//        mainMenu.add(headerMenu);
//        mainMenu.add(aboutMenu);
//        mainMenu.add(footerMenu);
//
//        String st = mainMenu.toString();
//
//        System.out.println(st);

//        Decorator
        Notify baseNofier = new BaseNotifier();
        Notify facebookNotifier = new FacebookNotifier(baseNofier);
        Notify instagramNotifier = new InstagramNotifier(facebookNotifier);

        instagramNotifier.send();
    }
}
