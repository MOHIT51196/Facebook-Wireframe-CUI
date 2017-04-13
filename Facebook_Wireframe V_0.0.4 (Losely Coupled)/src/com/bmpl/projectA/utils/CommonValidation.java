package com.bmpl.projectA.utils;

//util package is for utility which can be used number of times in the project 
//so make the util static so that it load once in the memory
//and no need to create type object multiple times

/*
 * bank class object will also take a 
 * DEFUALT MEMORY : 8 bytes
 * (1.checks if this object is occupied 
 * 2. used by the system to identify the presence of the object)
 * -----------called HOUSE KEEPING BYTES------------------
 * 
 * 
 * so if its isnt static and make multiple object then 
 * HEAP WILL BE FULLED
 * 
 * 
 *  ---------------WHEN CONDITION----------------------
 *  
 *  1.resource one
 *  2.write operation
 *  3.multi users
 *  
 *  WRITE OPERATION IN MULTI USER ENVIRONMENT IS EXCLUSIVE
 *  READ OPERATION IN MULTI USER ENVIRONMENT IS SHARED
 *  
 *  -------------------------WAY OUT-------------------------------
 *  
 *  	----------------THIS IS CALLED A UTILITY CLASS-----------
 *  
 *  1.make all the instant methods STATIC
 *  (so that methods will be called by the class name
 *  , class will be loaded once 
 *  , if someone make the object so give warning)
 *  
 *  2.make the constructor PRIVATE (so that no 1 will be able to make the object of the class)
 *  
 * --------------------------V.V.V.VIMPORTANT------------
 * 
 * to import a method so u dont need to write
 * ClassName.method();
 * 
 * so we statically import
 * 
 * import static com.package.blah_blah.method;
 * 
 * now write as method();
 * ClassName.method();
 * rather than 
 */


/*---------------------WHEN CONDITION---------------
 *	if a class is shared between two classes 
 *	and we need to have that class load once only 
 *
 *and we need to load that object once 
 *and on demand but not initially
 *
 *
 *---------------METHOD------------------------
 *
 *INDUSTRIAL DESIGN PATTERNS : whne a common industry problem is solved by COMMON INDUSTRIAL SOLUTIONS
 *---------------SINGLETON---------------------
 *1.private static UserClass object;
 *
 *(	this is static so that the object will load only once in the memory 
 *else it will create a new object everytime an object will be null
 *so the getObject will run completely everytime )
 *
 *
 *2.public static getObject(){
 *		
 *		if(object == null ){
 *			object=new UserClass();
 *		}
 *
 *		return object;
 * }
 * 
 * this will create the object only once when its null
 * else it will return thesame object 
 * 
 * 
 * now the object formation take place like
 * 
 * -----------> UserClass userClass= new UserClass.getObject();
 */



/*
 * DIFFERENCE BETWEEN STATIC AND SINGLETON USE
 * 1.if an object is heavy and 
 * 2.we need to make that object when we DEMAND
 * so we make it singleton 
 * 
 * EAGER CLASS LOADING : STATIC
 * LAZY CLASS LOADIG : SINGLETON
 */


public class CommonValidation {
	
	
	private final static int DEFAULT_LENGTH=8;
	static public boolean isBlank(String value) {
		
		if(value!=null && value.length()!=0)
			return false;
		else
			return true;

	}
	
//	if we dont need passlength to pass then it will run
//	ADVANTAGE OF VARARGS is 
//	zero argument as well as multiple argument
	
	
	static public boolean isCorrectLength(String value,int ...checkLength){
		int length=DEFAULT_LENGTH;
		
		if(checkLength.length!=0 && value.trim().length()!=0){
			length=checkLength[0];
		}
		
		if(value.length()>=length){
			return true;
		}
		
		else{
			return false;
		}
		
	}

}
