package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	@FindBy(xpath = "//h6[text()='Dashboard']")
	private WebElement dashboard_header;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement tab_search;
	
	@FindBy(xpath = "//span[text()='Admin']")
	private WebElement admin_tab;

	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pim_tab;

	@FindBy(xpath = "//span[text()='Leave']")
	private WebElement leave_tab;

	@FindBy(xpath = "//span[text()='Time']")
	private WebElement time_tab;

	@FindBy(xpath = "//span[text()='Recruitment']")
	private WebElement recruitment_tab;

	@FindBy(xpath = "//span[text()='My Info']")
	private WebElement myinfo_tab;

	@FindBy(xpath = "//span[text()='Performance']")
	private WebElement performance_tab;

	@FindBy(xpath = "//span[text()='Dashboard']")
	private WebElement dashboard_tab;

	@FindBy(xpath = "//span[text()='Directory']")
	private WebElement directory_tab;

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement maintenance_tab;

	@FindBy(xpath = "//span[text()='Claim']")
	private WebElement claim_tab;

	@FindBy(xpath = "//span[text()='Buzz']")
	private WebElement buzz_tab;
	
	@FindBy(css = "i[class='oxd-icon bi-chevron-left']")
	private WebElement sidebar_arrow;
	
	@FindBy(xpath = "//button[contains(@class,'oxd-glass-button')]")
	private WebElement upgrade_button;

	@FindBy(xpath = "//img[@class='oxd-userdropdown-img']")
	private WebElement profile_icon;

	@FindBy(xpath = "//a[text()='About']")
	private WebElement about_option;

	@FindBy(xpath = "//a[text()='Support']")
	private WebElement support_option;

	@FindBy(xpath = "//a[text()='Change Password']")
	private WebElement change_password_option;

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout_option;
	
	@FindBy(css = "i[class='oxd-icon bi-question-lg']")
	private WebElement help_button;

	@FindBy(xpath = "//p[text()='Time at Work']")
	private WebElement widget_time_at_work;

	@FindBy(xpath = "//p[text()='My Actions']")
	private WebElement widget_my_actions;

	@FindBy(xpath = "//p[text()='Quick Launch']")
	private WebElement widget_quick_launch;

	@FindBy(xpath = "//p[text()='Buzz Latest Posts']")
	private WebElement widget_buzz_posts;

	@FindBy(xpath = "//p[text()='Employees on Leave Today']")
	private WebElement widget_employees_on_leave;

	@FindBy(xpath = "//p[text()='Employee Distribution by Sub Unit']")
	private WebElement widget_employee_distribution;

	@FindBy(xpath = "//p[text()='Employee Distribution by Location']")
	private WebElement widget_employee_location;
	
	@FindBy(css = "i[class='oxd-icon bi-stopwatch']")
	private WebElement time_clock_icon;
	
	@FindBy(xpath = "//p[text()=' (2) Timesheets to Approve']")
	private WebElement myaction_link1;

	@FindBy(xpath = "//p[text()='(1) Pending Self Review']")
	private WebElement myaction_link2;

	@FindBy(xpath = "//p[text()='(1) Candidate to Interview']")
	private WebElement myaction_link3;
	
	@FindBy(xpath = "//p[text()='Assign Leave']")
	private WebElement quicklaunch_assignLeave;

	@FindBy(xpath = "//p[text()='Leave List']")
	private WebElement quicklaunch_leaveList;

	@FindBy(xpath = "//p[text()='Timesheets']")
	private WebElement quicklaunch_timesheets;

	@FindBy(xpath = "//p[text()='Apply Leave']")
	private WebElement quicklaunch_applyLeave;

	@FindBy(xpath = "//p[text()='My Leave']")
	private WebElement quicklaunch_myLeave;

	@FindBy(xpath = "//p[text()='My Timesheet']")
	private WebElement quicklaunch_myTimesheet;
	
	@FindBy(css = "i[class='oxd-icon bi-gear-fill orangehrm-leave-card-icon']")
	private WebElement leave_today_settings;
	
	@FindBy(xpath = "//span[@title='Engineering']")
	private WebElement subunit_engineering;

	@FindBy(xpath = "//span[@title='Human Resources']")
	private WebElement subunit_humanResources;

	@FindBy(xpath = "//span[@title='Administration']")
	private WebElement subunit_administration;

	@FindBy(xpath = "//span[@title='Client Services']")
	private WebElement subunit_clientServices;

	@FindBy(xpath = "//span[@title='Unassigned']")
	private WebElement subunit_unassigned;
	
	@FindBy(xpath = "//span[@title='Texas R&D']")
	private WebElement location_texasRD;

	@FindBy(xpath = "//span[@title='New York Sales Office']")
	private WebElement location_newYorkSales;

	@FindBy(xpath = "(//span[@title='Unassigned'])[2]")
	private WebElement location_unassigned;
	
	@FindBy(xpath = "//a[text()='OrangeHRM, Inc']")
	private WebElement footer_text;

	public Dashboard(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void getDashboard_header() {
		dashboard_header.isDisplayed();
	}
	
	public void getTab_Search(String data) {
		tab_search.sendKeys(data);
	}

	public void getAdmin_tab() {
		admin_tab.click();
	}

	public void getPim_tab() {
		pim_tab.click();
	}

	public void getLeave_tab() {
		leave_tab.click();
	}

	public void getTime_tab() {
		time_tab.click();
	}

	public void getRecruitment_tab() {
		recruitment_tab.click();
	}

	public void getMyinfo_tab()  {
		myinfo_tab.click();
	}

	public void getPerformance_tab() {
		performance_tab.click();
	}

	public void getDashboard_tab() {
		dashboard_tab.click();
	}

	public void getDirectory_tab() {
		directory_tab.click();
	}

	public void getMaintenance_tab() {
		maintenance_tab.click();
	}

	public void getClaim_tab() {
		claim_tab.click();
	}

	public void getBuzz_tab() {
		buzz_tab.click();
	}
	
	public void getSidebar_arrow() {
		sidebar_arrow.click();
	}
	
	public void getUpgrade_button() {
		upgrade_button.click();
	}
	
	public void getProfile_icon() {
		profile_icon.click();
	}

	public void getAbout_option() {
		about_option.click();
	}

	public void getSupport_option() {
		support_option.click();
	}

	public void getChange_password_option() {
		change_password_option.click();
	}

	public void getLogout_option() {
		logout_option.click();
	}
	
	public void getHelp_button() {
		help_button.click();
	}

	public void getWidget_time_at_work() {
		widget_time_at_work.isDisplayed();
	}

	public void getWidget_my_actions() {
		widget_my_actions.isDisplayed();
	}

	public void getWidget_quick_launch() {
		widget_quick_launch.isDisplayed();
	}

	public void getWidget_buzz_posts() {
		widget_buzz_posts.isDisplayed(); 
	}

	public void getWidget_employees_on_leave() {
		widget_employees_on_leave.isDisplayed();
	}

	public void getWidget_employee_distribution() {
		widget_employee_distribution.isDisplayed();
	}

	public void getWidget_employee_location() {
		widget_employee_location.isDisplayed();
	}
	
	public void getTime_clock_icon() {
		time_clock_icon.click();
	}
	
	public void getMyaction_link1() {
		myaction_link1.click();
	}

	public void getMyaction_link2() {
		myaction_link2.click();
	}

	public void getMyaction_link3() {
		myaction_link3.click();
	}
	
	public void getQuicklaunch_assignLeave() { 
		quicklaunch_assignLeave.click(); 
	}

	public void getQuicklaunch_leaveList() { 
		quicklaunch_leaveList.click(); 
	}

	public void getQuicklaunch_timesheets() { 
		quicklaunch_timesheets.click(); 
	}

	public void getQuicklaunch_applyLeave() { 
		quicklaunch_applyLeave.click(); 
	}

	public void getQuicklaunch_myLeave() { 
		quicklaunch_myLeave.click(); 
	}

	public void getQuicklaunch_myTimesheet() { 
		quicklaunch_myTimesheet.click(); 
	}
	
	public void getLeave_today_settings() {
		leave_today_settings.click();
	}
	
	public void getSubunit_engineering() {
		subunit_engineering.click();
	}

	public void getSubunit_humanResources() {
		subunit_humanResources.click();
	}

	public void getSubunit_administration() {
		subunit_administration.click();
	}

	public void getSubunit_clientServices() {
		subunit_clientServices.click();
	}

	public void getSubunit_unassigned() {
		subunit_unassigned.click();
	}
	
	public void getLocation_texasRD() {
		location_texasRD.click();
	}

	public void getLocation_newYorkSales() {
		location_newYorkSales.click();
	}

	public void getLocation_unassigned() {
		location_unassigned.click();
	}
	
	public String getFooter_text() {
		footer_text.click();
		return footer_text.getText();
	}
}
