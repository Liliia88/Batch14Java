package class22Polymorphism;

public class WebDriverTesting {
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


        WebDriverPolymorphism[] browsers={new Chrome(),new Safari(),new FireFox()};
        for (WebDriverPolymorphism browser:browsers) {
            browser.startBrowser();
            browser.test();
            browser.closeBrowser();
        }
        for(int i=0;i<browsers.length;i++){
            browsers[i].startBrowser();
            browsers[i].test();
            browsers[i].closeBrowser();
        }



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

