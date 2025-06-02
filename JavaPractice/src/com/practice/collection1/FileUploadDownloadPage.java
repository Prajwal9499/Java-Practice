package com.automation.vi.checkpoints;

import com.automation.vi.base.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.vi.base.BaseTest;

public class FileUploadDownloadPage extends BaseTest  {

    private WebDriver driver;

    @FindBy(id = "file-upload")
    private WebElement fileUploadInput;

    @FindBy(id = "file-submit")
    private WebElement uploadButton;

    @FindBy(id = "uploaded-files")
    private WebElement uploadedFileName;

    @FindBy(id = "downloadButton")
    private WebElement downloadButton;

    public FileUploadDownloadPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void uploadFile(String filePath) {
        fileUploadInput.sendKeys(filePath);
        uploadButton.click();
    }

    public String getUploadedFileName() {
        return uploadedFileName.getText();
    }

    public void downloadFile() {
        downloadButton.click();
    }
}
