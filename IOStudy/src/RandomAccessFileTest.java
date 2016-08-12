import java.io.*;
import java.io.*;
import java.util.*;

/**
 * @version 1.12 2012-05-30
 * @author Cay Horstmann
 */
public class RandomAccessFileTest {
	public static void main(String[] args) throws IOException {
		Employee[] staff = new Employee[3];

		staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

		try (DataOutputStream out = new DataOutputStream(new FileOutputStream(
				"employee.dat")))// ����ΪʲôҪ��try���
		{
			// save all employee records to the file employee.dat
			for (Employee e : staff)
				writeData(out, e);// �Ҿ���д��Ӧ��ֻ��60��
			// out.close();//�����Ļ����ܾ���һ���ֲ����� �����Բ��ùر���
		}

		try (RandomAccessFile in = new RandomAccessFile("employee.dat", "r")) {
			// retrieve all records into a new array

			// compute the array size
			int n = (int) (in.length() / Employee.RECORD_SIZE);
			Employee[] newStaff = new Employee[n];

			// read employees in reverse order
			for (int i = n - 1; i >= 0; i--) {
				newStaff[i] = new Employee();
				in.seek(i * Employee.RECORD_SIZE);
				newStaff[i] = readData(in);
			}

			// print the newly read employee records
			for (Employee e : newStaff)
				System.out.println(e);
		}
	}

	/**
	 * Writes employee data to a data output
	 * 
	 * @param out
	 *            the data output
	 * @param e
	 *            the employee
	 */
	public static void writeData(DataOutput out, Employee e) throws IOException {
		DataIO.writeFixedString(e.getName(), Employee.NAME_SIZE, out);
		out.writeDouble(e.getSalary());

		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(e.getHireDay());
		out.writeInt(calendar.get(Calendar.YEAR));
		out.writeInt(calendar.get(Calendar.MONTH) + 1);
		out.writeInt(calendar.get(Calendar.DAY_OF_MONTH));
	}

	/**
	 * Reads employee data from a data input
	 * 
	 * @param in
	 *            the data input
	 * @return the employee
	 */
	public static Employee readData(DataInput in) throws IOException {
		String name = DataIO.readFixedString(Employee.NAME_SIZE, in);
		double salary = in.readDouble();
		int y = in.readInt();
		int m = in.readInt();
		int d = in.readInt();
		return new Employee(name, salary, y, m - 1, d);
	}
}

class DataIO {
	public static String readFixedString(int size, DataInput in)
			throws IOException {
		StringBuilder b = new StringBuilder(size);
		int i = 0;
		boolean more = true;
		while (more && i < size) {
			char ch = in.readChar();
			i++;
			if (ch == 0)
				more = false;
			else
				b.append(ch);
		}
		in.skipBytes(2 * (size - i));
		return b.toString();
	}

	public static void writeFixedString(String s, int size, DataOutput out)
			throws IOException {
		for (int i = 0; i < size; i++) {//ѭ�h�ĴΔ�ֻ��NAME_SIZE�Σ������҂����������õ�λ���Ǵ_��2*NAME_SIZSE������char���õ�λ��һ����2���ֹ�
			char ch = '0';//ch���Ƚo�xֵ�ˣ��@��������Ӱ푵�����ĽY��
			              //�䌍�㲻�÷�Ҫ��һ���z򞣬�ҬF�ڿ��԰ٷ�֮���Ŀ϶�java�e���char�ǃɂ��ֹ�
			if (i < s.length())
				ch = s.charAt(i);
			out.writeChar(ch);// ��������Ļ����ǲ�0��
		}
	}
}

class Employee {
	public static final int NAME_SIZE = 40;
	public static final int RECORD_SIZE = 2 * NAME_SIZE + 8 + 4 + 4 + 4;

	private String name;
	private double salary;
	private Date hireDay;

	public Employee() {
	}

	public Employee(String n, double s, int year, int month, int day) {
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		hireDay = calendar.getTime();
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Date getHireDay() {
		return hireDay;
	}

	/**
	 * Raises the salary of this employee.
	 * 
	 * @byPercent the percentage of the raise
	 */
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public String toString() {
		return getClass().getName() + "[name=" + name + ",salary=" + salary
				+ ",hireDay=" + hireDay + "]";
	}
}
