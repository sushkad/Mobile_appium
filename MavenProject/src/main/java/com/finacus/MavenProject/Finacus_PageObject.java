package com.finacus.MavenProject;


public class Finacus_PageObject {

	//*************************-------LOGIN-------*************************************************************
	
	public static final  String  logouturl = "http://103.78.168.227:9550/finaml_internalstatic/";
	public static final  String  loginurl = "http://103.78.168.227:9550/finaml_internalstatic/";
	
	public static final  String  Email  = "email"; //id
	public static final  String  Password = "password"; //id
	
	public static final  String  Login = "//span[contains(text(),'Log In')]";

	//*************************** --------DASHBOARD---------- *************************************************
	
	public static final String Home = "//*[name()='path' and contains(@d,'M10 20v-6h')]";
	
	public static final String Search = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]";
	
	public static final String Logout = "//header/div[1]/div[3]/button[1]/span[1]/span[1]";

	public static final String Slidebar = "//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]/*[1]";
	
	public static final String Hamberger = "//header/div[1]/button[1]/span[1]/*[1]";

	//***************************------ (1) User Management-----------**********************************************
	
	public static final String Usermgm = "//body/div[@id='root']/div/div/div/div/div/div/div/div/div[@id='main']/div[@id='mySidebar']/div[@id='accordionExample']/ul/li[2]/a[1]/div[1]/div[2]";
	
	//Role Master
	public static final String Rolemaster = "//div[contains(text(),'Role Master')]";
	
	public static final String AddRolemaster = "//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/div[1]/div[1]/fieldset[1]/div[1]/label[1]/span[1]/span[1]/input[1]";
	
	public static final String ModifyRolemaster = "//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/div[1]/div[1]/fieldset[1]/div[1]/label[2]/span[1]/span[1]/input[1]";
	
	public static final String DeleteRoleMaster = "//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/div[1]/div[1]/fieldset[1]/div[1]/label[3]/span[1]/span[1]/input[1]";
	
	public static final String InquireRoleMaster = "//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/div[1]/div[1]/fieldset[1]/div[1]/label[4]/span[1]/span[1]/input[1]";
	
	public static final String RolemasterName = "role_name"; //id
	public static final String RolemasterDescription = "role_desc"; //id
	public static final String Rolemastersave =  "//span[contains(text(),'Save')]";
	public static final String RolemasterClear = "//span[contains(text(),'Clear')]";
	
	//Block/Unblock
	
	 public static final String Blockunblock = "//div[contains(text(),'Block / Unblock')]";
	 public static final String Blockuserid = "user_id"; //id
	 
	 public static final String Searchblockunblock = "//input[@id='block_user']";
	 public static final String Clearblockunblock = "//span[contains(text(),'Clear')]";
	 public static final String BlockunblockYesno = "//span[contains(text(),'Block')]";
	 
	//*************************** ------- (2) Core Parameters--------- **********************************************
	public static final String coreparameters =  "//div[contains(text(),'Core Parameters')]";
	
	//Location Master
	public static final String Locationmaster = "//div[contains(text(),'Location Master')]";

	public static final String Add = "//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/div[1]/div[1]/fieldset[1]/div[1]/label[1]/span[1]/span[1]/input[1]";
	public static final String Modify = "//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/div[1]/div[1]/fieldset[1]/div[1]/label[2]/span[1]/span[1]/input[1]";
	public static final String Delete = "//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/div[1]/div[1]/fieldset[1]/div[1]/label[3]/span[1]/span[1]/input[1]";
	public static final String Inquire = "//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/div[1]/div[1]/fieldset[1]/div[1]/label[4]/span[1]/span[1]/input[1]";
			
	//Add 
	public static final String Locationid = "LocationId"; //id
	public static final String Name = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]";
	public static final String UniqueIdIssuedbyRegulatoryBody = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]";
	public static final String Address = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/input[1]";
	public static final String City = "//input[@id='City']";
	public static final String Country = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]";
	public static final String PinCode = "PinCode"; //id
	public static final String Phone1 = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[1]/div[1]/div[8]/div[1]/div[2]/div[1]/div[1]/input[1]";
	public static final String Phone2 = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[1]/div[1]/div[9]/div[1]/div[2]/div[1]/div[1]/input[1]";
	public static final String Fax = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[1]/div[1]/div[10]/div[1]/div[2]/div[1]/div[1]/input[1]";
	public static final String EmailId = "EmailId"; //id
	public static final String SAVE = "//body/div/div/div/main/div/span/div/div/div/div[1]/button[1]/span[1]";
	public static final String CLEAR = "//span[contains(text(),'Clear')]";
	public static final String MODIFY = "//body/div/div/div/main/div/span/div/div/div/div[1]/button[1]/span[1]";
	public static final String DELETE = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]"+ "";

	//Lookup Master
	public static final String LookupMaster = "//div[contains(text(),'Lookup Master')]";
	
	public static final String AddLookupMaster = "//input[@id='']";
	public static final String LookupCode = "//input[@id='lookup_code']";
	public static final String LookupID = "//input[@placeholder='Lookup ID']";
	public static final String LookupName = "//input[@id='lookup_name']";
	public static final String LookupSAVE = "//span[normalize-space()='Save']";
	public static final String LookupCLEAR = "//span[normalize-space()='Clear']";

	public static final String ModifyLookupMaster = "//input[@value='2']";
	public static final String ModifybuttonLookupMaster = "//span[@class='MuiButton-label'][normalize-space()='Modify']";


	public static final String DeleteLookupMaster = "//input[@value='4']";
	public static final String DeletebuttonLookupMaster = "//span[@class='MuiButton-label'][normalize-space()='Delete']";


	public static final String InquireLookupMaster = "//input[@value='8']";
	public static final String ClearLookuMaster = "//span[@class='MuiButton-label']";


	//Organization Master
	public static final String OrganizationMaster = "//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/li[3]/a[1]/div[1]/div[2]";
	
	public static final String Addom = "//input[@value='1']";
	public static final String Modifyom = "//input[@value='2']";
	public static final String Deleteom = "//input[@value='4']";
	public static final String Inquireom = "//input[@value='8']";
	public static final String OrganisationName = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]";
	public static final String Addressom = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]";
	public static final String InsuranceCode = "//input[@id='InsuranceCode']";
	public static final String Cityom = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[1]/div[1]/div[6]/div[1]/div[4]/div[1]/div[1]/div[1]";
	public static final String EmailIdom = "//input[@id='EmailId']";
	public static final String Websiteom = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[1]/div[1]/div[7]/div[1]/div[4]/div[1]/div[1]/input[1]";
	public static final String InsuranceCategory = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[1]/div[1]/div[8]/div[1]/div[2]/div[1]/div[1]/input[1]";
	public static final String RegulatiryBodyCode = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[1]/div[1]/div[8]/div[1]/div[4]/div[1]/div[1]/input[1]";
	public static final String Phone1om = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[1]/div[1]/div[9]/div[1]/div[2]/div[1]/div[1]/input[1]";
	public static final String Phone2om = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[1]/div[1]/div[9]/div[1]/div[4]/div[1]/div[1]/input[1]";
	public static final String Countryom = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[1]/div[1]/div[10]/div[1]/div[2]/div[1]/div[1]/div[1]";
	public static final String State = "//input[@id='State']";
	public static final String Pincode = "//input[@id='Pincode']";
	public static final String SAVEom = "//span[contains(text(),'Save')]";
	public static final String CLEARom = "//span[contains(text(),'Clear')]";

	public static final String Modifyombutton = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]";
	public static final String Deleteombutton = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]";

	//System Parameters
	public static final String SystemParameter = "//div[contains(text(),'System Parameters')]";
	
	public static final String Addspm = "//input[@value='1']";
	
	public static final String Modifyspm = "//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/div[1]/div[1]/fieldset[1]/div[1]/label[2]/span[1]/span[1]/input[1]";
	
	public static final String Deletespm = "//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/div[1]/div[1]/fieldset[1]/div[1]/label[3]/span[1]/span[1]/input[1]";
	
	public static final String Inquirespm = "//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/div[1]/div[1]/fieldset[1]/div[1]/label[4]/span[1]/span[1]/input[1]";

	
	public static final String Optionone = "//body[1]/div[4]/div[1]/ul[1]/li[1]";
	
	public static final String ParameterId = "//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]";
	
	public static final String ParameterName = "//div[@class='MuiInputBase-root MuiOutlinedInput-root Mui-error Mui-error Mui-focused Mui-focused MuiInputBase-formControl']//input[@type='text']";
	
	public static final String Description = "//div[@class='MuiInputBase-root MuiOutlinedInput-root Mui-error Mui-error Mui-focused Mui-focused MuiInputBase-formControl']//input[@type='text']";
	
	public static final String ParameterType = "//input[@id='ParameterType']";
	
	public static final String ParameterValue = "//div[@class='MuiInputBase-root MuiOutlinedInput-root Mui-focused Mui-focused MuiInputBase-formControl']//input[@type='text']";
	
	public static final String SAVEspmbutton = "//span[normalize-space()='Save']";
	
	public static final String CLEARspm = "//*[@type='button']";
	
	public static final String Modifyspmbutton = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]";
	
	public static final String Deletespmbutton = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]";

	//*************************** ------- (3) Masters--------- **********************************************
	public static final String Masters = "//div[contains(text(),'Masters')]";
	
	public static final String CustomerInformation = "//div[contains(text(),'Customer Information')]";

	// Customer Information
	public static final String CustModify = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[1]/fieldset[1]/div[1]/label[2]/span[1]/span[1]/input[1]";
	public static final String CICID = "//input[@id='key.CustNo']";
	public static final String IndividualCorporat = "//input[@id='cust_type']";
	
	//----------Individual TAB----------
	public static final String Individual = "//span[contains(text(),'Individual')]";
	public static final String NamePrefix = "//input[@id='key.NameTitle']";
	public static final String FirstName = "//input[@id='key.FirstName']";
	public static final String MiddleName = "//input[@id='key.MiddleName']";
	public static final String LastName = "//input[@id='key.LastName']";
	public static final String NameSuffix = "//input[@id='key.NameSuffix']";
	public static final String DateOfBirth = "//input[@id='key.dob']";
	public static final String PlaceOfBirth = "//input[@id='ind.PlaceOfBirth']";
	public static final String Gender = "//input[@id='key.Gender']";
	public static final String MaritalStatus = "//input[@id='ind.Marital_Status']";
	public static final String IndividualOccupation = "//input[@id='ind.Occupation']";
	public static final String Employer = "//input[@id='ind.Employer']";
	public static final String Employmentstatus = "//input[@id='ind.Employment_status']";
	public static final String Employersname = "//input[@id='ind.Employers_name']";
	public static final String Employersaddress = "//input[@id='ind.Employers_address']";
	public static final String EmployersPhoneno = "//input[@id='ind.Employers_Phone_no']";
	
	//Do you want to capture pep details? (Y to capture, N to Freeze)//
	public static final String PEPStatus = "//input[@id='ind.PEP_Status']";
	public static final String PEPType = "//input[@id='ind.PEP_type']";
	public static final String PEPPosition = "//input[@id='ind.PEP_Position']";
	public static final String PEPCountry = "//input[@id='ind.PEP_Country']";
	public static final String IndividualNationality = "//input[@id='ind.PEP_Country']";
	public static final String Language = "//input[@id='ind.Language']";
	public static final String CountryofPrimaryCitizenship = "//input[@id='ind.Country_of_Primary_Citizenship']";
	public static final String CountryofSecondaryCitizenship = "//input[@id='ind.Country_of_Secondary_Citizenship']";
	public static final String ResidenceCountry = "//input[@id='ind.Residence_Country']";
	public static final String NumberofYearsResident = "//input[@id='ind.Number_of_Years_Resident']";
	public static final String Nationalitytype = "//input[@id='ind.Nationality_type']";
	public static final String IndividualBranch = "//input[@id='ind.BranchCode']";
	public static final String IndividualPassportNo = "//input[@id='key.Passport_No']";
	public static final String ExpirationDateofpassport = "//input[@id='ind.Expiration_Date_passport']";
	public static final String SocialSecuritynumber = "//input[@id='key.Social_Security_number']";
	public static final String SocialSecurityexpirydate = "//input[@id='ind.Social_Security_expiry_date']";
	public static final String IndividualSubmit = "//span[contains(text(),'Submit')]";
	public static final String IndividualClear = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]/span[1]";
	
	//----------Address TAB----------
	public static final String AddressTab = "//span[contains(text(),'Address')]";
	public static final String AddressType = "//input[@id='Address_Type']";
	public static final String Street = "//input[@id='Street']";
	public static final String Town ="//input[@id='Town']";
	public static final String Village ="//input[@id='Village']";
	public static final String District ="//input[@id='District']";
	public static final String AddressCity ="//input[@id='City']";
	public static final String AddressCountry ="//input[@id='Country']";
	public static final String Pin ="//input[@id='Pin']";
	public static final String Phone ="//input[@id='Phone']";
	public static final String Mobile ="//input[@id='Mobile']";
	public static final String AddressEmailId ="//input[@id='EmailId']";
	public static final String MobileNoTwoFax ="//input[@id='Fax']";
	public static final String SAVEINCART ="//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[8]/div[1]/div[1]/button[1]/span[1]";
	public static final String AddressCLEAR ="//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[8]/div[1]/div[2]/button[1]/span[1]";
	
	public static final String AddressSubmit = "//span[contains(text(),'Submit')]";
	public static final String AddressClear = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]/span[1]";
	
	
	//----------Details TAB----------
	public static final String DetailsTab = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[4]/span[1]";
	public static final String MethodofAccountOpening = "//input[@id='common.Method_of_Account_Opening']";
	public static final String ServicePaymentMethod = "//input[@id='common.Service_Payment_Method']";
	public static final String ServiceDeliveryMethod = "//input[@id='common.Service_Delivery_Method']";
	public static final String ProductOffered = "//input[@id='common.Product_Offered']";
	public static final String CashActivity = "//input[@id='common.Cash_Activity']";
	public static final String WireActivity = "//input[@id='common.Wire_Activity']";
	public static final String BusinessTransactionEntity = "//input[@id='common.Business_Transaction_Entity']";
	public static final String SourceofWealth = "//input[@id='common.Source_of_Wealth']";
	public static final String ProofofAddressTypeUtilityBill = "//input[@id='common.Proof_of_Address_Type']";
	public static final String ExpirationCurrentdateUtilityBill = "//input[@id='common.Expiration_date_Utility_Bill']";
	public static final String RelationshipType = "//input[@id='common.Relationship_Type']";
	public static final String RelatedCustomerIdentifier = "//input[@id='common.Related_Customer_Identifier']";
	public static final String ServiceEffectiveDate= "//input[@id='common.Service_Effective_Date']";
	public static final String ServiceExpirationDate = "//input[@id='common.Service_Expiration_Date']";
	public static final String CompanysInternalWatchList = "//input[@id='common.Companys_Internal_Watch_List']";
	public static final String DocumentSequenceIdentifier = "//input[@id='common.Document_Sequence_Identifier']";
	public static final String DocumentType = "//input[@id='common.Document_Type']";
	public static final String DocumentReferenceNumber = "//input[@id='common.Document_Reference_Number']";
	public static final String CustomerRiskProfile = "//input[@id='common.Customer_Risk_Profile']";
	public static final String Persontransactingbusiness = "//input[@id='common.Person_transacting_business']";
	public static final String LengthofRelationship = "//input[@id='common.Length_of_Relationship']";
	public static final String Policytype = "//input[@id='common.Policy_type']";
	public static final String SourceofFunds = "//input[@id='common.Source_of_Funds']";
	public static final String WatchListforInterestedParties = "//input[@id='common.Watch_List_Interested_Parties']";
	public static final String CustomerAddDate = "//input[@id='common.Customer_Add_Date']";
	public static final String CustomerLastUpdateDate = "//input[@id='common.Customer_Last_Update_Date']";
	public static final String AccountOpenDate = "//input[@id='common.Account_Open_Date']";
	public static final String AccountStatus = "//input[@id='common.Account_Status']";
	public static final String Averagetransactionsize = "//input[@id='common.Average_transaction_size']";
	public static final String Transactionspercustomer = "//input[@id='common.Transactions_per_customer']";
	public static final String Timeoftransactions = "//input[@id='common.Time_of_transactions']";
	public static final String CustomerStatus = "//input[@id='common.Customer_Status']";
	public static final String BlacklistFromAgile = "//input[@id='common.blacklistedInAgile']";
	public static final String DetailsSubmit = "//span[contains(text(),'Submit')]";
	public static final String DetailsClear = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]/span[1]";
	
	
	//----------Upload Documents TAB----------
	public static final String UploadDocuments = "//span[contains(text(),'Upload Documents')]";
	public static final String SocialsecurityImage = "//span[contains(text(),'Social security Image')]";
	public static final String Passport = "//span[contains(text(),'Passport')]";
	public static final String DrivingLicense = "//span[contains(text(),'Driving License')]";
	public static final String Voterid = "//span[contains(text(),'Voter ID')]";
	public static final String LearnersPermit = "//span[contains(text(),'Learners Permit')]";
	public static final String EnableDisable = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[5]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/span[1]/span[1]/span[1]/input[1]";
	public static final String UPDOCSubmit = "//span[contains(text(),'Submit')]";
	public static final String UPDOCClear = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]/span[1]";
	

	//Principle Office Master
	public static final String Principleofficemaster = "//div[contains(text(),'Principal Officer Master')]";
	
	public static final String Addpom = "//input[@value='1']";
	public static final String Modifypom = "//input[@value='2']";
	public static final String Deletepom = "//input[@value='4']";
	public static final String Inquirepom = "//input[@value='8']";

	public static final String EffectiveDatepom = "//input[@id='EffDate']";
	public static final String OfficerName = "//input[@id='PrincipalName']";
	public static final String Addresspom = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]";
	public static final String Countrypom = "//input[@id='Country']";
	public static final String Statepom = "//input[@id='State']";
	public static final String Citypom = "//input[@id='City']";
	public static final String Designationpom = "//input[@id='Designation']";
	public static final String PinCodepom = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[2]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/input[1]";
	public static final String Mobilepom = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[2]/div[1]/div[6]/div[1]/div[4]/div[1]/div[1]/input[1]";
	public static final String EmailIDpom = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[2]/div[1]/div[7]/div[1]/div[2]/div[1]/div[1]/input[1]";
	public static final String Faxpom = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[2]/div[1]/div[7]/div[1]/div[4]/div[1]/div[1]/input[1]";
	public static final String Phonepom = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[2]/div[1]/div[7]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]";
	public static final String Clearpom = "//span[contains(text(),'Clear')]";

	public static final String Modifypombutton = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]";
	public static final String Deletepombutton = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]";

	//SDN
	public static final String SDN = "//div[contains(text(),'SDN Master')]";
	
	public static final String Addsdn = "//input[@value='1']";
	
	public static final String ListNamesdn = "//input[@type='text']";
	
	public static final String Savesdn = "//span[normalize-space()='Save']";
	
	public static final String Clearsdn = "//span[normalize-space()='Clear']";

	
	public static final String Modifysdn = "//input[@value='2']";
	public static final String SDNID = "//input[@id='SDNID']";
	public static final String ModifyListNamesdn = "//input[@placeholder='List Name']";
	public static final String Modifysdnbutton = "//span[@class='MuiButton-label'][normalize-space()='Modify']";
	public static final String Clearsdnbutton = "//span[normalize-space()='Clear']";

	public static final String Deletesdn = "//input[@value='4']";
	public static final String Deletesdnbutton = "//span[@class='MuiButton-label'][normalize-space()='Delete']";

	public static final String Inquiresdn = "//input[@value='8']";

	//SDN Manual Entry
	public static final String Sdnmanual = "//div[contains(text(),'SDN Manual Entry')]";
	
	public static final String sdnmanualadd = "//input[@value='1']";
	public static final String Sdnid = "//input[@id='SDNID']";
	public static final String SDNSRNO = "//input[@id='SDNSRNO']";
	public static final String sdnmanualCustomerName = "//input[@id='NAME']";
	public static final String PassportNo = "//input[@id='PASSPORTNO']";
	public static final String AliasName = "//input[@id='ALIASNAME']";
	public static final String Nationality = "//input[@id='NATIONALITY']";
	public static final String sdnmanualAddress = "//input[@id='ADDRESS']";
	public static final String SocialSecurityNo = "//input[@id='PANNO']";
	public static final String Occupation = "//input[@id='OCCUPATION']";
	public static final String Designation = "//input[@id='DESIGNATION']";
	public static final String DOB = "//input[@id='DOB']";
	public static final String LotNo = "//input[@id='LOTNO']";
	public static final String Religion = "//input[@id='RELIGION']";
	public static final String CautionAdviceNo = "//input[@id='CAUTIONADVICENO']";
	public static final String AGE = "//input[@id='AGE']";
	public static final String sndmanualsubmitbutton = "//span[contains(text(),'Submit')]";
	public static final String sdnmanualclearbutton = "//span[contains(text(),'Clear')]";

	public static final String sdnmanualModifybutton = "//span[@class='MuiButton-label'][normalize-space()='Modify']";
	public static final String sdnmanualdeletebutton = "//span[@class='MuiButton-label'][normalize-space()='Delete']";


	//******************************** ----- (4) SDN Assesment---------************************************		
	public static final String SDNAssesment= "//body/div[@id='root']/div/div/div/div/div/div/div/div/div[@id='main']/div[@id='mySidebar']/div[@id='accordionExample']/ul/li[5]/a[1]/div[1]/div[2]";
	
	
	//Search From SDN
	
	public static final String SearchFromSDN  = "//div[@id='collapseSDNMaster']//div[2]";
	
	public static final String searchSDNID = "//button[@title='Open']//span[1]//*[local-name()='svg']//*[name()='path' and contains(@d,'M7 10l5 5 ')]";
	
	public static final String Dropdownlist = "//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]";
	public static final String Optionfirst = "//*[@aria-autocomplete='list']";
	
	public static final String dropdown = "//button[@title='Open']//span[1]//*[local-name()='svg']";
	
	public static final String searchEnterName = "PanNo"; //id
	public static final String searchsdnid = "BTN_Save"; //id 
	public static final String Clearsdnid = "BTN_Clear"; //id
	
	public static final String Downloadbutton ="//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/span[1]/button[1]/span[1]/span[1]";

	public static final String DownlaodSDN = "//button[@title='Export']//span//span[@aria-hidden='true']"; 
	
	public static final String EXportasPDF = "//body[1]/div[6]/div[3]/ul[1]/li[2]";
	
	

	//********************************** ---- (5) Risk Assesments-------*************************************
	public static final String RiskAssesments = "//body/div[@id='root']/div/div/div/div/div/div/div/div/div[@id='main']/div[@id='mySidebar']/div[@id='accordionExample']/ul/li[6]/a[1]/div[1]/div[2]";

	//Risk Category
	public static final String RiskCategory = "//div[contains(text(),'Risk Category')]";
	public static final String AddRiskCategory = "//input[@value='1']";
	public static final String ModifyRiskCategory = "//input[@value='2']";
	public static final String Category = "//input[@id='category']";
	public static final String MinimumRating = "//input[@id='minrating']";
	public static final String MaximumRating = "//input[@id='maxrating']";
	public static final String Riskweighted = "//input[@id='riskweightage']";
	public static final String OverridingCriteria = "//input[@id='overriddingcriteria']";
	public static final String SaveRiskCategory = "//span[normalize-space()='Save']";
	public static final String ClearRiskCategory = "//button[@id='BTN_Clear']";

	public static final String riskcategoryModify = "//span[@class='MuiButton-label'][normalize-space()='Modify']";
	public static final String riskcategoryDelete = "//span[@class='MuiButton-label'][normalize-space()='Delete']";
	public static final String riskcategoryClear = "//span[contains(text(),'Clear')]";

	//Risk Subcategory
	public static final String RiskSubcategory = "//span[contains(text(),'Risk Subcategory')]";
	public static final String Categoryname = "//input[@id='category']";
	public static final String SubCategoryname = "//input[@id='subcategory']";
	public static final String RiskValuename = "//input[@id='riskvalue']";
	public static final String RiskScorename = "//input[@id='riskscore']";
	public static final String Searchrisksubcat = "//span[normalize-space()='Search']";
	public static final String RiskSubcategorysave = "//span[normalize-space()='Save']";
	public static final String RiskSubcategoryclear = "//span[normalize-space()='Clear']";

	public static final String RiskSubcategorymodify = "//span[@class='MuiButton-label'][normalize-space()='Modify']";
	public static final String RiskSubcategorydelete = "//span[@class='MuiButton-label'][normalize-space()='Delete']";

	//Risk Percentage
	public static final String AddRiskPercentage = "//input[@value='1']";
	public static final String RiskPercentage = "//span[normalize-space()='Risk Percentage']";
	public static final String EffDate = "//input[@id='EffDate']";
	public static final String riskvalue = "//input[@id='riskvalue']";
	public static final String MinimumValue = "//input[@id='minpercentage']";
	public static final String MaximumValue = "//input[@id='maxpercentage']";
	public static final String SearchRiskPercentage = "//span[normalize-space()='Search']";
	public static final String SaveRiskPercentage = "//button[@id='BTN_Save']";
	public static final String ClearRiskPercentage = "//button[@id='BTN_Clear']";

	public static final String ModifyRiskPercentage = "//input[@value='2']";
	public static final String ModifyRiskPercentagebutton = "//span[@class='MuiButton-label'][normalize-space()='Modify']";
	public static final String DeleteRiskPercentagebutton = "//span[@class='MuiButton-label'][normalize-space()='Delete']";

	//Assessment  Report
	public static final String AssessmentReport = "//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[2]/nav[1]/div[10]/div[1]/div[1]/div[1]/a[4]/div[1]/span[1]";
	public static final String CustomerWise = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/fieldset[1]/div[1]/label[1]/span[1]/span[1]/input[1]";
	public static final String CustomerNumber = "//input[@id='CUSTNO']";
	public static final String SearchCustomerwise = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]";
	public static final String ClearCustomerwise = "//span[contains(text(),'Clear')]";

	public static final String RiskCategoryWise = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/fieldset[1]/div[1]/label[2]/span[1]/span[1]/input[1]";
	public static final String RiskCategoryCategoryWise = "//input[@id='CUSTNO']";
	public static final String SearchRiskCategory = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]";
	public static final String ClearRiskCategorywise = "//span[contains(text(),'Clear')]";


	public static final String Datewise = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/fieldset[1]/div[1]/label[3]/span[1]/span[1]/input[1]";
	public static final String Date = "//input[@id='fdate']";
	public static final String Datewisear = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]";
	public static final String ClearDatewise = "//span[contains(text(),'Clear')]";


	public static final String Branchwise = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/fieldset[1]/div[1]/label[4]/span[1]/span[1]/input[1]";
	public static final String Branchwisedata = "//input[@id='fBranch']";
	public static final String SaveBranchwise = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]";
	public static final String ClearBranchwise = "//span[contains(text(),'Clear')]";

	public static final String AccountWise = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/fieldset[1]/div[1]/label[5]/span[1]/span[1]/input[1]";
	public static final String AccountWisepolicynumber = "//input[@id='fACNo']";
	public static final String SaveAccountWise = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]";
	public static final String ClearAccountWise = "//span[contains(text(),'Clear')]";

	public static final String Allfilters = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/fieldset[1]/div[1]/label[6]/span[1]/span[1]/input[1]";
	public static final String Allfilterriskcategory = "//input[@id='FriskCatgory']";
	public static final String AllfilterDate = "//input[@id='fdate']";
	public static final String AllfilterBranch = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]";
	public static final String AllfilterSearch = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]";
	public static final String AllfilterClear = "//span[contains(text(),'Clear')]";


	//********************************** ---- (6) STR Monitoring------ *******************************
	public static final String STRMonitoring = "//body/div[@id='root']/div/div/div/div/div/div/div/div/div[@id='main']/div[@id='mySidebar']/div[@id='accordionExample']/ul/li[7]/a[1]/div[1]/div[2]";

	//Policiewise Summery

	public static final String PoliciewiseSummery = "//div[contains(text(),'Policywise Summary')]";
	public static final String Transactiondate = "//input[@value='1']";
	public static final String FromDate= "//input[@id='fromdate']"; //id
//	public static final String CheckDate = "//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]";
	public static final String ToDate = "//input[@id='todate']";
	public static final String View = "//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]";
	public static final String Clear = "//span[contains(text(),'Clear')]";
	
	
	public static final String EXECUTIONDATE = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[2]/div[1]/label[2]/span[1]/span[1]/input[1]";

	//Reporting On customer
	public static final String ReportingOncustomer= "//span[contains(text(),'Reporting On customer')]";
	public static final String ViewCustInfo= "//span[contains(text(),'View Cust Info')]";
	public static final String PreviousRemarks= "//span[contains(text(),'Previous Remarks')]";
	public static final String Remark= "//input[@id='txtRemark']";
	public static final String GroundOfSuspicion= "//input[@id='key.GroundOfSuspicion']";
	public static final String InvestigationDetails= "//input[@id='key.DocumentAttached']']";
	public static final String RocClear= "//input[@id='key.DocumentAttached']']";

	
	//Report On Risk Rating
	public static final String ReportOnRiskRating= "//span[contains(text(),'Report On Risk Rating')]";
	public static final String CustomerNo= "//input[@id='customerId']";
	public static final String RiskRating = "//input[@id='txtRemark']";
	public static final String Fromdate= "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[1]/div[1]/div[1]/div[4]/div[1]/div[1]/input[1]";
	public static final String Todate= "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[1]/div[1]/div[1]/div[6]/div[1]/div[1]/input[1]";
	public static final String Txnstartdate= "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[1]/div[2]/div[1]/div[4]/div[1]/div[1]/input[1]";
	public static final String TxnEnddate= "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[1]/div[2]/div[1]/div[6]/div[1]/div[1]/input[1]";
	public static final String SearchRRR ="//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[1]/div[3]/div[1]/div[1]/button[1]/span[1]";
	public static final String BackRRR = "//span[contains(text(),'Back')]";


	//Reporting On Transaction 

	public static final String ReportingOnTransaction = "//span[contains(text(),'Reporting On Transaction')]";
	public static final String Clientcode = "//input[@id='customerId']";
	public static final String Customername = "//input[@id='CustName']";
	public static final String SearchOnReporting = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[5]/button[1]/span[1]";
	public static final String ClearOnReporting = "//span[contains(text(),'Clear')]";

	//STR PDF Log
	public static final String STRPDFLog = "//span[contains(text(),'STR PDF Log')]";
	public static final String GENSTR = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/button[1]/span[1]";
	public static final String REGENSTR  = "//span[contains(text(),'Re-Generate STR')]";
	public static final String CustomerNoSTR = "//input[@id='customerId']";
	public static final String TransactionNo = "//input[@id='transaction_id']";
	public static final String SearchSTR = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[5]/button[1]/span[1]";
	public static final String RECUSTNO = "//input[@id='FailedcustomerId']";
	public static final String RESEARCH = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[3]/button[1]/span[1]";

	public static final String CheckCust = "//body[1]/div[1]/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/fieldset[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/span[1]/input[1]";
	public static final String DownloadPDF = "//span[contains(text(),'Download PDF')]";
	public static final String SelectAllCheckbox = "//body[1]/div[1]/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/fieldset[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]/span[1]/span[1]/input[1]";
	public static final String SelectRow = "//div[@id='mui-98028']";
	public static final String SelectRow5 = "//body/div[@id='menu-']/div[3]/ul[1]/li[1]";
	public static final String SelectRow10 = "//body/div[@id='menu-']/div[3]/ul[1]/li[2]";
	public static final String SelectRow20 = "//body/div[@id='menu-']/div[3]/ul[1]/li[3]";
	public static final String FirstPage = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/fieldset[2]/div[1]/div[1]/table[1]/tfoot[1]/tr[1]/td[1]/div[1]/div[3]/span[1]";	
	public static final String LastPage ="//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/fieldset[2]/div[1]/div[1]/table[1]/tfoot[1]/tr[1]/td[1]/div[1]/div[3]/span[5]/button[1]/span[1]/span[1]";
	public static final String Previouspage = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/fieldset[2]/div[1]/div[1]/table[1]/tfoot[1]/tr[1]/td[1]/div[1]/div[3]/span[2]";
	public static final String NextPage = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/fieldset[2]/div[1]/div[1]/table[1]/tfoot[1]/tr[1]/td[1]/div[1]/div[3]/span[4]/button[1]/span[1]/span[1]";

	//************************************ ---- (7) Miscellaneous Report---------****************************************
	public static final String MiscellaneousReport = "//div[contains(text(),'Miscellaneous Report')]";
	
	//Customer Claim Request
	public static final String CustomerClaimRequest = "//div[contains(text(),'Customer Claim Request')]";
	
	public static final String ClientCode = "//*[@id='customerId']/";
	
	//public static final String ClientCode = "//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiAutocomplete-input MuiAutocomplete-inputFocused MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd']";
	
	//public static final String SearchClaimList = "//*[text()='Search']"; 
	public static final String SearchClaimList = "//span[normalize-space()='Search']";
	public static final String ViewCustomerInfo = "//span[normalize-space()='View Customer Info']";
	public static final String SaveReport = "//button[@title='Export']//span//span[@aria-hidden='true']";
	public static final String SearchDataOnReport = "//input[@placeholder='Search']"; 

	//Customer List
	public static final String CustomerDetailsReport  = "//div[contains(text(),'Reported Customers List')]";
	public static final String Customer1 = "//body/div[@id='root']/div/div[@class='MuiBox-root jss24 jss20']/div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12']/div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-1']/div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-lg-12']/div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-1']/div[@id='fin']/span/div[@class='MuiContainer-root finCard MuiContainer-maxWidthLg']/div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12']/fieldset[@id='PKey']/div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12']/div[@class='MuiPaper-root MuiPaper-elevation2 MuiPaper-rounded']/div[@class='jss49']/div/div[@style='overflow-y: auto;']/div/table[@class='MuiTable-root']/tbody[@class='MuiTableBody-root']/tr[1]/td[1]/button[1]";
	
	public static final String Corporate = "//span[normalize-space()='Corporate']";
	public static final String CustomerAddress = "//span[normalize-space()='Address']";
	public static final String Details = "//span[normalize-space()='Details']";
	public static final String Documents = "//span[normalize-space()='Documents']";
	public static final String RelatedParities = "//span[normalize-space()='Related Parities']";
	public static final String Payment = "div.setScreen:nth-child(13) div.MuiBox-root.jss24.jss20 div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12 div.MuiGrid-root.MuiGrid-container.MuiGrid-spacing-xs-1 div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-lg-12:nth-child(2) div.MuiGrid-root.MuiGrid-container.MuiGrid-spacing-xs-1 div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-10.MuiGrid-grid-lg-10:nth-child(2) div.MuiContainer-root.finCard.MuiContainer-maxWidthLg div.MuiGrid-root.MuiGrid-container.MuiGrid-spacing-xs-1 div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12 div.MuiGrid-root.MuiGrid-container.MuiGrid-spacing-xs-1 div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12 div.MuiGrid-root.MuiGrid-container.MuiGrid-spacing-xs-1 div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12:nth-child(2) div.MuiGrid-root.MuiGrid-container.MuiGrid-spacing-xs-1 div.MuiTabs-root div.MuiTabs-scroller.MuiTabs-scrollable div.MuiTabs-flexContainer button.MuiButtonBase-root.MuiTab-root.MuiTab-textColorSecondary:nth-child(7) > span.MuiTab-wrapper";
	public static final String Claim = "//span[normalize-space()='Claim']";
	public static final String Policy = "//span[normalize-space()='Policy']";
	
	public static final String SaveReportofCustomer  = "//span[contains(text(),'save_alt')]";
	public static final String Report1  = "//tbody/tr[1]/td[1]/button[1]";

	//Customer Policy Listing
	public static final String CustomerpolicyListing  = "//div[contains(text(),'Customer Policy Listing')]";
	
	public static final String SearchClientCode  = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/button[1]/span[1]";
	public static final String ExportPolicyList  = "//span[contains(text(),'save_alt')]";


	//Customer Status On STR
	public static final String CustomerStatusSTR  = "//div[contains(text(),'Customer STR Reports')]";
	
	public static final String Branchbased  = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[2]/div[1]/label[1]/span[1]/span[1]/input[1]";
	public static final String Branch  = "//input[@id='combo-box-demo']";
	public static final String TSD  = "//input[@id='EDT_StartDate']";
	public static final String TED  = "//input[@id='EDT_EndDate']";
	public static final String Reportdate  = "//input[@id='EDT_Report_Date']";
	public static final String SearchSTRReport  = "//span[normalize-space()='Search']";
	public static final String ClearSTRReport  = "//span[contains(text(),'Clear')]";
	public static final String ExportSTRReport  =  "//span[contains(text(),'save_alt')]";

	//Payment Approval List
	public static final String PaymentApprovalList  = "//div[contains(text(),'Payment Approval List')]";
	
	public static final String PALClientCode = "//input[@id='customerId']";
	public static final String PALSearch = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/button[1]/span[1]";
	public static final String PALSearchData  = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]";
	public static final String PALExport  = "//span[contains(text(),'save_alt')]";

	//False Positive Customers
	public static final String FalsePositiveCustomers ="//div[contains(text(),'False Positive Customers')]";
	
	public static final String FPCCustomerNo = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]";
	public static final String FPCFromDate = "//input[@id='EDT_StartDate']";		
	public static final String FPCToDate = "//input[@id='EDT_EndDate']";	
	public static final String FPCSearch = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]";
	public static final String FPCClear = "//span[contains(text(),'Clear')]";
	public static final String FPCSearchData = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]";
	public static final String FPExport = "//span[contains(text(),'save_alt')]";


	//Rejected Customer
	public static final String RejectedCustomer = "//div[contains(text(),'Rejected Customer')]";
	
	public static final String RCNO = "//input[@id='customerId']";
	public static final String RCFromDate = "//input[@id='EDT_StartDate']";
	public static final String RCToDate = "EDT_EndDate"; //id
	public static final String RCSearch = "//button[@id='BTN_Save']";
	public static final String RCClear = "//span[contains(text(),'Clear')]";
	public static final String RCSearchData = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]";
	public static final String RCExport = "//span[contains(text(),'save_alt')]";		


	//Case Management
	public static final String CM = "//span[contains(text(),'Case Management')]";
	public static final String CMCUSTNUMBER = "//input[@id='customerId']";
	public static final String CMFromDate = "//input[@id='EDT_StartDate']";	
	public static final String CMToDate = "//input[@id='EDT_EndDate']";	
	public static final String CMCaseID = "//input[@id='CaseId']";	
	public static final String CMStatus = "//input[@id='Status']";	
	public static final String CMSearch = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]";
	public static final String CMClear = "//span[contains(text(),'Clear')]";
	public static final String CMSearchData = "//body/div[@id='root']/div[2]/div[1]/main[1]/div[2]/span[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]";
	public static final String CMExport = "//span[contains(text(),'save_alt')]";

}
