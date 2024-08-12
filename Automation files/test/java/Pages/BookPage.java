package Pages;

import org.openqa.selenium.By;

public class BookPage extends BasePage{
    public By clickBook=By.xpath("//img[@alt='বক্তৃতা দিতে শিখুন']");
    public By clickbook2=By.xpath("//img[@title='স্পেশাল ডিসকাউন্ট পেজ । ইসলামিক বই কিনুন সবচেয়ে কমদামে 2']");
    public By clickorder=By.xpath("//button[contains(text(),'অর্ডার করুন')]");
    public By AddToCart= By.xpath("//button[contains(text(),'কার্টে যুক্ত করুন')]");
    public By AddProducct= new By.ByCssSelector("span[class='razzi-svg-icon razzi-qty-button increase'] svg");
   public By hovertobook=By.xpath("//a[contains(@class,'woocommerce-LoopProduct-link woocommerce-loop-product__link')][normalize-space()='']");

}
