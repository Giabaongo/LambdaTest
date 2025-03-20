////package tests;
////import java.net.MalformedURLException;
////import java.net.URL;
////import java.time.Duration;
////import java.util.List;
////
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeOptions;
////import org.openqa.selenium.remote.RemoteWebDriver;
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.testng.Assert;
////import org.testng.annotations.AfterClass;
////import org.testng.annotations.BeforeClass;
////import org.testng.annotations.Test;
//
//package tests;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.time.Duration;
//import java.util.List;
//
//public class LambdaTestDemo {
//    String username = "giabaongo1"; // Thay bằng username của bạn
//    String accessKey = "LT_40cCzMGeaYw0L1qnS5jY1vd0u5GPcWagPobpcaGoH5cRB08"; // Thay bằng access key của bạn
//    WebDriver driver;
//
//    @BeforeClass
//    public void setUp() throws MalformedURLException {
//        ChromeOptions options = new ChromeOptions();
//        options.setPlatformName("Windows 10");
//        options.setBrowserVersion("latest");
//
//        String hubURL = "https://" + username + ":" + accessKey + "@hub.lambdatest.com/wd/hub";
//        driver = new RemoteWebDriver(new URL(hubURL), options);
//    }
//
////    @Test
////    public void testGoogleHomePage() {
////        driver.get("https://www.google.com");
////        String title = driver.getTitle();
////        System.out.println("Title: " + title);
////        Assert.assertTrue(title.contains("Google"));
////    }
////
////   @Test
////   public void testGoogleSearch() {
////       driver.get("https://www.google.com");
////       WebElement searchBox = driver.findElement(By.name("q"));
////       searchBox.sendKeys("Duynguyen");
////       searchBox.submit();
////
////       Assert.assertFalse(driver.getTitle().contains("LambdaTest"), "Tiêu đề không chứa 'LambdaTest'");
////   }
////
////    @Test
////    public void testGoogleSearchResults() {
////        driver.get("https://www.google.com");
////
////        // Tìm ô tìm kiếm và nhập từ khóa
////        WebElement searchBox = driver.findElement(By.name("q"));
////        searchBox.sendKeys("LambdaTest");
////        searchBox.submit();
////
////        // Đợi kết quả xuất hiện
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
////        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h3")));
////
////        // Lấy danh sách tất cả tiêu đề kết quả tìm kiếm
////        List<WebElement> searchResults = driver.findElements(By.cssSelector("h3"));
////
////        // Kiểm tra có ít nhất 1 kết quả
////        Assert.assertFalse(searchResults.isEmpty(), "Không tìm thấy kết quả nào!");
////
////        boolean found = false;
////        for (WebElement result : searchResults) {
////            String text = result.getText();
////            System.out.println("🔍 Kết quả: " + text);
////            if (text.toLowerCase().contains("lambdatest")) {
////                found = true;
////                break;
////            }
////        }
////
////        // Kiểm tra ít nhất một kết quả chứa "LambdaTest"
////        Assert.assertTrue(found, "Không tìm thấy kết quả nào có từ 'LambdaTest'!");
////    }
//
//    @Test
//    public void testSearchPlayToggleFullScreenAndReturnHome() throws InterruptedException {
//        // 1. Mở trang chủ YouTube
//        driver.get("https://www.youtube.com");
//
//        // 2. Tìm ô tìm kiếm và nhập từ khóa "LambdaTest tutorial", sau đó gửi phím ENTER
//        WebElement searchBox;
//        try {
//            searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("search_query")));
//        } catch (Exception e) {
//            // Nếu không tìm thấy theo name, thử theo css selector
//            searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#search")));
//        }
//        searchBox.click();
//        searchBox.sendKeys("LambdaTest tutorial");
//        searchBox.sendKeys(Keys.RETURN);
//
//        // 3. Đợi kết quả tìm kiếm xuất hiện và click vào video đầu tiên
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("video-title")));
//        List<WebElement> videoResults = driver.findElements(By.id("video-title"));
//        Assert.assertFalse(videoResults.isEmpty(), "❌ Không tìm thấy kết quả video!");
//        videoResults.get(0).click();
//        System.out.println("✅ Video đã bắt đầu phát!");
//
//        // 4. Chuyển sang chế độ toàn màn hình
//        WebElement fullScreenButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.ytp-fullscreen-button")));
//        fullScreenButton.click();
//        System.out.println("📺 Đã chuyển sang chế độ toàn màn hình!");
//        Thread.sleep(3000); // Chờ 3 giây ở chế độ toàn màn hình
//
//        // 5. Thoát khỏi chế độ toàn màn hình bằng phím ESC
//        driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
//        System.out.println("🔳 Đã thoát chế độ toàn màn hình!");
//        Thread.sleep(2000);
//
//        // 6. Quay lại trang chủ YouTube
//        driver.get("https://www.youtube.com");
//        System.out.println("🏠 Đã quay lại trang chủ YouTube!");
//    }
//
//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }
//}
//


package tests;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class LambdaTestDemo {
    String username = "giabaongo1"; // Thay bằng username của bạn
    String accessKey = "LT_40cCzMGeaYw0L1qnS5jY1vd0u5GPcWagPobpcaGoH5cRB08"; // Thay bằng access key của bạn
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        options.setPlatformName("Windows 10");
        options.setBrowserVersion("latest");

        String hubURL = "https://" + username + ":" + accessKey + "@hub.lambdatest.com/wd/hub";
        driver = new RemoteWebDriver(new URL(hubURL), options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @Test
    public void testSearchPlayToggleFullScreenAndReturnHome() throws InterruptedException {
        // 1. Mở trang chủ YouTube
        driver.get("https://www.youtube.com");

        // 2. Tìm ô tìm kiếm và nhập từ khóa "LambdaTest tutorial", sau đó gửi phím ENTER
        WebElement searchBox;
        try {
            searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("search_query")));
        } catch (Exception e) {
            // Nếu không tìm thấy theo name, thử theo css selector
            searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#search")));
        }
        searchBox.click();
        searchBox.sendKeys("LambdaTest tutorial");
        searchBox.sendKeys(Keys.RETURN);

        // 3. Đợi kết quả tìm kiếm xuất hiện và click vào video đầu tiên
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("video-title")));
        List<WebElement> videoResults = driver.findElements(By.id("video-title"));
        Assert.assertFalse(videoResults.isEmpty(), "❌ Không tìm thấy kết quả video!");
        videoResults.get(0).click();
        System.out.println("✅ Video đã bắt đầu phát!");

        // 4. Chuyển sang chế độ toàn màn hình
        WebElement fullScreenButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.ytp-fullscreen-button")));
        fullScreenButton.click();
        System.out.println("📺 Đã chuyển sang chế độ toàn màn hình!");
        Thread.sleep(3000); // Chờ 3 giây ở chế độ toàn màn hình

        // 5. Thoát khỏi chế độ toàn màn hình bằng phím ESC
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
        System.out.println("🔳 Đã thoát chế độ toàn màn hình!");
        Thread.sleep(2000);

        // 6. Quay lại trang chủ YouTube
        driver.get("https://www.youtube.com");
        System.out.println("🏠 Đã quay lại trang chủ YouTube!");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
