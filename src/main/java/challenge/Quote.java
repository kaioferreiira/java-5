package challenge;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "scripts")
public class Quote {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	private Integer episode;
	@Column(name = "EPISODE_NAME")
	private String episodeName;
	private String segment;
	private String type ;
	@Column(name = "ACTOR")
	private String actor;
	private String character;
	private String detail ;
	private Timestamp record_date;
	private String	series;
	private Timestamp transmission_date;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public Integer getEpisode() {
		return episode;
	}

	public void setEpisode(Integer episode) {
		this.episode = episode;
	}

	public String getEpisodeName() {
		return episodeName;
	}

	public void setEpisodeName(String episodeName) {
		this.episodeName = episodeName;
	}

	public String getSegment() {
		return segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Timestamp getRecord_date() {
		return record_date;
	}

	public void setRecord_date(Timestamp record_date) {
		this.record_date = record_date;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public Timestamp getTransmission_date() {
		return transmission_date;
	}

	public void setTransmission_date(Timestamp transmission_date) {
		this.transmission_date = transmission_date;
	}

	public String getQuote() {
		return null;
	}

	public void setQuote(String quote) {

	}
}
