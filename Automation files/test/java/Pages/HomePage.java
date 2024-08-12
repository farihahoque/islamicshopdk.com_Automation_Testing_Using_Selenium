package Pages;

import org.openqa.selenium.By;

import static Pages.BasePage.loadAWebPage;

public class HomePage extends BasePage{
    public static String homepageUrl = "https://islamicshopdk.com/";

    public By Myaccount=By.xpath("//a[contains(text(),'একাউন্ট')]");
    public By freeBOOK=By.xpath("//a[contains(text(),'\uD83D\uDD0E ফ্রী ডেলিভারির বইগুলো')]");
    public By nobijiboni=By.xpath("//a[contains(text(),'\uD83D\uDD0E নবী-রাসূল ও সাহাবীদের জীবনী')]");
    public By islamibook=By.xpath("//a[@href='https://islamicshopdk.com/product/book/islame-nari/']");
    public By Selfpurification=By.xpath("//a[contains(text(),'\uD83D\uDD0E আত্মশুদ্ধি ও অনুপ্রেরণা')]");
    public By GeneralBook=By.xpath("//a[contains(text(),'জেনারেল বই')]");
    public By Cart= By.xpath("//div[contains(@class,'has-logo')]//div[contains(@class,'header-cart')]//a//*[name()='svg']");
    public By book1Addcart=By.xpath("//a[@aria-label='Add to cart: “মহিমান্বিত কুরআন (সিয়ান)”']//span[@class='add-to-cart-text loop_button-text'][contains(text(),'কার্টে যুক্ত করুন')]");
    public By book2Addcart=By.xpath("//a[@aria-label='Add to cart: “হিসনুল মুসলিম- যিকর, দো‘আ, চিকিৎসা”']");
    public By book1title= new By.ByCssSelector("img[title='স্পেশাল ডিসকাউন্ট পেজ । ইসলামিক বই কিনুন সবচেয়ে কমদামে 2']");
    public By book2title= new By.ByCssSelector("body > div:nth-child(1) > div:nth-child(3) > article:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(4) > div:nth-child(1) > div:nth-child(2) > span:nth-child(3) > ins:nth-child(2) > span:nth-child(1) > bdi:nth-child(1)");
    public static void loadHomePage(){

        loadAWebPage(homepageUrl);
    }
}
