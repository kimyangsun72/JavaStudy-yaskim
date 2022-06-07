package J19_제네릭;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Controller<T> {
	private int code;
	private String msg;
	private T data;

}
