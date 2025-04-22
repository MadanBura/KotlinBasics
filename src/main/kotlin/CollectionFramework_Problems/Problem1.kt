package CollectionFramework_Problems

import OOP_Concepts.getData
import kotlin.math.max
import kotlin.math.min


fun main() {

    val empDataList: List<EmployeeData> = EmployeeData.generateEmployees()

    //returnFinanceDeptEmps(empDataList).forEach { println(it) }
    //returnEmpMoreThan_TenyearsExp(empDataList).forEach { println(it) }
    //filterEmpOnSalaryRange(empDataList).forEach { println(it) }
    //returnEmpNames(empDataList).forEach { println(it) }
    //returnUniqueDeptList(empDataList).forEach { println(it) }
    //salaryIncrementor(empDataList).forEach { println(it) }
    //sortByAlphabetically(empDataList)
    // sortByAgeDesc(empDataList)
    // sortBySalaryfromHigheshToLowest(empDataList)
    // deptNamegrouping(empDataList)
    //experienceWiseGrouping(empDataList)
   // newListEmpWithUniqueDept(empDataList)
    //  totalSalOFAllEmp(empDataList)
    //  calAvgAgeOfAllEmp(empDataList)
    // empWithHighestLowestSalary(empDataList)
    //partitionEmpAccordingToExp(empDataList)
    //  partitionEmpBasedOnSalCond(empDataList)
    // calNewSalariesOnBonus(empDataList)
    //  calTotalYearExpOFAll(empDataList)
    // findMaxSalWithReduce(empDataList)
    //returnIntoChunksOfEmp(empDataList)
    //rollingWindofEmp(empDataList)
    //crateMapOfEmp(empDataList)
   // crateMapOfEmpCustomCond(empDataList)
    //uniqueSalFromEmpList(empDataList)
    //checkEmpfromITDept(empDataList)
    //checkNoneEmpUnderageCondn(empDataList)
    //takeFirstTenRecords(empDataList)
    //takeEmpIFSalLessthanCond(empDataList)
    //dropEmps(empDataList)
    //dropEmpsGivenCondn(empDataList)
   // addNewEmp(empDataList)
  //  verifyEmpSalGrtThan(empDataList)
    //removeEmpbyId(empDataList)
  //  val(firstList, secondList) = empDataList.partition { it.salary>60000 }
    //mergeTwoListAndRemoveDup(firstList, secondList)

    findSecondHighestSal(empDataList)

}

//Write a function that returns a list of employees who belong to the "Finance" department.
fun returnFinanceDeptEmps(empsDataList: List<EmployeeData>): List<EmployeeData> {
    return empsDataList.filter { it.department == "Finance" }
}

//Find all employees with more than 10 years of experience.
fun returnEmpMoreThan_TenyearsExp(empsDataList: List<EmployeeData>): List<EmployeeData> {
    return empsDataList.filter { it.yearsOfExperience > 10 }
}

//Create a function that filters employees whose salaries fall between 50,000 and 70,000.
fun filterEmpOnSalaryRange(empsDataList: List<EmployeeData>): List<EmployeeData> {
    return empsDataList.filter { (it.salary > 50000 && it.salary < 70000.0) }
}

//Write a function that returns a list of employee names.
fun returnEmpNames(empsDataList: List<EmployeeData>): List<String> {
    return empsDataList.map { it.name }
}

//Create a function that returns a list of unique departments from the employee list.
fun returnUniqueDeptList(empsDataList: List<EmployeeData>): List<String> {
    return empsDataList.map { it.department }.distinct()
}

//Increase the salary of all employees by 10% and return the updated list.
fun salaryIncrementor(empsDataList: List<EmployeeData>): List<Double> {
//    val updatedList: MutableList<EmployeeData> = mutableListOf()
//    empsDataList.forEach { updatedList.add(it) }
    return empsDataList.map { it.salary + (0.10 * it.salary) }

}


//Sort the employees alphabetically by their names.
fun sortByAlphabetically(empsDataList: List<EmployeeData>) {
    empsDataList.sortedBy { it.name }.forEach { println(it) }
}

//Sort the employees in descending order of age.
fun sortByAgeDesc(empsDataList: List<EmployeeData>) {
    empsDataList.sortedByDescending { it.age }.forEach { println(it) }
}

//Sort the employees by their salary, from highest to lowest.
fun sortBySalaryfromHigheshToLowest(empsDataList: List<EmployeeData>) {
    empsDataList.sortedByDescending { it.salary }.forEach { println(it) }
}

//Group the employees by their department.
fun deptNamegrouping(empsDataList: List<EmployeeData>) {
    val departments = empsDataList.groupBy { it.department }
    departments.forEach {
        println(it.key)
        for (a in it.value) {
            println(a)
        }
    }
}

//Group employees by their experience level (e.g., 0-5 years, 6-10 years, 11+ years).
fun experienceWiseGrouping(empsDataList: List<EmployeeData>) {
    empsDataList.groupBy {
        when(it.yearsOfExperience){
            in 0..5 -> "0-5years"
            in 6..10 -> "6 to 10years"
            else -> "11+ years"
        }
    }.forEach { println(it) }

}


//Calculate the total salary of all employees.
fun totalSalOFAllEmp(empsDataList: List<EmployeeData>) {
    val totalsal = empsDataList.sumOf { it.salary }
    println("Total Sal of All emp is : $totalsal")
}


//Compute the average age of employees
fun calAvgAgeOfAllEmp(empsDataList: List<EmployeeData>) {
    //  val totalAvgAge =(empsDataList.sumOf { it.age })/ empsDataList.count()
    val ageList = empsDataList.map { it.age }.average()
    println(ageList)
}

//Find the employee with the highest and lowest salary.
fun empWithHighestLowestSalary(empsDataList: List<EmployeeData>) {
    val maxSal = empsDataList.maxOf { it.salary }
    val minSal = empsDataList.minOf { it.salary }
    empsDataList.filter { it.salary == maxSal || it.salary == minSal }.forEach { println(it) }
}

//Partition the employees into two lists: those with more than 10 years of experience and those with 10 years or less.
fun partitionEmpAccordingToExp(empsDataList: List<EmployeeData>) {
    val (firstList, secondList) = empsDataList.partition { it.yearsOfExperience > 10 }
    firstList.forEach { println(it) }
    println("=============")
    secondList.forEach { println(it) }

}

//Partition the employees into two lists: those earning more than 70,000 and those earning less.
fun partitionEmpBasedOnSalCond(empsDataList: List<EmployeeData>) {
    val (firstList, secondList) = empsDataList.partition { it.salary > 70000.00 }
    firstList.forEach { println(it) }
    println("=============")
    secondList.forEach { println(it) }
}

//Assume each employee has a list of skills.
// Use flatMap to create a list of all skills across all employees.
fun skillSetOfEmp(empsDataList: List<EmployeeData>) {
}


//Suppose you have another list of bonus percentages. Zip the list of employees with this
// bonus list and calculate the new salary for each employee.
fun calNewSalariesOnBonus(empsDataList: List<EmployeeData>) {

    val bonuses = listOf(
        10, 15, 12, 8, 5, 7, 10, 6, 14, 11,
        13, 9, 7, 12, 8, 11, 10, 14, 6, 9,
        12, 13, 15, 10, 6, 9, 7, 11, 10, 12
    )

    //First we have seperate out salary list
    //then zip this list with bonus list
    val salAndBonusList = empsDataList.map { it.salary }.zip(bonuses)

    salAndBonusList.forEach { println(it) }

    salAndBonusList.forEach { (sal, bonus) ->
        run {
            val bonusAmount = (bonus / 100.0) * sal
            val newSal = bonusAmount + sal
            println("New Salary >> $newSal")

        }

//            val bonusPercentage = it.second
//            val sal = it.first
//            val bonusAmount = (bonusPercentage/100.0) * sal.toDouble()
//            val newSal = bonusAmount+sal
//            println("New Salary >> $newSal")
    }
}


//Calculate the total years of experience across all employees using fold
fun calTotalYearExpOFAll(empsDataList: List<EmployeeData>) {
    val totalYearsExpOFAll = empsDataList.map { it.yearsOfExperience }.fold(0) { total, yearOfExp ->
        total + yearOfExp
    }

    println("Total will be : ${totalYearsExpOFAll}")
}

//Find the employee with the maximum salary using reduce
fun findMaxSalWithReduce(empsDataList: List<EmployeeData>) {
    val maxSal = empsDataList.map { it.salary }.reduce { mSal, current ->
        if (mSal < current)
            current
        else
            mSal
    }
    println(maxSal)
}

//Divide the list of employees into chunks of 5 and return the result.
fun returnIntoChunksOfEmp(empsDataList: List<EmployeeData>){
     empsDataList.chunked(5).forEach{ println(it) }
}

//Create a rolling window of 3 employees and print each window.
fun rollingWindofEmp(empsDataList: List<EmployeeData>){
    empsDataList.windowed(3,3).forEach { println(it) }
}

//Create a map of employees keyed by their ID.
fun crateMapOfEmp(empsDataList: List<EmployeeData>){
    val mapOfEmp : MutableMap<Int, EmployeeData> = mutableMapOf()

    empsDataList.forEach {
        mapOfEmp.put(it.id, it)
    }
    mapOfEmp.forEach { println(it) }
}

//Create a map where each key is an employee’s name, and the value is their department.
fun crateMapOfEmpCustomCond(empsDataList: List<EmployeeData>){

    val mapOfEmp : MutableMap<String, String> = mutableMapOf()

    empsDataList.forEach {
        mapOfEmp.put(it.name, it.department)
    }
    mapOfEmp.forEach { println(it) }
}

//Find all unique salary values from the employee list.
fun uniqueSalFromEmpList(empsDataList: List<EmployeeData>){
   val unqiuelist =  empsDataList.map { it.salary }.distinct()
    println(unqiuelist)
    println("Count is : ${unqiuelist.count()}")
}

//Create a list of employees with distinct departments.
fun newListEmpWithUniqueDept(empsDataList: List<EmployeeData>){
}

//Check if there is any employee in the "IT" department
fun checkEmpfromITDept(empsDataList: List<EmployeeData>){

   val newList =  empsDataList.filter { it.department =="IT" }

    if(!newList.isEmpty()){
        newList.forEach { println(it) }
    }else{
        println("IT Dept is not present")
    }
}

//Verify if all employees have a salary greater than 40,000.
fun verifyEmpSalGrtThan(empsDataList: List<EmployeeData>){

    var flag = false
    var count = 0
    empsDataList.forEach { flag = it.salary>40000
        if(flag==false){
            count++
        }
    }
    if(flag) println("All emps having salary")
    else println("$count emps found with less than 40K ")

}

//Check if none of the employees are under 25 years old.
fun checkNoneEmpUnderageCondn(empsDataList: List<EmployeeData>){
    var flag : Boolean = false
    empsDataList.forEach { flag = it.age > 25 }
    if(flag)
        println("No one is under 25")
    else
        println("Condition failed ")
}

//Take the first 10 employees from the list.
fun takeFirstTenRecords(empsDataList: List<EmployeeData>){
  empsDataList.slice(0..9).forEach { println(it) }
   // empsDataList.take(10)
}

//Take employees from the list while their salary is less than 60,000.
fun takeEmpIFSalLessthanCond(empsDataList: List<EmployeeData>){
    empsDataList.filter { it.salary < 60000 }.forEach { println(it) }
}

//Drop the first 5 employees from the list.
fun dropEmps(empsDataList: List<EmployeeData>){
    val res = empsDataList.drop(5)
    println(res.count())
}

//Drop employees from the list while their years of experience are less than 5.
fun dropEmpsGivenCondn(empsDataList: List<EmployeeData>){
     var (lessthanfiveyears, secondList)= empsDataList.partition { it.yearsOfExperience<5 }
     val list= lessthanfiveyears.drop( lessthanfiveyears.size)
    list.forEach { println(it) }

}

//Add a new employee to the existing list of employees.
fun addNewEmp(empsDataList: List<EmployeeData>){
    val resList = empsDataList.plus(EmployeeData(50, "Madan", 27,"TEST", "SR", 98765.0,2))
    resList.forEach { println(it) }
}

//Remove an employee from the list based on their ID.
fun removeEmpbyId(empsDataList: List<EmployeeData>){
    println("enter the id ")
    val enterID = readln().toInt()
    val res = empsDataList.dropWhile { it.id == enterID  }
    res.forEach { println(it) }
}

//Merge two lists of employees, removing duplicates based on ID.
fun mergeTwoListAndRemoveDup(list1:List<EmployeeData>, list2:List<EmployeeData>){
    list1.plus(list2).distinctBy { it.id }.forEach { println(it) }
}


//Find Second HighestSalary from list
fun findSecondHighestSal(empsDataList: List<EmployeeData>){

    val maxSalary = empsDataList.maxOfOrNull { it.salary }

    val secondHighestSalary = empsDataList
        .filter { it.salary != maxSalary }
        .maxOfOrNull { it.salary }

    if (secondHighestSalary != null) {
        println("Second Highest Salary is : $secondHighestSalary")
    } else {
        println("There is no second highest salary.")
    }
}