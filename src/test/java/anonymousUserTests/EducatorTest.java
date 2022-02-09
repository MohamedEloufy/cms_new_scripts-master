package anonymousUserTests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import loginUserTests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P002_HomePage;
import pages.P004_PortalsPage;

public class EducatorTest extends TestBase {

    P002_HomePage homePageObject;
    P004_PortalsPage portalPageObject;

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void openEducatorPage()
    {
        homePageObject= new P002_HomePage(driver);
        homePageObject.open_Educators_portal();
        portalPageObject= new P004_PortalsPage(driver);
        Assert.assertTrue(portalPageObject.portal_price_button.isDisplayed());
        Assert.assertTrue(portalPageObject.nagwa_portals_title.isDisplayed());
        Assert.assertTrue(portalPageObject.nagwa_portal_paragraph.isDisplayed());

    }
}
