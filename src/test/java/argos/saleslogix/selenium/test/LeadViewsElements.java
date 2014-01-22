package argos.saleslogix.selenium.test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LeadViewsElements extends BrowserSetup {
	
	private WebDriver driver;

	public LeadViewsElements(WebDriver driver) {
		this.driver = driver;		
	}
	
	CommonNavigation commNav = PageFactory.initElements(driver, CommonNavigation.class);

	//List View elements
	@CacheLookup
	@FindBy(xpath = "//*[@id='Sage_Platform_Mobile_SearchWidget_16']/div/div[1]/input")
	WebElement leadsSearchTxtBox;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='Sage_Platform_Mobile_SearchWidget_16']/div/div[2]/button")
	WebElement leadsSearchClearBtn;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='Sage_Platform_Mobile_SearchWidget_16']/div/div[3]/button")
	WebElement leadsSearchLookupBtn;

	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_list']")
	WebElement leadsListViewPnl;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='itemsNode']")
	WebElement leadsListViewNotesBox;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='itemsNode']/div[2]")
	WebElement leadsListViewNotesBox1stItem;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='itemsNode']/div[2]/div/div[1]/div")
	WebElement leadsListViewNotesBox1stItemInitialsBox;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='itemsNode']/div[2]/div/div[2]/h4[1]/strong")
	WebElement leadsListViewNotesBox1stItemRegarding;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='itemsNode']/div[2]/div/div[2]/h4[2]")
	WebElement leadsListViewNotesBox1stItemLastActivity;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='itemsNode']/div[2]/div/div[3]/div/h4")
	WebElement leadsListViewNotesBox1stItemNotes;
	
	@CacheLookup
	@FindBy(xpath = "//div[2]/div[4]/div[2]")
	WebElement leadsListViewNotesBoxSeeListLink;

	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_list']/ul")
	WebElement leadsListViewHdr;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_list']/ul")
	WebElement leadsListView;
	
	@CacheLookup
	@FindBy(xpath = "//div[6]/div[2]/div/button")
	WebElement leadsListView1stKPICard;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_list_search-expression']/div")
	WebElement leadsListView1stHashTagFilter;

	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_list']/ul/li[1]")
	WebElement topLeadsListItem;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_list']/ul/li[1]/div[1]")
	WebElement topLeadsListItemTab;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_list']/ul/li[1]/button")
	WebElement topLeadsListItemIcon;	

	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_list']/ul/li[1]/div/h3")
	WebElement topLeadsListItemName;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_list']/ul/li[1]/div[3]/h4[1]")
	WebElement topLeadsListItemLine2;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_list']/ul/li[1]/div[3]/h4[2]")
	WebElement topLeadsListItemLine3;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_list']/ul/li[1]/div[3]/h4[3]")
	WebElement topLeadsListItemLine4;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_list']/ul/li[1]/div[3]/h4[4]")
	WebElement topLeadsListItemLine5;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='bottom_item_indicators']/span/img")
	WebElement topLeadsListItemBtmIndicator;
	
	@CacheLookup
	@FindBy(css = "#lead_list > ul.list-content > li > #bottom_item_indicators > span > img")
	WebElement topLeadsListItemTouch;
	
	@CacheLookup
	@FindBy(css = "#lead_list > ul.list-content > li > #list-item-footer > div > button.footer-item-selector.button")
	WebElement topLeadsListItemQuickActionsBtn;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_list']/ul/li[2]/button[7]")
	WebElement topLeadsListItemQuickActionsAddAttachmentBtn;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_list']/ul/li[2]/button[6]")
	WebElement topLeadsListItemQuickActionsAddActivityBtn;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_list']/ul/li[2]/button[5]")
	WebElement topLeadsListItemQuickActionsAddNoteBtn;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_list']/ul/li[2]/button[4]")
	WebElement topLeadsListItemQuickActionsEmailBtn;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_list']/ul/li[2]/button[3]")
	WebElement topLeadsListItemQuickActionsCallMobileBtn;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_list']/ul/li[2]/button[2]")
	WebElement topLeadsListItemQuickActionsCallWorkBtn;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_list']/ul/li[2]/button[1]")
	WebElement topLeadsListItemQuickActionsEditBtn;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_list']/ul[2]/li[11]")
	WebElement eleventhLeadsListItem;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_list']/ul[2]/li[21]")
	WebElement twentyfirstLeadsListItem;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_list']/ul[2]/li[31]")
	WebElement thirtyfirstLeadsListItem;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_list']/div[2]/div/span")
	WebElement recordsRemainingListItem;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_list']/ul[2]/li/h3")
	WebElement noRecordsListItem;
	
	//Context Menu elements
	@CacheLookup
	@FindBy(xpath = "//*[@id='right_drawer']/div[4]/h2[1]")
	WebElement leadsHashTagsHdr;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='right_drawer']/div[4]/ul[1]")
	WebElement leadsHashTagsPnl;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='right_drawer']/div[4]/h2[2]")
	WebElement leadsKPIHdr;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='right_drawer']/div[4]/ul[2]")
	WebElement leadsKPIPnl;
	
	//Detail View elements
	//TODO: the Lead Edit fields need to be updated when needed
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']")
	WebElement leadsDetailView;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/div[2]/h2[1]")
	WebElement leadsDetailViewQuickActionsHdr;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/div[2]/ul[1]/li[1]/a")
	WebElement leadsDetailViewCallMainNumberLnk;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/div[2]/ul[1]/li[2]/a")
	WebElement leadsDetailViewSendEmailLnk;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/div[2]/ul[1]/li[3]/a")
	WebElement leadsDetailViewScheduleActivityLnk;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/div[2]/ul[1]/li[4]/a")
	WebElement leadsDetailViewAddNoteLnk;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/div[2]/ul[1]/li[5]/a")
	WebElement leadsDetailViewViewAddressLnk;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/div[2]/h2[2]")
	WebElement leadsDetailViewDetailsHdr;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/div[2]/div[1]/div[1]")
	WebElement leadsDetailViewNameFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/div[2]/div[1]/div[2]")
	WebElement leadsDetailViewCompanyFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/div[2]/div[1]/div[2]")
	WebElement leadsDetailViewWebFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/div[2]/div[1]/div[3]")
	WebElement leadsDetailViewTitleFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/div[2]/div[1]/div[4]")
	WebElement leadsDetailViewWorkPhoneFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/div[2]/div[1]/div[5]")
	WebElement leadsDetailViewMobilePhoneFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/div[2]/div[1]/div[6]")
	WebElement leadsDetailViewTollFreeFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/div[2]/div[1]/div[7]")
	WebElement leadsDetailViewLeadSourceFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/div[2]/h2[3]")
	WebElement leadsDetailViewMoreDetailsHdr;
		
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/div[2]/div[2]")
	WebElement leadsDetailViewMoreDetailsFields;	
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/div[2]/div[2]/div[1]")
	WebElement leadsDetailViewInterestsFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/div[2]/div[2]/div[2]")
	WebElement leadsDetailViewIndustryFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/div[2]/div[2]/div[3]")
	WebElement leadsDetailViewSicCodeFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/div[2]/div[2]/div[4]")
	WebElement leadsDetailViewBusDescFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/div[2]/div[2]/div[5]")
	WebElement leadsDetailViewCommentsFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/div[2]/div[2]/div[6]")
	WebElement leadsDetailViewOwnerFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/div[2]/h2[4]")
	WebElement leadsDetailViewRelatedItemsHdr;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/descendant::*[text() = 'Activities']")
	WebElement leadsDetailViewActivitiesLnk;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/descendant::*[text() = 'Notes/History']")
	WebElement leadsDetailViewNotesHistoryLnk;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_detail']/descendant::*[text() = 'Attachments']")
	WebElement leadsDetailViewAttachmentsLnk;
		
	//Edit View elements
	//TODO: the Lead Edit fields need to be updated when needed
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_edit']")
	WebElement leadsEditView;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='lead_edit']/div[2]/h2")
	WebElement leadsEditViewDetailsHdr;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='Mobile_SalesLogix_Fields_NameField_0']/input")
	WebElement leadsEditViewNameInputFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='Mobile_SalesLogix_Fields_NameField_0']/button")
	WebElement leadsEditViewNameFldBtn;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='Sage_Platform_Mobile_Fields_TextField_2']/input")
	WebElement leadsEditViewCompanyInputFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='Sage_Platform_Mobile_Fields_TextField_3']/input")
	WebElement leadsEditViewWebInputFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='Sage_Platform_Mobile_Fields_PhoneField_0']/input")
	WebElement leadsEditViewWorkPhoneInputFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='Sage_Platform_Mobile_Fields_PhoneField_1']/input")
	WebElement leadsEditViewMobilePhoneInputFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='Sage_Platform_Mobile_Fields_PhoneField_2']/input")
	WebElement leadsEditViewTollFreeInputFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='Sage_Platform_Mobile_Fields_TextField_4']/input")
	WebElement leadsEditViewEmailInputFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='Mobile_SalesLogix_Fields_PicklistField_0']/input")
	WebElement leadsEditViewTitleInputFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='Mobile_SalesLogix_Fields_PicklistField_0']/button")
	WebElement leadsEditViewTitleFldBtn;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='Mobile_SalesLogix_Fields_AddressField_0']/div")
	WebElement leadsEditViewAddressInputFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='Mobile_SalesLogix_Fields_AddressField_0']/button")
	WebElement leadsEditViewAddressFldBtn;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='Sage_Platform_Mobile_Fields_LookupField_0']/input")
	WebElement leadsEditViewLeadSourceFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='Sage_Platform_Mobile_Fields_LookupField_0']/button")
	WebElement leadsEditViewLeadSourceFldBtn;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='Sage_Platform_Mobile_Fields_TextField_5']/input")
	WebElement leadsEditViewInterestsInputFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='Mobile_SalesLogix_Fields_PicklistField_1']/input")
	WebElement leadsEditViewIndustryInputFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='Mobile_SalesLogix_Fields_PicklistField_1']/button")
	WebElement leadsEditViewIndustryFldBtn;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='Sage_Platform_Mobile_Fields_TextField_6']/input")
	WebElement leadsEditViewSicCodeInputFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='Sage_Platform_Mobile_Fields_NoteField_0']/textarea")
	WebElement leadsEditViewBusDescInputFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='Sage_Platform_Mobile_Fields_NoteField_1']/textarea")
	WebElement leadsEditViewCommentsInputFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='Sage_Platform_Mobile_Fields_NoteField_1']/textarea")
	WebElement leadsEditViewCommentsFldBtn;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='Sage_Platform_Mobile_Fields_LookupField_1']/input")
	WebElement leadsEditViewOwnerInputFld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='Sage_Platform_Mobile_Fields_LookupField_1']/button")
	WebElement leadsEditViewOwnerFldBtn;
	
		
	//Methods
	public String getLeadsListViewTxt() {
		String methodID = "getLeadsListViewTxt";
		String listViewTxt = "";
		
		try {
			WebElement leadsLisViewInfo = driver.findElement(By.xpath("//*[@id='lead_list']/ul"));
			listViewTxt = leadsLisViewInfo.getText();
		}
		catch (Exception excptn) {
			System.out.println(excptn.toString());
		}
		
		return listViewTxt;		
	}
	
	
	public boolean NoRecordsFound() {
		boolean result = false;
		
		return result;
	}
}
