package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[formcontrolname='username']")
    public WebElement usernameTextbox;
    @FindBy(css = "[formcontrolname='password']")
    public WebElement passwordTextbox;
    @FindBy(css = "[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css = "span[class='mat-tooltip-trigger logo-text']")
    public WebElement txtTechnoStudy;

    @FindBy(css = "[data-icon='plus']")
    public WebElement plus;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    public WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    public WebElement codeInput;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']/input")
    public WebElement priortyInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortNameInput;


    @FindBy(xpath = "//ms-save-button")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement confirmMsg;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    public WebElement alreadyExist;

    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Name']")
    public WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteImageBtn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;
    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']")
    public WebElement activeDialogBtn;
    @FindBy(xpath = "(//mat-select[@role='combobox'])[1]")
    public WebElement academicPeriod;

    @FindBy(xpath = "//span[@class='mat-option-text']")
    public WebElement academicPeriod2;
    @FindBy(xpath = "(//mat-select[@role='combobox'])[2]")
    public WebElement gradeLevel;
    @FindBy(xpath = "(//mat-option//span)[2]")
    public WebElement gradeLevel2;
    @FindBy(xpath = "(//button[@_ngcontent-cjv-c185])[2]")
    public WebElement backButton;



    public void findAndClick(WebElement element) {
        clickFunc(element);

    }

    public void findAndSend(WebElement element, String text) {
        sendKeysFunc(element, text);

    }

    public void deleteItem(String searchText) {
        sendKeysFunc(searchInput, searchText);
        clickFunc(searchButton);
        //beklet
        // wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        clickFunc(deleteImageBtn);
        clickFunc(deleteDialogBtn);
    }

    public void selectItem(int itemIndex, WebElement element){
        Select secim = new Select(element);
        secim.selectByIndex(itemIndex);
    }
    public WebElement getWebElement(String strButton) { // ÖNEMLİ

        switch (strButton) {
            case "plus":
                return plus;
            case "searchButton":
                return searchButton;
            case "saveButton":
                return saveButton;
            case "codeInput":
                return codeInput;
            case "nameInput":
                return nameInput;
            case "priortyInput":
                return priortyInput;
            case "activeDialogBtn":
                return activeDialogBtn;
            case "academicPeriod":
                return academicPeriod;
            case "gradeLevel":
                return gradeLevel;
            case "academicPeriod2":
                return academicPeriod2;
            case "gradeLevel2":
                return gradeLevel2;

            case "backButton":
                return backButton;



        }
        return null;

    }
}
