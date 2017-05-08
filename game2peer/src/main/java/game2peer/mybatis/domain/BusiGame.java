package game2peer.mybatis.domain;

import java.math.BigDecimal;
import java.util.Date;

public class BusiGame {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column busi_game.id
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column busi_game.user_id
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	private String userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column busi_game.game_name
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	private String gameName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column busi_game.lang
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	private String lang;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column busi_game.logo
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	private String logo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column busi_game.cover_image
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	private String coverImage;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column busi_game.summary
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	private String summary;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column busi_game.recommended
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	private Integer recommended;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column busi_game.create_date
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	private Date createDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column busi_game.register_callback
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	private String registerCallback;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column busi_game.register_ui
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	private Integer registerUi;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column busi_game.register_with_domain
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	private String registerWithDomain;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column busi_game.register_password_type
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	private Integer registerPasswordType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column busi_game.download_page
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	private String downloadPage;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column busi_game.pay_callback
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	private String payCallback;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column busi_game.game_key
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	private String gameKey;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column busi_game.pay_amount
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	private BigDecimal payAmount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column busi_game.game_users
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	private Integer gameUsers;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column busi_game.mode
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	private Integer mode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column busi_game.description
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	private String description;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column busi_game.id
	 * @return  the value of busi_game.id
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column busi_game.id
	 * @param id  the value for busi_game.id
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column busi_game.user_id
	 * @return  the value of busi_game.user_id
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column busi_game.user_id
	 * @param userId  the value for busi_game.user_id
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column busi_game.game_name
	 * @return  the value of busi_game.game_name
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public String getGameName() {
		return gameName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column busi_game.game_name
	 * @param gameName  the value for busi_game.game_name
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column busi_game.lang
	 * @return  the value of busi_game.lang
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column busi_game.lang
	 * @param lang  the value for busi_game.lang
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public void setLang(String lang) {
		this.lang = lang;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column busi_game.logo
	 * @return  the value of busi_game.logo
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public String getLogo() {
		return logo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column busi_game.logo
	 * @param logo  the value for busi_game.logo
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column busi_game.cover_image
	 * @return  the value of busi_game.cover_image
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public String getCoverImage() {
		return coverImage;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column busi_game.cover_image
	 * @param coverImage  the value for busi_game.cover_image
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column busi_game.summary
	 * @return  the value of busi_game.summary
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column busi_game.summary
	 * @param summary  the value for busi_game.summary
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column busi_game.recommended
	 * @return  the value of busi_game.recommended
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public Integer getRecommended() {
		return recommended;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column busi_game.recommended
	 * @param recommended  the value for busi_game.recommended
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public void setRecommended(Integer recommended) {
		this.recommended = recommended;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column busi_game.create_date
	 * @return  the value of busi_game.create_date
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column busi_game.create_date
	 * @param createDate  the value for busi_game.create_date
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column busi_game.register_callback
	 * @return  the value of busi_game.register_callback
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public String getRegisterCallback() {
		return registerCallback;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column busi_game.register_callback
	 * @param registerCallback  the value for busi_game.register_callback
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public void setRegisterCallback(String registerCallback) {
		this.registerCallback = registerCallback;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column busi_game.register_ui
	 * @return  the value of busi_game.register_ui
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public Integer getRegisterUi() {
		return registerUi;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column busi_game.register_ui
	 * @param registerUi  the value for busi_game.register_ui
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public void setRegisterUi(Integer registerUi) {
		this.registerUi = registerUi;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column busi_game.register_with_domain
	 * @return  the value of busi_game.register_with_domain
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public String getRegisterWithDomain() {
		return registerWithDomain;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column busi_game.register_with_domain
	 * @param registerWithDomain  the value for busi_game.register_with_domain
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public void setRegisterWithDomain(String registerWithDomain) {
		this.registerWithDomain = registerWithDomain;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column busi_game.register_password_type
	 * @return  the value of busi_game.register_password_type
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public Integer getRegisterPasswordType() {
		return registerPasswordType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column busi_game.register_password_type
	 * @param registerPasswordType  the value for busi_game.register_password_type
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public void setRegisterPasswordType(Integer registerPasswordType) {
		this.registerPasswordType = registerPasswordType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column busi_game.download_page
	 * @return  the value of busi_game.download_page
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public String getDownloadPage() {
		return downloadPage;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column busi_game.download_page
	 * @param downloadPage  the value for busi_game.download_page
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public void setDownloadPage(String downloadPage) {
		this.downloadPage = downloadPage;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column busi_game.pay_callback
	 * @return  the value of busi_game.pay_callback
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public String getPayCallback() {
		return payCallback;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column busi_game.pay_callback
	 * @param payCallback  the value for busi_game.pay_callback
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public void setPayCallback(String payCallback) {
		this.payCallback = payCallback;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column busi_game.game_key
	 * @return  the value of busi_game.game_key
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public String getGameKey() {
		return gameKey;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column busi_game.game_key
	 * @param gameKey  the value for busi_game.game_key
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public void setGameKey(String gameKey) {
		this.gameKey = gameKey;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column busi_game.pay_amount
	 * @return  the value of busi_game.pay_amount
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public BigDecimal getPayAmount() {
		return payAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column busi_game.pay_amount
	 * @param payAmount  the value for busi_game.pay_amount
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column busi_game.game_users
	 * @return  the value of busi_game.game_users
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public Integer getGameUsers() {
		return gameUsers;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column busi_game.game_users
	 * @param gameUsers  the value for busi_game.game_users
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public void setGameUsers(Integer gameUsers) {
		this.gameUsers = gameUsers;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column busi_game.mode
	 * @return  the value of busi_game.mode
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public Integer getMode() {
		return mode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column busi_game.mode
	 * @param mode  the value for busi_game.mode
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public void setMode(Integer mode) {
		this.mode = mode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column busi_game.description
	 * @return  the value of busi_game.description
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column busi_game.description
	 * @param description  the value for busi_game.description
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}