package Class22;

public class WebDriverTester {

    public static void main(String[] args) {

   /*     Safari safari=new Safari();
        safari.startBrowser();
        safari.test();
        safari.closeBrowser();
        Chrome chrome=new Chrome();
        chrome.startBrowser();
        chrome.test();
        chrome.closeBrowser();
        FireFox fireFox=new FireFox();
        fireFox.startBrowser();
        fireFox.test();
        fireFox.closeBrowser();*/

        //instead of long code above, with polimorphism we can use the code below, shorter and cleaner

        WebDriver[] browsers={new Chrome(),new Safari(),new FireFox()};
        for (WebDriver browser:browsers
        ) {
            browser.startBrowser();
            browser.test();
            browser.closeBrowser();
        }
        //for loop
        //for(int i=0;i<browser.length; i++){
        // browser.startBrowser();
        // browser.test();
        // browser.closeBrowser();
        //     }

          /* Chrome chrome=new Chrome();
        FireFox fireFox=new FireFox();
        Safari safari=new Safari();
        WebDriver[] browsers={chrome,fireFox,safari};
        */
        /*
        Creating objects of all Child classes and storing them in an array of
        type Webdriver we can do this bcause upcasting allows us to do this
         */
    }

}
