package argos.saleslogix.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MiscEntityItemViewsElements {

    //Address Edit view elements
    @CacheLookup
    @FindBy(xpath = "//*[@id='address_edit']")
    public WebElement addressEditView;
    @CacheLookup
    @FindBy(xpath = "//*[@id='address_edit']/div[2]/h2")
    public WebElement addressEditHdr;
    @CacheLookup
    @FindBy(xpath = "//*[@id='Mobile_SalesLogix_Fields_PicklistField_7']/input")
    public WebElement addressEditDescriptionInputFld;
    @CacheLookup
    @FindBy(xpath = "//*[@id='Mobile_SalesLogix_Fields_PicklistField_7']/button")
    public WebElement addressEditDescriptionInputBtn;
    @CacheLookup
    @FindBy(xpath = "//*[@id='Sage_Platform_Mobile_Fields_BooleanField_1']/div/span[1]")
    public WebElement addressEditPrimaryTglBtn;
    @CacheLookup
    @FindBy(xpath = "//*[@id='Sage_Platform_Mobile_Fields_BooleanField_2']/div/span[1]")
    public WebElement addressEditShippingTglBtn;
    @CacheLookup
    @FindBy(xpath = "//*[@id='Sage_Platform_Mobile_Fields_TextField_69']/input")
    public WebElement addressEditAddress1InputFld;
    @CacheLookup
    @FindBy(xpath = "//*[@id='Sage_Platform_Mobile_Fields_TextField_70']/input")
    public WebElement addressEditAddress2InputFld;
    @CacheLookup
    @FindBy(xpath = "//*[@id='Sage_Platform_Mobile_Fields_TextField_71']/input")
    public WebElement addressEditAddress3InputFld;
    @CacheLookup
    @FindBy(xpath = "//*[@id='Mobile_SalesLogix_Fields_PicklistField_8']/input")
    public WebElement addressEditCityInputFld;
    @CacheLookup
    @FindBy(xpath = "//*[@id='Mobile_SalesLogix_Fields_PicklistField_8']/button")
    public WebElement addressEditCityInputBtn;
    @CacheLookup
    @FindBy(xpath = "//*[@id='Mobile_SalesLogix_Fields_PicklistField_9']/input")
    public WebElement addressEditStateInputFld;
    @CacheLookup
    @FindBy(xpath = "//*[@id='Mobile_SalesLogix_Fields_PicklistField_9']/button")
    public WebElement addressEditStateInputBtn;
    @CacheLookup
    @FindBy(xpath = "//*[@id='Sage_Platform_Mobile_Fields_TextField_72']/input")
    public WebElement addressEditPostalInputFld;
    @CacheLookup
    @FindBy(xpath = "//*[@id='Mobile_SalesLogix_Fields_PicklistField_10']/input")
    public WebElement addressEditCountryInputFld;
    @CacheLookup
    @FindBy(xpath = "//*[@id='Mobile_SalesLogix_Fields_PicklistField_10']/button")
    public WebElement addressEditCountryInputBtn;
    @CacheLookup
    @FindBy(xpath = "//*[@id='Sage_Platform_Mobile_Fields_TextField_73']/input")
    public WebElement addressEditAttentionInputFld;
    //Name Edit view elements
    @CacheLookup
    @FindBy(xpath = "//*[@id='name_edit']")
    public WebElement nameEditView;
    @CacheLookup
    @FindBy(xpath = "//*[@id='name_edit']/div[2]/h2")
    public WebElement nameEditHdr;
    @CacheLookup
    @FindBy(xpath = "//*[@id='Mobile_SalesLogix_Fields_PicklistField_5']/input")
    public WebElement nameEditPrefixInputFld;
    @CacheLookup
    @FindBy(xpath = "//*[@id='Mobile_SalesLogix_Fields_PicklistField_5']/button")
    public WebElement nameEditPrefixInputBtn;
    @CacheLookup
    @FindBy(xpath = "//*[@id='Sage_Platform_Mobile_Fields_TextField_66']/input")
    public WebElement nameEditFirstInputFld;
    @CacheLookup
    @FindBy(xpath = "//*[@id='Sage_Platform_Mobile_Fields_TextField_67']/input")
    public WebElement nameEditMiddleInputFld;
    @CacheLookup
    @FindBy(xpath = "//*[@id='Sage_Platform_Mobile_Fields_TextField_68']/input")
    public WebElement nameEditLastInputFld;
    @CacheLookup
    @FindBy(xpath = "//*[@id='Mobile_SalesLogix_Fields_PicklistField_6']/input")
    public WebElement nameEditSuffixInputFld;
    @CacheLookup
    @FindBy(xpath = "//*[@id='Mobile_SalesLogix_Fields_PicklistField_6']/button")
    public WebElement nameEditSuffixInputBtn;
    private WebDriver driver;
    CommonNavigation commNav = PageFactory.initElements(driver, CommonNavigation.class);

    public MiscEntityItemViewsElements(WebDriver driver) {
        this.driver = driver;
    }


    //Methods
    //TODO: create a setupNameFields() method that sets and saves the Name input fields with given values

    //TODO: create a new setupAddressFields() method that sets and saves the Address input fields with given values
}
