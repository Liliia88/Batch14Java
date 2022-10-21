package class23Abstract;

public interface HW2Interface_WebDriver {
    /*Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(),
    closeBrowser(), maximizeWindow(), findElement().
    Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.*/
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}

class FirefoxDriver implements HW2Interface_WebDriver{

     @Override
     public void openBrowser() {
         System.out.println("Open Firefox website");
     }

     @Override
     public void closeBrowser() {
         System.out.println("Close Firefox website");
     }

     @Override
     public void maximizeWindow() {
         System.out.println("Maximize Firefox website by clicking left button");
     }

     @Override
     public void findElement() {
         System.out.println("Hover mouse to element in Firefox website amd click on it");
     }
 }

class ChromeDriver implements HW2Interface_WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Open Chrome website");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Chrome website");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Chrome website by clicking left button");
    }

    @Override
    public void findElement() {
        System.out.println("Hover mouse to element in Chrome website amd click on it");
    }
}

class testerWebDriver{
     public static void main(String[] args) {
         HW2Interface_WebDriver[] webdriver={new ChromeDriver(), new FirefoxDriver()};
         for(HW2Interface_WebDriver web:webdriver){
             web.openBrowser();
             web.closeBrowser();
             web.maximizeWindow();
             web.findElement();
         }
     }
 }
 /*
 interfce: eto ne class, a declaracia podderjki opredelennoi funcionalnosti classom kotorii implementiruet
 etot interface (tot kto menya implementiruet должен podderjivat functionality).
(primer: transport: dopustim est dve funcii, a v klasse ti raskrivaesh ih), ti doljna raskrit vse funcii.

a abstractnii class eto obichnii class, no on ne podderjivaet cozdanie objectov, podderjivaet funcionalnost kotoraya
otnositsya k gruppe objectov.
 (primer: transport, mojet exat, no net ponimania chto eto takoe exat, a est rebenok mashina -
ytochnyet chto takoe ekhat).
*/
