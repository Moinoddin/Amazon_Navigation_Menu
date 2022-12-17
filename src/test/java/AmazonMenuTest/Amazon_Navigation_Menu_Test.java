package AmazonMenuTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClassSetup;
import PageObjects.Amazon_Navigation_Menu;

public class Amazon_Navigation_Menu_Test extends BaseClassSetup{
	
	WebDriver driver;
	Amazon_Navigation_Menu menu = new Amazon_Navigation_Menu(driver);
	
	@Test
	public void validate_mouse_hover_Main_Menu_Drop_Down()
	{
		Actions action = new Actions(driver);
		
		action.moveToElement(menu.mouse_hover_all_menu).perform();
		Assert.assertTrue(true);
	}

	@Test(priority=0)
	public void validate_the_All_Main_Menu_Drop_Down_Category()
	{
		menu.All_Drop_Down_Menu.click();
		Assert.assertTrue(true, "All Main Menu Drop Down Category Displayed");
		
	}
	
	@Test
	public void  validate_Hello_sign_in()
	{
		menu.All_Drop_Down_Menu.click();
		menu.Hello_Sign_in.click();
		Assert.assertTrue(true, "Sign in' Page is displayed");
	}
	
	@Test
	public void validate_Trending_Lable()
	{
		menu.All_Drop_Down_Menu.click();
		String expected = menu.trending.getText();
		Assert.assertEquals("Trending",expected );
	}
	
	@Test
	public void validate_Best_Sellers_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.Best_Sellers.click();
		Assert.assertTrue(true, "Best Sellers' Page is displayed");
	}
	
	@Test
	public void validate_New_Releases_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.New_Releases.click();
		Assert.assertTrue(true, "New Releases' Page is displayed");
	}
	
	@Test
	public void validate_Movers_and_Shakers_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.Movers_and_Shakers.click();
		Assert.assertTrue(true, "Movers and Shakers' Page is displayed");
		
	}
	
	@Test
	public void validate_Digital_Content_And_Devices_Option()
	{
		menu.All_Drop_Down_Menu.click();
		String expected = menu.digital_content_and_devices.getText();
		Assert.assertEquals("Digital Content And Devices", expected);
	}
	
	@Test
	public void validate_Amazon_miniTV_FREE_entertainment_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.Amazon_miniTV_FREE_entertainment.click();
		Assert.assertTrue(true, "Amazon miniTV-FREE entertainment' Page is displayed");
	}
	
	@Test
	public void validate_Echo_and_Alexa_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.EchoAlexa.click();
		Assert.assertTrue(true, "Echo & Alexa' and 'Content & Resources' Category displayed");
	}
	
	@Test
	public void validate_Fire_TV_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.Fire_TV.click();
		Assert.assertTrue(true, "Fire TV' Category displayed");
	}
	
	@Test
	public void validate_Kindle_E_Readers_and_eBooks_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.Kindle_E_Readers.click();
		Assert.assertTrue(true, "Kindle E-Readers & Kindle eBooks' Category displayed");
	}
	
	@Test
	public void validate_audible_audiobooks_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.Audible_Audiobooks.click();
		Assert.assertTrue(true, "Audible Audiobooks' Category displayed");
	}
	
	@Test
	public void validate_Amazon_Prime_Video_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.Amazon_Prime_Video.click();
		Assert.assertTrue(true, "Amazon Prime Video' Category displayed");
	}
	
	@Test
	public void validate_Amazon_Prime_Music_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.Amazon_Prime_Music.click();
		Assert.assertTrue(true, "Amazon Prime Music' Category displayed");
	}
	
	@Test
	public void validate_shop_by_category_Option()
	{
		menu.All_Drop_Down_Menu.click();
		String expected = menu.shop_by_category.getText();
		Assert.assertEquals("Shop by category", expected);
	}
	
	@Test
	public void validate_Mobiles_Computers_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.Mobiles_Computers.click();
		Assert.assertTrue(true, "Mobiles, Tablets & More' and 'Computers & Accessories' Category displayed");
	}
	
	@Test
	public void validate_TV_Appliances_Electronics_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.TV_Appliances_Electronics.click();
		Assert.assertTrue(true, "Tv, Audio & Cameras' and 'Appliances' Category displayed");
	}
	
	@Test
	public void validate_Mens_Fashion_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.mens_clothing.click();
		Assert.assertTrue(true, "Men's Clothing' ,'Accessories','Men's Shoes' and 'Stores' Category displayed");
	}
	
	@Test
	public void validate_Womens_Fashion_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.womens_clothing.click();
		Assert.assertTrue(true, "Women's Clothing' ,'Accessories','Women's Shoes' and 'Stores' Category displayed");
	}
	
	@Test
	public void validate_Home_Kitchen_Pets_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.Home_Kitchen_Pets.clear();
		Assert.assertTrue(true, "Home & Kitchen','Pet Supplies' and 'Home, Kitchen, Pets' Category displayed");
	}
	
	@Test
	public void validate_Beauty_Health_Grocery_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.Beauty_Health_Grocery.click();
		Assert.assertTrue(true, "Beauty & Health','Grocery & Gourment Foods' Category displayed");
	}
	
	@Test
	public void validate_Sports_Fitness_Bags_Luggage_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.Sports_Fitness_Bags_Luggage.click();
		Assert.assertTrue(true, "Sports & Fitness','Bags & Luggage' Category displayed");
	}
	
	@Test
	public void validate_Toys_Baby_Products_Kids_Fashion_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.Toys_Baby.click();
		Assert.assertTrue(true, "Toys & Baby Products' and 'Kids' Fashion' Category displayed");
	}
	
	@Test
	public void validate_Car_Motorbike_Industrial_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.Car_Motorbike_Industrial.click();
		Assert.assertTrue(true, "Cars & Motorbike' and 'Industrial Supplies' Category displayed");
	}
	
	@Test
	public void validate_Books_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.Books.click();
		Assert.assertTrue(true, "Books' and 'Audiable Audiobooks' Category displayed");
	}
	
	@Test
	public void validate_Movies_Music_Video_Games_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.Movies_Music_ideo_Games.click();
		Assert.assertTrue(true, "Movie & Tv Shows','Video Games','Music' and 'Stream Music' Category displayed");
	}
	
	@Test
	public void validate_Programs_Features_Option()
	{
		menu.All_Drop_Down_Menu.click();
		String expected = menu.programs_features.getText();
		Assert.assertEquals("Programs & Features", expected);
	}
	
	@Test
	public void validate_Gift_Cards_Mobile_Recharges_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.Gift_cards.click();
		Assert.assertTrue(true, "Gift Cards' and 'Recharges' Category displayed");
	}
	
	@Test
	public void validate_Flight_Tickets_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.Flight_Tickets.click();
		Assert.assertTrue(true, "Flight Tickets' Page is displayed");
		
	}
	
	@Test
	public void validate_FoundOnAmazon_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.FoundItOnAmazon.click();
		Assert.assertTrue(true, "#FoundOnAmazon' Page is displayed");
	}
	
	@Test
	public void validate_Clearance_Store_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.Clearance_store.click();
		Assert.assertTrue(true, "Clearance Store' Page is displayed");
	}
	
	@Test
	public void validate_Help_Setting_Option()
	{
		menu.All_Drop_Down_Menu.click();
		String expected = menu.help_Settings.getText();
		Assert.assertEquals("Help & Settings", expected);
	}
	
	@Test
	public void validate_Your_Account_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.Your_Account.click();
		Assert.assertTrue(true, "Your Account' Page is displayed");
		
	}
	
	@Test
	public void validate_Customer_Service_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.Customer_Service.click();
		Assert.assertTrue(true, "Customer Service' Page is displayed");
	}
	
	@Test
	public void validate_Sign_in_Option()
	{
		menu.All_Drop_Down_Menu.click();
		menu.Sign_in.click();
		Assert.assertTrue(true, "Sign in' Page is displayed");
	}
	
	
	
	
}
