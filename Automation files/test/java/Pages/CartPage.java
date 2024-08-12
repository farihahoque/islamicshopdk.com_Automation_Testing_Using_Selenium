package Pages;

import org.openqa.selenium.By;

public class CartPage extends BasePage{

    public By checkout=By.xpath("//a[normalize-space()='Checkout Now']");
    public By Name=By.xpath("//input[@id='billing_first_name']");
    public By Number=By.xpath("//input[@id='billing_phone']");
    public By AltNum=By.xpath("//input[@id='billing_altphone']");
    public By BillAddress=By.xpath("//input[@id='billing_address_1']");
    public By NextButton=By.xpath("//button[@id='wpmc-next']");
    public By CodDhaka=By.xpath("//label[contains(text(),'✪ ক্যাশ অন হোম ডেলিভারি চার্জ ( ঢাকা সিটির ভিতরে )')]");
    public By CodOutsideDhaka=By.xpath("//label[contains(text(),'✪ ক্যাশ অন হোম ডেলিভারি চার্জ ( ঢাকা সিটির বাহিরে ')]");
    public By next2=By.xpath("//button[@id='wpmc-next']");
    public By COD=By.xpath("//label[contains(text(),'ক্যাশ অন ডেলিভারি')]");
    public By Previous=By.xpath("//button[@id='wpmc-prev']");
    public By Bkash=By.xpath("//label[contains(text(),'বিকাশ (সেন্ড মানি)')]");
    public By bkashnum=By.xpath("//input[@id='bkash_number']");
    public By bkashtran=By.xpath("//input[@id='bkash_transaction_id']");
    public By nagad=By.xpath("//label[contains(text(),'নগদ (সেন্ড মানি)')]");
    public By nahadnum=By.xpath("//input[@id='nagad_number']");
    public By nagadtran=By.xpath("//input[@id='nagad_transaction_id']");
    public By placeorder=By.xpath("//button[@id='place_order']");
}
