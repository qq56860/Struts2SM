package cn.domain;

import java.io.Serializable;
import java.util.Date;

public class TOssAccount implements Serializable {
    private String id;

    private String adpterId;

    private String uPhone;

    private String enterpriseName;

    private String enterpriseNum;

    private String mPhone;

    private Integer accountType;

    private Date createTime;

    private String enterpriseCode;

    private String mName;

    private String billType;

    private String licenseType;

    private Integer yqtLicense;

    private Integer restAmount;

    private Date startDate;

    private Date endDate;

    private Integer adrLicense;

    private String isOpenSms;

    private String bossMachineType;

    private String bossAreaCode;

    private String bossNumber;

    private String outbound;

    private String chinamobileBossNumber;

    private String chinamobileRelayNumber;

    private String chinaunicomBossNumber;

    private String chinaunicomRelayNumber;

    private String chinatelecomBossNumber;

    private String chinatelecomRelayNumber;

	private String startDateStr;
    
    private String endDateStr;

    public String getStartDateStr() {
		return startDateStr;
	}

	public void setStartDateStr(String startDateStr) {
		this.startDateStr = startDateStr;
	}

	public String getEndDateStr() {
		return endDateStr;
	}

	public void setEndDateStr(String endDateStr) {
		this.endDateStr = endDateStr;
	}
	
    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAdpterId() {
        return adpterId;
    }

    public void setAdpterId(String adpterId) {
        this.adpterId = adpterId == null ? null : adpterId.trim();
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    public String getEnterpriseNum() {
        return enterpriseNum;
    }

    public void setEnterpriseNum(String enterpriseNum) {
        this.enterpriseNum = enterpriseNum == null ? null : enterpriseNum.trim();
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone == null ? null : mPhone.trim();
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode == null ? null : enterpriseCode.trim();
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType == null ? null : billType.trim();
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType == null ? null : licenseType.trim();
    }

    public Integer getYqtLicense() {
        return yqtLicense;
    }

    public void setYqtLicense(Integer yqtLicense) {
        this.yqtLicense = yqtLicense;
    }

    public Integer getRestAmount() {
        return restAmount;
    }

    public void setRestAmount(Integer restAmount) {
        this.restAmount = restAmount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getAdrLicense() {
        return adrLicense;
    }

    public void setAdrLicense(Integer adrLicense) {
        this.adrLicense = adrLicense;
    }

    public String getIsOpenSms() {
        return isOpenSms;
    }

    public void setIsOpenSms(String isOpenSms) {
        this.isOpenSms = isOpenSms == null ? null : isOpenSms.trim();
    }

    public String getBossMachineType() {
        return bossMachineType;
    }

    public void setBossMachineType(String bossMachineType) {
        this.bossMachineType = bossMachineType == null ? null : bossMachineType.trim();
    }

    public String getBossAreaCode() {
        return bossAreaCode;
    }

    public void setBossAreaCode(String bossAreaCode) {
        this.bossAreaCode = bossAreaCode == null ? null : bossAreaCode.trim();
    }

    public String getBossNumber() {
        return bossNumber;
    }

    public void setBossNumber(String bossNumber) {
        this.bossNumber = bossNumber == null ? null : bossNumber.trim();
    }

    public String getOutbound() {
        return outbound;
    }

    public void setOutbound(String outbound) {
        this.outbound = outbound == null ? null : outbound.trim();
    }

    public String getChinamobileBossNumber() {
        return chinamobileBossNumber;
    }

    public void setChinamobileBossNumber(String chinamobileBossNumber) {
        this.chinamobileBossNumber = chinamobileBossNumber  == null ? null : chinamobileBossNumber.trim();;
    }

    public String getChinamobileRelayNumber() {
        return chinamobileRelayNumber;
    }

    public void setChinamobileRelayNumber(String chinamobileRelayNumber) {
        this.chinamobileRelayNumber = chinamobileRelayNumber  == null ? null : chinamobileRelayNumber.trim();;
    }

    public String getChinaunicomBossNumber() {
        return chinaunicomBossNumber;
    }

    public void setChinaunicomBossNumber(String chinaunicomBossNumber) {
        this.chinaunicomBossNumber = chinaunicomBossNumber  == null ? null : chinaunicomBossNumber.trim();;
    }

    public String getChinaunicomRelayNumber() {
        return chinaunicomRelayNumber;
    }

    public void setChinaunicomRelayNumber(String chinaunicomRelayNumber) {
        this.chinaunicomRelayNumber = chinaunicomRelayNumber  == null ? null : chinaunicomRelayNumber.trim();;
    }

    public String getChinatelecomBossNumber() {
        return chinatelecomBossNumber;
    }

    public void setChinatelecomBossNumber(String chinatelecomBossNumber) {
        this.chinatelecomBossNumber = chinatelecomBossNumber  == null ? null : chinatelecomBossNumber.trim();;
    }

    public String getChinatelecomRelayNumber() {
        return chinatelecomRelayNumber;
    }

    public void setChinatelecomRelayNumber(String chinatelecomRelayNumber) {
        this.chinatelecomRelayNumber = chinatelecomRelayNumber  == null ? null : chinatelecomRelayNumber.trim();;
    }
}