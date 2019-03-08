package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		EmployeeInfo e1 = new EmployeeInfo(123, "John");
		e1.getDepartment("CS");
		//e1.farewell(01/01/2001);
		e1.setSalary(40000.00);
		e1.setID(123);
		e1.setName("John");

		EmployeeInfo.calculateEmployeePension();
		EmployeeInfo.calculateEmployeeBonus(5, 40000);

	}

}
