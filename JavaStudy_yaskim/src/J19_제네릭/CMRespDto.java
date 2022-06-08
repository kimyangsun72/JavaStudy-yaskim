package J19_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CMRespDto<T>{  //제네릭 - Integer, Int 등 자료형이 정해지지 않을때 사용한다
	 private int code;//
	 private String msg;
	 private T data;
}
