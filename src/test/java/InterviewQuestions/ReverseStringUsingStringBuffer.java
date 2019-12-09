package InterviewQuestions;

public class ReverseStringUsingStringBuffer {
	public static void main(String[] args) {
		String s = "Parthi when there";
		StringBuffer sb = new StringBuffer(s);
		s=sb.reverse().toString();
		System.out.println(s);
	}
}
