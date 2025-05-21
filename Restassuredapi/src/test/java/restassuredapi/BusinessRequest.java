package restassuredapi;



import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Time;
import java.util.List;


public class BusinessRequest {

    @JsonProperty("request_type")
    private String requestType;
    @JsonProperty("ref_id")
    private String refId;
    private String name;
    @JsonProperty("work_number")
    private String workNumber;
    @JsonProperty("owner_name")
    private String ownerName;
    @JsonProperty("mobile_number")
    private String mobileNumber;
    private String email;
    @JsonProperty("account_type")
    private String accountType;
    private String industry;
    private String lat;
    private String lon; // "long" is a reserved keyword in Java
    private String address;
    private String area;
    private String city;
    private String state;
    private String landmark;
    private String pincode;
    @JsonProperty("postal_code")
    private String postalCode;
    private String panNo;
    @JsonProperty("pan_doc")
    private String panDoc;
    @JsonProperty("aadhar_no")
    private String aadharNo;
    @JsonProperty("aadhar_doc")
    private String aadharDoc;
    @JsonProperty("gst_no")
    private String gstNo;
    @JsonProperty("gst_doc")
    private String gstDoc;
    @JsonProperty("business_logo")
    private String businessLogo;
    private List<String> logo;
    @JsonProperty("logo_bw")
    private List<String> logoBw;
    private List<String> favicon;
    @JsonProperty("business_images")
    private List<String> businessImages;
    private List<Timing> timings;
    

    // Getters and Setters
    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public String getPanDoc() {
        return panDoc;
    }

    public void setPanDoc(String panDoc) {
        this.panDoc = panDoc;
    }

    public String getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }

    public String getAadharDoc() {
        return aadharDoc;
    }

    public void setAadharDoc(String aadharDoc) {
        this.aadharDoc = aadharDoc;
    }

    public String getGstNo() {
        return gstNo;
    }

    public void setGstNo(String gstNo) {
        this.gstNo = gstNo;
    }

    public String getGstDoc() {
        return gstDoc;
    }

    public void setGstDoc(String gstDoc) {
        this.gstDoc = gstDoc;
    }

    public String getBusinessLogo() {
        return businessLogo;
    }

    public void setBusinessLogo(String businessLogo) {
        this.businessLogo = businessLogo;
    }

    public List<String> getLogo() {
        return logo;
    }

    public void setLogo(List<String> logo) {
        this.logo = logo;
    }

    public List<String> getLogoBw() {
        return logoBw;
    }

    public void setLogoBw(List<String> logoBw) {
        this.logoBw = logoBw;
    }

    public List<String> getFavicon() {
        return favicon;
    }

    public void setFavicon(List<String> favicon) {
        this.favicon = favicon;
    }

    public List<String> getBusinessImages() {
        return businessImages;
    }

    public void setBusinessImages(List<String> businessImages) {
        this.businessImages = businessImages;
    }
    public void setTimings(List<Timing> timings) {
        this.timings = timings;
    }


    public List<Timing> getTimings() {
        return timings;
    }
 
   
}
