package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Navigation_Menu {
	
	
	WebDriver driver;
	
	public Amazon_Navigation_Menu(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id=\"nav-hamburger-menu\"]/i")
	public WebElement mouse_hover_all_menu;
	
	@FindBy(xpath="//*[@id=\"nav-hamburger-menu\"]/i")
	public WebElement All_Drop_Down_Menu;
	
	@FindBy(xpath="//b[normalize-space()='Hello, sign in']")
	public WebElement Hello_Sign_in;
	
	@FindBy(xpath="//div[normalize-space()='trending']")
	public WebElement trending;
	
	@FindBy(xpath="//ul[@class='hmenu hmenu-visible']//a[@class='hmenu-item'][normalize-space()='Best Sellers']")
	public WebElement Best_Sellers;
	
	@FindBy(xpath="//ul[@class='hmenu hmenu-visible']//a[@class='hmenu-item'][normalize-space()='New Releases']")
	public WebElement New_Releases;
	
	@FindBy(xpath="//a[normalize-space()='Movers and Shakers']")
	public WebElement Movers_and_Shakers;
	
	@FindBy(xpath="//div[normalize-space()='digital content and devices']")
	public WebElement digital_content_and_devices;
	
	@FindBy(css="a.hmenu-item")
	public WebElement EchoAlexa;	
	
	@FindBy(xpath="//div[normalize-space()='Fire TV']")
	public WebElement Fire_TV;
	
	@FindBy(xpath="//div[normalize-space()='Kindle E-Readers & eBooks']")
	public WebElement Kindle_E_Readers;
	
	@FindBy(xpath="//div[normalize-space()='Audible Audiobooks']")
	public WebElement Audible_Audiobooks;
	
	@FindBy(xpath="//div[normalize-space()='Amazon Prime Video']")
	public WebElement Amazon_Prime_Video;
	
	@FindBy(xpath="//div[normalize-space()='Amazon Prime Music']")
	public WebElement Amazon_Prime_Music;
	
	@FindBy(xpath="//div[normalize-space()='shop by category']")
	public WebElement shop_by_category;
	
	@FindBy(xpath="//div[normalize-space()='Mobiles, Computers']")
	public WebElement Mobiles_Computers;
	
	@FindBy(xpath="//div[normalize-space()='TV, Appliances, Electronics']")
	public WebElement TV_Appliances_Electronics;
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[2]/div[1]/ul[1]/li[18]/a[1]/div[1]")
	public WebElement mens_clothing;
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[2]/div[1]/ul[1]/li[19]/a[1]/div[1]")
	public WebElement womens_clothing;
	
	@FindBy(xpath="//div[normalize-space()='programs & features']")
	public WebElement programs_features;
	
	@FindBy(xpath="//div[normalize-space()='Gift Cards & Mobile Recharges']")
	public WebElement Gift_cards;
	
	@FindBy(xpath="//a[normalize-space()='Flight Tickets']")
	public WebElement Flight_Tickets;
	
	@FindBy(xpath="//a[normalize-space()='#FoundItOnAmazon']")
	public WebElement FoundItOnAmazon;
	
	@FindBy(xpath="//a[normalize-space()='Clearance store']")
	public WebElement Clearance_store;
	
	@FindBy(xpath="//div[normalize-space()='help & settings']")
	public WebElement help_Settings;
	
	@FindBy(xpath="//a[@class='hmenu-item'][normalize-space()='Your Account']")
	public WebElement Your_Account;
	
	@FindBy(xpath="//a[@class='hmenu-item'][normalize-space()='Customer Service']")
	public WebElement Customer_Service;
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	public WebElement Sign_in;
	
	@FindBy(xpath="//a[normalize-space()='Amazon miniTV- FREE entertainment']")
	public WebElement Amazon_miniTV_FREE_entertainment;
	
	@FindBy(xpath="//div[normalize-space()='Home, Kitchen, Pets']")
	public WebElement Home_Kitchen_Pets;
	
	@FindBy(xpath="//div[normalize-space()='Beauty, Health, Grocery']")
	public WebElement Beauty_Health_Grocery;
	
	@FindBy(xpath="//div[normalize-space()='Sports, Fitness, Bags, Luggage']")
	public WebElement Sports_Fitness_Bags_Luggage;
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[2]/div[1]/ul[1]/ul[1]/li[5]/a[1]/div[1]")
	public WebElement Toys_Baby;
	
	@FindBy(xpath="//div[normalize-space()='Car, Motorbike, Industrial']")
	public WebElement Car_Motorbike_Industrial;
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[2]/div[1]/ul[1]/ul[1]/li[7]/a[1]")
	public WebElement Books;
	
	@FindBy(xpath="//div[normalize-space()='Movies, Music & Video Games']")
	public WebElement Movies_Music_ideo_Games;
	
}
