package com.hospital.web.domain;

import java.util.Map;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
interface Orderable{
	public Command process(Map<?,?>map);
}
@Component @Lazy
public class Command implements Orderable{
	Map<?, ?> map;

	public Command(Map<?,?> map) {
		this.map = map;
	}
	
	public Command() {
		// TODO Auto-generated constructor stub
	}

	public Person<? extends Info> getPersonInfo(){
		Person<?> person=null;
		switch (map.get("type").toString()) {
		case "patient":
			person=new Person<Info>(new Patient());
			Patient patient=(Patient) person.getInfo();
			patient.setNurID(map.get("nurID").toString());
			patient.setDocID(map.get("docID").toString());
			patient.setId(map.get("id").toString());
			patient.setPass(map.get("pass").toString());
			patient.setName(map.get("name").toString());
			patient.setGen(map.get("gen").toString());
			patient.setJumin(map.get("jumin").toString());
			patient.setAddr(map.get("addr").toString());
			patient.setPhone(map.get("phone").toString());
			patient.setEmail(map.get("email").toString());
			patient.setJob(map.get("job").toString());
			break;
		case "doctor":
			person=new Person<Info>(new Doctor());
			Doctor doctor=(Doctor) person.getInfo();

			break;
		case "nurse":
			person=new Person<Info>(new Nurse());
			Nurse nurse=(Nurse) person.getInfo();

			break;
		case "admin":
			person=new Person<Info>(new Patient());
			Admin admin=(Admin) person.getInfo();
			
			break;
		default:
			break;
		}
		return person;
	}
	
	@Override
	public Command process(Map<?, ?> map) {
		return new Command(map);
	}
	
	public Pagination getPageInfo() {
		System.out.println("##### getPageInfo ENTER####");
		Pagination page = new Pagination();
		int pageNumber=(int) map.get("pageNumber");
		Integer theNumberOfRows=(Integer) map.get("pageNumber");
		page.setTheNumberOfRows(theNumberOfRows);
		page.setPageNumber(pageNumber);
		page.setStartPage();
		page.setEndPage();
		page.setTheNumberOfPages();
		page.setTheNumberOfBlocks();
		page.setStartRow();
		page.setPrevBlock();
		page.setNextBlock();
		page.setEndRow();
		return page;
	}
	public class Pagination {
		public static final int PAGE_SIZE=5;
		public static final int BLOCK_SIZE=5;
		private int theNumberOfRows,startRow, endRow, theNumberOfPages, theNumberOfBlocks,
					startPage, prevBlock, nextBlock,endPage, pageNumber;
	
		
		
		

		public int getTheNumberOfRows() {
			return theNumberOfRows;
		}




		public void setTheNumberOfRows(int theNumberOfRows) {
			this.theNumberOfRows = theNumberOfRows;
		}




		public int getPageNumber() {
			return pageNumber;
		}




		public void setPageNumber(int pageNumber) {
			this.pageNumber = pageNumber;
		}




		public int getStartRow() {
			return startRow;
		}




		public void setStartRow() {
			this.startRow = (pageNumber-1)*theNumberOfRows+1;
		}




		public int getEndRow() {
			return endRow;
		}




		public void setEndRow() {
			this.endRow = pageNumber+theNumberOfRows;
		}




		public int getTheNumberOfPages() {
			
			return theNumberOfPages;
		}




		public void setTheNumberOfPages() {
			if(theNumberOfRows % PAGE_SIZE == 0){
				theNumberOfPages=theNumberOfRows / PAGE_SIZE;
			}else{
				theNumberOfPages=theNumberOfRows / PAGE_SIZE + 1;
			}
		}




		public int getTheNumberOfBlocks() {
			return theNumberOfBlocks;
		}




		public void setTheNumberOfBlocks() {
			this.theNumberOfBlocks = theNumberOfPages / BLOCK_SIZE;
		}




		public int getStartPage() {
			return startPage;
		}




		public void setStartPage() {
			this.startPage = pageNumber - ((pageNumber-1)%BLOCK_SIZE);
		}




		public int getPrevBlock() {
			return prevBlock;
		}




		public void setPrevBlock() {
			this.prevBlock = startPage-BLOCK_SIZE;
		}




		public int getNextBlock() {
			return nextBlock;
		}




		public void setNextBlock() {
			this.nextBlock = startPage+BLOCK_SIZE;
		}




		public int getEndPage() {
			return endPage;
		}




		public void setEndPage() {
			if((startPage+theNumberOfRows-1) < theNumberOfPages){
				endPage = startPage + BLOCK_SIZE;
			}else{
				endPage = theNumberOfPages;
			}
		}




		public Integer[] getAttribute() {
			Integer[] arr = { pageNumber, theNumberOfPages ,startPage, endPage, startRow, endRow, prevBlock,
					nextBlock };
			return arr;
		}
	}
}