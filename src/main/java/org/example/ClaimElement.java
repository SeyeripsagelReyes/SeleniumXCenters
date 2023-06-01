package org.example;



public class ClaimElement {

    // LOGIN PAGE
    final static String USERNAME_TEXT = "//*[@id=\"Login-LoginScreen-LoginDV-username\"]/div/input";
    final static String PASSWORD_TEXT = "//*[@id=\"Login-LoginScreen-LoginDV-password\"]/div[1]/input";
    final static String LOGIN_BUTTON  = "//*[@id=\"Login-LoginScreen-LoginDV-submit\"]/div";


    public static class Tab{//Tab Bar
        final static String SEARCH_BUTTON = "//*[@id=\"TabBar-SearchTab\"]/div[1]";
        final static String CLAIM_BUTTON = "//*[@id=\"TabBar-ClaimTab\"]/div[3]";
        final static String FNOL_BUTTON = "//*[@id=\"TabBar-ClaimTab-ClaimTab_FNOLWizard\"]/div";
        final static String FINDCLAIM_TEXT = "//*[@id=\"TabBar-ClaimTab-ClaimTab_FindClaim\"]/div/input";
        final static String FINDCLAIM_BUTTON = "//*[@id=\"TabBar-ClaimTab-ClaimTab_FindClaim_Button\"]";

    }

    public static class Menu{
        final static String LOSS_DETAILS = "//*[@id=\"Claim-MenuLinks-Claim_ClaimLossDetailsGroup\"]/div[1]";
    }

    public static class LossDetails{
        final static String EDIT_BUTTON = "//*[@id=\"ClaimLossDetails-ClaimLossDetailsScreen-Edit\"]/div";
        final static String DESCRIPTION_TEXT = "//*[@id=\"ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-OccurrenceDescription\"]/div/textarea";
        final static String UPDATE_BUTTON = "//*[@id=\"ClaimLossDetails-ClaimLossDetailsScreen-Update\"]/div";
    }


    public static class Search { //Claim Search
        final static String ASSIGN_BUTTON ="//*[@id=\"SimpleClaimSearch-SimpleClaimSearchScreen-SimpleClaimSearchResultsLV_tb-ClaimSearchScreen_AssignButton\"]/div/div[2]";
        final static String FOR_SELECT = "//*[@id=\"SimpleClaimSearch-SimpleClaimSearchScreen-SimpleClaimSearchDV-SearchFor\"]/div/div/select";
        final static String FNAME_TEXT = "//*[@id=\"SimpleClaimSearch-SimpleClaimSearchScreen-SimpleClaimSearchDV-GlobalPersonNameInputSet-FirstName\"]/div/input";
        final static String RESULT_CHECK = "//input[@type='checkbox'][@aria-label='select row']";
        final static String SEARCH_BUTTON = "//*[@id=\"SimpleClaimSearch-SimpleClaimSearchScreen-SimpleClaimSearchDV-ClaimSearchAndResetInputSet-Search\"]";
    }

    public static class Assign {
        final static String FROM_LIST = "//*[@id=\"AssignClaimsPopup-AssignmentPopupScreen-AssignmentPopupDV-SelectFromList\"]/div/div/select";

    }

    public static class FNOL{
        final static String ORGANIZATION_TEXT = "//*[@id=\"FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-GlobalContactNameInputSet-Name\"]/div/input";
        final static String SEARCH_BUTTON = "//*[@id=\"FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-Search\"]";
        final static String RESULT_CHECK = "//div[@class='gw-LinkWidget gw-styleTag--LinkCellWidget gw-mini-button gw-actionable']";
        final static String LOSS_DATE = "//*[@id='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-Claim_LossDate']/div/input";
        final static String NEXT_BUTTON = "//*[@id=\"FNOLWizard-Next\"]/div";
        final static String NAME_BUTTON = "//*[@id='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-ReportedBy_Name-ReportedBy_NameMenuIcon']/div[1]";
        final static String NEWPERSON_BUTTON = "//*[@id='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-ReportedBy_Name-ClaimNewPersonOnlyPickerMenuItemSet-ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem']/div";
        final static String REPORTED_SELECT = "//*[@id='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-Claim_ReportedByType']/div/div/select";
        final static String CLAIMANT_SELECT = "//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-Claimant_Name\"]/div[1]/div/select";
        final static String REPORTED_DATE = "//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-DateReportedtoEmployer\"]/div/input[1]";
        final static String TIMELOSS_RADIO = "//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-InjurySeverity_TimeLossReport_0\"]";
        final static String ADDRESS_SELECT = "//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-CCAddressInputSet-globalAddressContainer-Address_Picker\"]/div/div/select";
        final static String DEATH_RADIO = "//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-InjurySeverity_DeathReport_1\"]";
        final static String INJURY_SELECT = "//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_InjuryIllnessCause\"]/div/div/select";
        final static String MEDICAL_RADIO = "//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-InjurySeverity_MedicalReport_0\"]";
        final static String FINISH_BUTTON = "//*[@id=\"FNOLWizard-Finish\"]/div";

    }

    public static class CONTACT{
        final static String LNAME_TEXT = "//*[@id='NewContactPopup-ContactDetailScreen-ContactBasicsDV-PersonNameInputSet-GlobalPersonNameInputSet-LastName']/div/input";
        final static String UPDATE_BUTTON = "//*[@id='NewContactPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-CustomUpdateButton']/div";
    }

}
