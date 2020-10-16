/**
 * @author krishnarjun.pampana
 */
package org.epragati.master.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonInclude(Include.NON_NULL)
public class MasterInfoVO {

	private List<OwnershipVO> ownershipVO;

	private List<QualificationVO> qualificationVO;

	private List<BloodGroupVO> bloodGroupVO;

	private List<DealerCovVO> dealerCovVO;

	// private List<DealerMakerClassVO> dealerMakerClass;

	private List<MasterCovVO> masterCovVO;

	private List<MasterVariantVO> masterVariantVO;

	private List<BodyTypeVO> bodyTypeVO;

	private List<MakersVO> DealerMakerVO;

	private List<TaxTypeVO> taxType;

	private List<InsuranceCompanyVO> insuranceCompanyVO;

	private List<GateWayVO> gateWayVO;

	private List<CategoryVO> categoryVO;

	private List<CountryVO> countryVO;

	private List<InsuranceTypeVO> insuranceTypeVO;

	private List<DealerAndVahanMappedCovVO> dealerAndVahanMappedCov;

	private List<MasterFinanceTypeVO> financeTypeVO; 


	/**
	 * @return the masterCovVO
	 */
	public List<MasterCovVO> getMasterCovVO() {
		return masterCovVO;
	}

	/**
	 * @param masterCovVO the masterCovVO to set
	 */
	public void setMasterCovVO(List<MasterCovVO> masterCovVO) {
		this.masterCovVO = masterCovVO;
	}

	/**
	 * @return the financeTypeVO
	 */
	public List<MasterFinanceTypeVO> getFinanceTypeVO() {
		return financeTypeVO;
	}

	/**
	 * @param financeTypeVO the financeTypeVO to set
	 */
	public void setFinanceTypeVO(List<MasterFinanceTypeVO> financeTypeVO) {
		this.financeTypeVO = financeTypeVO;
	}

	/**
	 * @return the ownershipVO
	 */
	public List<OwnershipVO> getOwnershipVO() {
		return ownershipVO;
	}

	/**
	 * @param ownershipVO
	 *            the ownershipVO to set
	 */
	public void setOwnershipVO(List<OwnershipVO> ownershipVO) {
		this.ownershipVO = ownershipVO;
	}

	/**
	 * @return the qualificationVO
	 */
	public List<QualificationVO> getQualificationVO() {
		return qualificationVO;
	}

	/**
	 * @param qualificationVO
	 *            the qualificationVO to set
	 */
	public void setQualificationVO(List<QualificationVO> qualificationVO) {
		this.qualificationVO = qualificationVO;
	}

	/**
	 * @return the bloodGroupVO
	 */
	public List<BloodGroupVO> getBloodGroupVO() {
		return bloodGroupVO;
	}

	/**
	 * @param bloodGroupVO
	 *            the bloodGroupVO to set
	 */
	public void setBloodGroupVO(List<BloodGroupVO> bloodGroupVO) {
		this.bloodGroupVO = bloodGroupVO;
	}

	/**
	 * @return the dealerCovVO
	 */
	public List<DealerCovVO> getDealerCovVO() {
		return dealerCovVO;
	}

	/**
	 * @param dealerCovVO
	 *            the dealerCovVO to set
	 */
	public void setDealerCovVO(List<DealerCovVO> dealerCovVO) {
		this.dealerCovVO = dealerCovVO;
	}

	/**
	 * @return the masterVariantVO
	 */
	public List<MasterVariantVO> getMasterVariantVO() {
		return masterVariantVO;
	}

	/**
	 * @param masterVariantVO
	 *            the masterVariantVO to set
	 */
	public void setMasterVariantVO(List<MasterVariantVO> masterVariantVO) {
		this.masterVariantVO = masterVariantVO;
	}

	/**
	 * @return the bodyTypeVO
	 */
	public List<BodyTypeVO> getBodyTypeVO() {
		return bodyTypeVO;
	}

	/**
	 * @param bodyTypeVO
	 *            the bodyTypeVO to set
	 */
	public void setBodyTypeVO(List<BodyTypeVO> bodyTypeVO) {
		this.bodyTypeVO = bodyTypeVO;
	}

	/**
	 * @return the dealerMakerVO
	 */
	public List<MakersVO> getDealerMakerVO() {
		return DealerMakerVO;
	}

	/**
	 * @param dealerMakerVO
	 *            the dealerMakerVO to set
	 */
	public void setDealerMakerVO(List<MakersVO> dealerMakerVO) {
		DealerMakerVO = dealerMakerVO;
	}

	/**
	 * @return the taxType
	 */
	public List<TaxTypeVO> getTaxType() {
		return taxType;
	}

	/**
	 * @param taxType
	 *            the taxType to set
	 */
	public void setTaxType(List<TaxTypeVO> taxType) {
		this.taxType = taxType;
	}

	/**
	 * @return the insuranceCompanyVO
	 */
	public List<InsuranceCompanyVO> getInsuranceCompanyVO() {
		return insuranceCompanyVO;
	}

	/**
	 * @param insuranceCompanyVO
	 *            the insuranceCompanyVO to set
	 */
	public void setInsuranceCompanyVO(List<InsuranceCompanyVO> insuranceCompanyVO) {
		this.insuranceCompanyVO = insuranceCompanyVO;
	}

	/**
	 * @return the gateWayVO
	 */
	public List<GateWayVO> getGateWayVO() {
		return gateWayVO;
	}

	/**
	 * @param gateWayVO
	 *            the gateWayVO to set
	 */
	public void setGateWayVO(List<GateWayVO> gateWayVO) {
		this.gateWayVO = gateWayVO;
	}

	/**
	 * @return the categoryVO
	 */
	public List<CategoryVO> getCategoryVO() {
		return categoryVO;
	}

	/**
	 * @param categoryVO
	 *            the categoryVO to set
	 */
	public void setCategoryVO(List<CategoryVO> categoryVO) {
		this.categoryVO = categoryVO;
	}

	/**
	 * @return the countryVO
	 */
	public List<CountryVO> getCountryVO() {
		return countryVO;
	}

	/**
	 * @param countryVO
	 *            the countryVO to set
	 */
	public void setCountryVO(List<CountryVO> countryVO) {
		this.countryVO = countryVO;
	}

	/**
	 * @return the insuranceTypeVO
	 */
	public List<InsuranceTypeVO> getInsuranceTypeVO() {
		return insuranceTypeVO;
	}

	/**
	 * @param insuranceTypeVO
	 *            the insuranceTypeVO to set
	 */
	public void setInsuranceTypeVO(List<InsuranceTypeVO> insuranceTypeVO) {
		this.insuranceTypeVO = insuranceTypeVO;
	}

	public List<DealerAndVahanMappedCovVO> getDealerAndVahanMappedCov() {
		return dealerAndVahanMappedCov;
	}

	public void setDealerAndVahanMappedCov(List<DealerAndVahanMappedCovVO> dealerAndVahanMappedCov) {
		this.dealerAndVahanMappedCov = dealerAndVahanMappedCov;
	}

}