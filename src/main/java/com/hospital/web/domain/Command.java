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
	
	public Integer[] getPageInfo() {
		Pagination page = new Pagination();
		String pageNO = (String) map.get("pageNO");
		String count = (String) map.get("count");
		page.setBlockSize(5);
		page.setRowCount(5);
		page.setCount(Integer.parseInt(count));
		page.setPageNO(pageNO);
		page.setPageStart();
		page.setPageEnd();
		page.setPageCount();
		page.setBlockStart();
		page.setPrevBlock();
		page.setNextBlock();
		page.setBlockEnd();
		return page.getAttribute();
	}
	class Pagination {
		private int rowCount, pageNO, pageStart, pageEnd, count, pageCount, blockSize, blockStart, prevBlock, nextBlock,
				blockEnd;

		public void setRowCount(int rowCount) {
			this.rowCount = rowCount;
		}

		public void setPageNO(String pageNO) {
			this.pageNO = Integer.parseInt(pageNO);
		}

		public void setPageStart() {
			this.pageStart = (pageNO - 1) * rowCount + 1;
		}

		public void setPageEnd() {
			this.pageEnd = pageNO * rowCount;
		}

		public void setCount(int count) {
			this.count = count;
		}

		public void setPageCount() {
			pageCount = (count % rowCount == 0) ? count / rowCount : count / rowCount + 1;
		}

		public void setBlockSize(int blockSize) {
			this.blockSize = blockSize;
		}

		public void setBlockStart() {
			this.blockStart = pageNO - ((pageNO - 1) % blockSize);
		}

		public void setPrevBlock() {
			this.prevBlock = blockStart - blockSize;
		}

		public void setNextBlock() {
			this.nextBlock = blockStart + blockSize;
		}

		public void setBlockEnd() {
			blockEnd = (blockStart + rowCount - 1 < pageCount) ? blockStart + blockSize - 1 : pageCount;
		}

		public Integer[] getAttribute() {
			Integer[] arr = { count, pageCount, pageNO, pageStart, pageEnd, blockStart, blockEnd, prevBlock,
					nextBlock };
			return arr;
		}
	}
}