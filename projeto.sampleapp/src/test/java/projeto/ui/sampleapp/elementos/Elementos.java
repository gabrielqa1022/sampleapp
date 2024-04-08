package projeto.ui.sampleapp.elementos;

import org.openqa.selenium.By;

public class Elementos {

	// page Vehicle Data
	
	public By make = By.id("make");
	public By optionMake = By.id("dateofmanufacture");
	public By numerOfSeats = By.id("numberofseats");
	public By fuelType = By.id("fuel");
	public By listPrice = By.id("listprice");
	public By licensePlateNumber = By.id("licenseplatenumber");
	public By annual = By.id("annualmileage");
	public By next = By.id("nextenterinsurantdata");
	public By engine = By.id("engineperformance");
	public By date = By.id("dateofmanufacture");
	public By cylinder = By.id("cylindercapacity");

	public By right = By.id("//p[@class='group']/label/span[@class='ideal-radio checked']");
	public By right2 = By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span"); 
	public By fuel = By.xpath("//select[@id='fuel']/option[2]");
	public By makeVolks = By.xpath("//select[@id='make']/option[15]");
	public By model = By.xpath("//select[@id='model']/option[5]");
	public By number2 = By.xpath("//*[@id=\"numberofseatsmotorcycle\"]/option[3]");
	public By pay = By.xpath("//input[@id='payload']");
	public By totalKg = By.xpath("//input[@id='totalweight']");
	
	// page Insurant Data
	
	public By firstName1 = By.id("firstname");
	public By lastName = By.id("lastname");
	public By date2 = By.id("birthdate");
	public By gender = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span");
	public By streetAdd = By.id("streetaddress");
	public By countryBrazil = By.xpath("//select[@id='country']/option[32]");
	public By zipe = By.id("zipcode");
	public By city = By.id("city");
	public By occupation = By.xpath("//div/select[@id='occupation']/option[3]");
	public By hobbies = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span");
	public By website = By.id("website");
	public By nextInsurant = By.id("nextenterproductdata");
	
	//page Product
	
    public By startDat = By.id("startdate");
	public By insuranceSum = By.xpath("//select[@id='insurancesum']/option[8]");
	public By meritRating = By.xpath("//select[@id='meritrating']/option[8]");
	public By damageInsurance = By.xpath("//select[@id='damageinsurance']/option[2]");
	public By optionalProducts = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span");
	public By courtesyCar = By.xpath("//select[@id='courtesycar']/option[2]");
	public By nextProduct = By.id("nextselectpriceoption");
	
	// page Price Option
	
	public By silver = By.id("selectsilver");
	public By gold = By.id("selectgold");
	public By platinum = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[4]");
	public By ultimante = By.xpath("//label[@class='choosePrice ideal-radiocheck-label']/input[@value='Ultimate']");
	public By nextSelect = By.id("nextsendquote");
	
	// page Send Quote
	
	public By email = By.id("email");
	public By phone = By.id("phone");
	public By username = By.id("username");
	public By password = By.id("password");
	public By confirmPassword = By.id("confirmpassword");
	public By comments = By.id("Comments");
	public By send = By.id("sendemail");
	
	// final page
	
	public By okButton = By.xpath("//button[@class='confirm']");
}
