package org.epragati.vcr.vo;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import org.epragati.constants.OwnerTypeEnum;
import org.epragati.master.vo.MasterCovVO;
import org.epragati.master.vo.StateVO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class RegistrationVcrVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean unregisteredVehicle;
	private boolean otherState;
	private boolean engineNoAndChessisNoNotAvailable;
	private boolean transport;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate trValidity;
	private Integer invoiceAmmount;
	@NotNull(message = "tempRegNoOrChessisNo are required.")
	private String regNo;
	@NotNull(message = "state are required.")
	private StateVO state;
	@NotNull(message = "classsOfVehicle are required.")
	private MasterCovVO classsOfVehicle;
	private String incomingOrOutgoing;
	private String chassisNumber;
	private String engineNumber;
	private int seatingCapacity;
	private Integer gvwc;
	private Integer gvw;
	private Integer ulw;
	private String trNo;
	private String regApplicationNo;
	private boolean otherStateRegister;
	private boolean otherStateUnregister;
	private String fuelDesc;
	private OwnerTypeEnum ownerType;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate taxCalculationDateForLifeTax;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate prGeneratedDate;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate trGeneratedDate;
	
	
	//Voluntary Tax
	private String cov;
	private String seats;
	private String makersModel;
	private Double invoiceValue;
	private boolean isFirstVehicle ;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfCompletion;
	private String taxType;
	private boolean nocIssued;
	private boolean withTP;
	private LocalDate nocDate;
	private Boolean firstVehicle;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate fcValidity;
	private boolean vehicleHaveAitp;
	private String bodyTypeDesc;
	private LocalDate taxCalculationDateForQuarterlyTax;

	

	public boolean isUnregisteredVehicle() {
		return unregisteredVehicle;
	}

	public void setUnregisteredVehicle(boolean unregisteredVehicle) {
		this.unregisteredVehicle = unregisteredVehicle;
	}

	public boolean isOtherState() {
		return otherState;
	}

	public void setOtherState(boolean otherState) {
		this.otherState = otherState;
	}

	public boolean isEngineNoAndChessisNoNotAvailable() {
		return engineNoAndChessisNoNotAvailable;
	}

	public void setEngineNoAndChessisNoNotAvailable(boolean engineNoAndChessisNoNotAvailable) {
		this.engineNoAndChessisNoNotAvailable = engineNoAndChessisNoNotAvailable;
	}

	public boolean isTransport() {
		return transport;
	}

	public void setTransport(boolean transport) {
		this.transport = transport;
	}

	public LocalDate getTrValidity() {
		return trValidity;
	}

	public void setTrValidity(LocalDate trValidity) {
		this.trValidity = trValidity;
	}

	public Integer getInvoiceAmmount() {
		return invoiceAmmount;
	}

	public void setInvoiceAmmount(Integer invoiceAmmount) {
		this.invoiceAmmount = invoiceAmmount;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public StateVO getState() {
		return state;
	}

	public void setState(StateVO state) {
		this.state = state;
	}

	public MasterCovVO getClasssOfVehicle() {
		return classsOfVehicle;
	}

	public void setClasssOfVehicle(MasterCovVO classsOfVehicle) {
		this.classsOfVehicle = classsOfVehicle;
	}

	public String getIncomingOrOutgoing() {
		return incomingOrOutgoing;
	}

	public void setIncomingOrOutgoing(String incomingOrOutgoing) {
		this.incomingOrOutgoing = incomingOrOutgoing;
	}

	public String getChassisNumber() {
		return chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	public String getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public Integer getGvwc() {
		return gvwc;
	}

	public void setGvwc(Integer gvwc) {
		this.gvwc = gvwc;
	}

	public Integer getUlw() {
		return ulw;
	}

	public void setUlw(Integer ulw) {
		this.ulw = ulw;
	}

	public String getRegApplicationNo() {
		return regApplicationNo;
	}

	public void setRegApplicationNo(String regApplicationNo) {
		this.regApplicationNo = regApplicationNo;
	}
	
	public boolean isOtherStateRegister() {
		return otherStateRegister;
	}

	public void setOtherStateRegister(boolean otherStateRegister) {
		this.otherStateRegister = otherStateRegister;
	}

	public boolean isOtherStateUnregister() {
		return otherStateUnregister;
	}

	public void setOtherStateUnregister(boolean otherStateUnregister) {
		this.otherStateUnregister = otherStateUnregister;
	}

	public String getFuelDesc() {
		return fuelDesc;
	}

	public void setFuelDesc(String fuelDesc) {
		this.fuelDesc = fuelDesc;
	}

	public OwnerTypeEnum getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(OwnerTypeEnum ownerType) {
		this.ownerType = ownerType;
	}

	public LocalDate getTaxCalculationDateForLifeTax() {
		return taxCalculationDateForLifeTax;
	}

	public void setTaxCalculationDateForLifeTax(LocalDate taxCalculationDateForLifeTax) {
		this.taxCalculationDateForLifeTax = taxCalculationDateForLifeTax;
	}

	public LocalDate getPrGeneratedDate() {
		return prGeneratedDate;
	}

	public void setPrGeneratedDate(LocalDate prGeneratedDate) {
		this.prGeneratedDate = prGeneratedDate;
	}

	public String getTrNo() {
		return trNo;
	}

	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}

	public String getMakersModel() {
		return makersModel;
	}

	public void setMakersModel(String makersModel) {
		this.makersModel = makersModel;
	}

	public Double getInvoiceValue() {
		return invoiceValue;
	}

	public void setInvoiceValue(Double invoiceValue) {
		this.invoiceValue = invoiceValue;
	}

	public boolean isFirstVehicle() {
		return isFirstVehicle;
	}

	public void setFirstVehicle(boolean isFirstVehicle) {
		this.isFirstVehicle = isFirstVehicle;
	}

	public LocalDate getDateOfCompletion() {
		return dateOfCompletion;
	}

	public void setDateOfCompletion(LocalDate dateOfCompletion) {
		this.dateOfCompletion = dateOfCompletion;
	}

	public String getCov() {
		return cov;
	}

	public void setCov(String cov) {
		this.cov = cov;
	}

	public String getTaxType() {
		return taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public boolean isNocIssued() {
		return nocIssued;
	}

	public void setNocIssued(boolean nocIssued) {
		this.nocIssued = nocIssued;
	}

	public boolean isWithTP() {
		return withTP;
	}

	public void setWithTP(boolean withTP) {
		this.withTP = withTP;
	}

	public LocalDate getNocDate() {
		return nocDate;
	}

	public void setNocDate(LocalDate nocDate) {
		this.nocDate = nocDate;
	}

	public Boolean getFirstVehicle() {
		return firstVehicle;
	}

	public void setFirstVehicle(Boolean firstVehicle) {
		this.firstVehicle = firstVehicle;
	}

	public LocalDate getFcValidity() {
		return fcValidity;
	}

	public void setFcValidity(LocalDate fcValidity) {
		this.fcValidity = fcValidity;
	}

	public Integer getGvw() {
		return gvw;
	}

	public void setGvw(Integer gvw) {
		this.gvw = gvw;
	}

	public boolean isVehicleHaveAitp() {
		return vehicleHaveAitp;
	}

	public void setVehicleHaveAitp(boolean vehicleHaveAitp) {
		this.vehicleHaveAitp = vehicleHaveAitp;
	}

	public LocalDate getTrGeneratedDate() {
		return trGeneratedDate;
	}

	public void setTrGeneratedDate(LocalDate trGeneratedDate) {
		this.trGeneratedDate = trGeneratedDate;
	}

	public String getBodyTypeDesc() {
		return bodyTypeDesc;
	}

	public void setBodyTypeDesc(String bodyTypeDesc) {
		this.bodyTypeDesc = bodyTypeDesc;
	}




	public LocalDate getTaxCalculationDateForQuarterlyTax() {
		return taxCalculationDateForQuarterlyTax;
	}

	public void setTaxCalculationDateForQuarterlyTax(LocalDate taxCalculationDateForQuarterlyTax) {
		this.taxCalculationDateForQuarterlyTax = taxCalculationDateForQuarterlyTax;
	}


	
}
