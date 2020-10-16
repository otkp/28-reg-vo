package org.epragati.tax.vo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum TaxTypeEnum {

	LifeTax("L", "LifeTax"), QuarterlyTax("Q", "QuarterlyTax"), HalfyearlyTax("H", "HalfyearlyTax"),
	YearlyTax("Y", "YearlyTax"), BOTH("B", "Both L&Q Tax"), CESS("CESS", "CESSFEE"), GreenTax("G", "GreenTax");

	private String code;
	private String desc;

	TaxTypeEnum(String code, String description) {
		this.code = code;
		this.desc = description;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getdesc(String code) {
		if (code.equalsIgnoreCase(TaxTypeEnum.LifeTax.getCode())) {
			return TaxTypeEnum.LifeTax.getDesc();
		} else if (code.equalsIgnoreCase(TaxTypeEnum.QuarterlyTax.getCode())) {
			return TaxTypeEnum.QuarterlyTax.getDesc();
		} else if (code.equalsIgnoreCase(TaxTypeEnum.HalfyearlyTax.getCode())) {
			return TaxTypeEnum.HalfyearlyTax.getDesc();
		} else {
			return TaxTypeEnum.YearlyTax.getDesc();
		}

	}

	public static TaxTypeEnum getTaxTypeEnumByCode(String code) {
		if (code == null) {
			return null;
		}
		return Arrays.stream(TaxTypeEnum.values()).filter(statusEnum -> statusEnum.getCode().equals(code)).findAny()
				.orElse(null);

	}

	public enum TaxPayType {
		REG("REG"), DIFF("DIFF"), DCBUPDATE("DCBUPDATE");

		private String name;

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		private TaxPayType(String name) {
			this.name = name;
		}

	}

	public enum ExcemptionsType {
		QUATER("QUATER"), PERCENTAGE("PERCENTAGE"), DIRECTTAXAMOUNT("DIRECTTAXAMOUNT"), COV("COV"),
		COVANDPERMIT("COVANDPERMIT");

		private String name;

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		private ExcemptionsType(String name) {
			this.name = name;
		}
	}

	public enum TaxModule {
		PENALTY("PENALTY"), PENALTYARREARS("PENALTYARREARS"), TAX("TAX"), TAXARREARS("TAXARREARS");

		private String name;

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		private TaxModule(String name) {
			this.name = name;
		}

	}

	public enum CfstTaxType {

		QLY("QLY", "QuarterlyTax"), HLY("HLY", "HalfyearlyTax"), ANN("ANN", "YearlyTax"), LTT("LTT", "LifeTax"),
		CESS("CESS", "CESSFEE"), GreenTax("GreenTax", "GreenTax");
		private String code;
		private String desc;

		CfstTaxType(String code, String description) {
			this.code = code;
			this.desc = description;
		}

		/**
		 * @return the code
		 */
		public String getCode() {
			return code;
		}

		/**
		 * @param code the code to set
		 */
		public void setCode(String code) {
			this.code = code;
		}

		/**
		 * @return the desc
		 */
		public String getDesc() {
			return desc;
		}

		/**
		 * @param desc the desc to set
		 */
		public void setDesc(String desc) {
			this.desc = desc;
		}

		public static String getdesc(String code) {
			if (code.equalsIgnoreCase(CfstTaxType.LTT.getCode())) {
				return CfstTaxType.LTT.getDesc();
			} else if (code.equalsIgnoreCase(CfstTaxType.QLY.getCode())) {
				return CfstTaxType.QLY.getDesc();
			} else if (code.equalsIgnoreCase(CfstTaxType.HLY.getCode())) {
				return CfstTaxType.HLY.getDesc();
			} else if (code.equalsIgnoreCase(CfstTaxType.ANN.getCode())) {
				return CfstTaxType.ANN.getDesc();
			} else if (code.equalsIgnoreCase(CfstTaxType.CESS.getCode())) {
				return CfstTaxType.CESS.getDesc();
			} else if (code.equalsIgnoreCase(CfstTaxType.GreenTax.getCode())) {
				return CfstTaxType.GreenTax.getDesc();
			}
			return "";
		}

		public static CfstTaxType getTaxTypeEnumByCode(String code) {
			if (code == null) {
				return null;
			}
			return Arrays.stream(CfstTaxType.values()).filter(statusEnum -> statusEnum.getCode().equals(code)).findAny()
					.orElse(null);

		}
	}

	public enum VoluntaryTaxType {
		Quarterly("Quarterly", 90, "QuarterlyTax"), Halfyearly("Halfyearly", 180, "HalfyearlyTax"),
		Annual("Annual", 360, "YearlyTax"), SevenDays("7 Days", 7, "SevenDaysTax"),
		/*FifteenDays("15 Days", 15, "FifteenDaysTax"),*/ ThirtyDays("30 Days", 30, "ThirtyDaysTax"),
		BorderTax("Border Tax", 1, "BorderTax"), LifeTax("Life Tax", 4320, "LifeTax"),
		OneYear("OneYear", 365, "YearlyTax");

		private String desc;
		private Integer days;
		private String taxType;

		private VoluntaryTaxType(String desc, Integer days, String taxType) {
			this.desc = desc;
			this.days = days;
			this.taxType = taxType;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public Integer getDays() {
			return days;
		}

		public void setDays(Integer days) {
			this.days = days;
		}

		public String getTaxType() {
			return taxType;
		}

		public void setTaxType(String taxType) {
			this.taxType = taxType;
		}

		public static String getType(String desc) {
			if (desc.equalsIgnoreCase(VoluntaryTaxType.Quarterly.getDesc())) {
				return VoluntaryTaxType.Quarterly.getTaxType();
			} else if (desc.equalsIgnoreCase(VoluntaryTaxType.Halfyearly.getDesc())) {
				return VoluntaryTaxType.Halfyearly.getTaxType();
			} else if (desc.equalsIgnoreCase(VoluntaryTaxType.Annual.getDesc())) {
				return VoluntaryTaxType.Annual.getTaxType();
			} else if (desc.equalsIgnoreCase(VoluntaryTaxType.SevenDays.getDesc())) {
				return VoluntaryTaxType.SevenDays.getTaxType();
			} /*else if (desc.equalsIgnoreCase(VoluntaryTaxType.FifteenDays.getDesc())) {
				return VoluntaryTaxType.FifteenDays.getTaxType();
			}*/ else if (desc.equalsIgnoreCase(VoluntaryTaxType.ThirtyDays.getDesc())) {
				return VoluntaryTaxType.ThirtyDays.getTaxType();
			} else if (desc.equalsIgnoreCase(VoluntaryTaxType.BorderTax.getDesc())) {
				return VoluntaryTaxType.BorderTax.getTaxType();
			} else if (desc.equalsIgnoreCase(VoluntaryTaxType.LifeTax.getDesc())) {
				return VoluntaryTaxType.LifeTax.getTaxType();
			} else if (desc.equalsIgnoreCase(VoluntaryTaxType.OneYear.getDesc())) {
				return VoluntaryTaxType.OneYear.getTaxType();
			}
			return "";
		}
	}

	public enum reconcilationEnum {
		CF("CF"), TAX("TAX");

		private reconcilationEnum(String desc) {
			this.desc = desc;
		}

		private String desc;

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

	}

	public enum permitTaxType {

		SPTAX("spTax"), TPTAX("tpTax");

		private String desc;

		private permitTaxType(String desc) {
			this.desc = desc;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

	}

	public enum consolidateChallanEntryHeads {
		LIFETAX("LIFETAX"), QUARTERLYTAX("QUARTERLYTAX"), SERVICEFEE("SERVICEFEE"), COMPOUNDFEE("COMPOUNDFEE"),
		PERMITFEE("PERMITFEE"), GREENTAX("GREENTAX");

		private consolidateChallanEntryHeads(String desc) {
			this.desc = desc;
		}

		private String desc;

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

	}

	public enum consolidateTypes {
		VCR("VCR"), VOLUNTARY("VOLUNTARY"), TP("TP"), SP("SP");
		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		private String desc;

		private consolidateTypes(String desc) {
			this.desc = desc;
		}

	}

	
	
	public static List<String> getOtherStatePermitTaxTypes() {
		return Arrays.asList(VoluntaryTaxType.Quarterly.taxType, VoluntaryTaxType.SevenDays.taxType,
				VoluntaryTaxType.ThirtyDays.taxType);
	}

	public static List<String> getVoluntaryTaxTypes() {
		return Stream.of(VoluntaryTaxType.values()).map(tax -> tax.getDesc()).collect(Collectors.toList());
	}

	public static List<String> cashBookTaxTypes() {
		List<String> cashBookList = new ArrayList<>();
		cashBookList.addAll(getVoluntaryTaxTypes());
		cashBookList.addAll(Stream.of(permitTaxType.values()).map(tax -> tax.getDesc()).collect(Collectors.toList()));
		return cashBookList;
	}

	public static List<String> getTaxTypesforFinancialAssistance(){
		return Arrays.asList(TaxTypeEnum.QuarterlyTax.getDesc(),TaxTypeEnum.LifeTax.getDesc(),TaxTypeEnum.YearlyTax.getDesc());
		
	}
}
