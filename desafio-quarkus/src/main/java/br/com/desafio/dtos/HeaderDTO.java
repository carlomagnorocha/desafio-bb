package br.com.desafio.dtos;


public class HeaderDTO {

	private Integer page;
	private Integer pages;
	private Integer per_page;
	private Integer total;
	
	
	public HeaderDTO() {}

	public HeaderDTO(Integer page, Integer pages, Integer per_page, Integer total) {
		super();
		this.page = page;
		this.pages = pages;
		this.per_page = per_page;
		this.total = total;
	}


	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Integer getPer_page() {
		return per_page;
	}

	public void setPer_page(Integer per_page) {
		this.per_page = per_page;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

}
