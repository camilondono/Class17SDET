package Class21;

public class Browser {

    void openBrowser(){
        System.out.println("Opening a Browser");
    }
    void navigate(){
        System.out.println("Opening the URL");
    }
    void test(){
        System.out.println("Testing the webpage");
    }
    void closeBrowser(){
        System.out.println("Closing the Browser");
    }

}
class Chrome extends Browser{

    void closeBrowser() {
        super.closeBrowser();
    }

    void openBrowser(){
        System.out.println("Opening the Browser in less than one second");
    }

}
class FireFox extends Browser{

    void closeBrowser() {
        super.closeBrowser();
    }

    void openBrowser() {
        System.out.println("Opening the Browser in less than two second");
    }
}