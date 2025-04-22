package CollectionFramework_Problems

data class EmployeeData(
    val id: Int,
    val name: String,
    val age: Int,
    val department: String,
    val position: String,
    val salary: Double,
    val yearsOfExperience: Int
) {
    companion object{
    fun generateEmployees(): List<EmployeeData> {
        return listOf(
            EmployeeData(1, "Alice Johnson", 28, "Finance", "Analyst", 55000.0, 4),
            EmployeeData(2, "Bob Smith", 35, "Finance", "Senior Analyst", 72000.0, 10),
            EmployeeData(3, "Charlie Brown", 45, "Human Resources", "Manager", 90000.0, 20),
            EmployeeData(4, "Diana Prince", 32, "IT", "Developer", 65000.0, 8),
            EmployeeData(5, "Evan Thomas", 29, "IT", "Junior Developer", 50000.0, 3),
            EmployeeData(6, "Fiona Adams", 41, "Finance", "Accountant", 78000.0, 18),
            EmployeeData(7, "George Martin", 38, "Operations", "Operations Manager", 85000.0, 15),
            EmployeeData(8, "Hannah White", 26, "Marketing", "Marketing Coordinator", 48000.0, 2),
            EmployeeData(9, "Ian Black", 50, "IT", "IT Manager", 95000.0, 25),
            EmployeeData(10, "Julia Green", 31, "Human Resources", "Recruiter", 58000.0, 6),
            EmployeeData(11, "Kevin Brown", 37, "Finance", "Financial Advisor", 80000.0, 12),
            EmployeeData(12, "Laura Scott", 44, "Operations", "Operations Analyst", 67000.0, 19),
            EmployeeData(13, "Michael Davis", 30, "IT", "System Administrator", 62000.0, 5),
            EmployeeData(14, "Natalie King", 27, "Finance", "Analyst", 54000.0, 4),
            EmployeeData(15, "Oliver Clark", 33, "Marketing", "Marketing Specialist", 60000.0, 7),
            EmployeeData(16, "Paula Lewis", 39, "Human Resources", "HR Specialist", 74000.0, 13),
            EmployeeData(17, "Quentin Taylor", 47, "Operations", "Senior Operations Manager", 92000.0, 22),
            EmployeeData(18, "Rachel Harris", 34, "Finance", "Budget Analyst", 68000.0, 9),
            EmployeeData(19, "Steve Wilson", 42, "IT", "Lead Developer", 86000.0, 17),
            EmployeeData(20, "Tina Thompson", 36, "Marketing", "Brand Manager", 73000.0, 11),
            EmployeeData(21, "Ursula Miller", 29, "Finance", "Credit Analyst", 55000.0, 4),
            EmployeeData(22, "Victor Wright", 40, "Human Resources", "Compensation Specialist", 79000.0, 16),
            EmployeeData(23, "Wendy Baker", 31, "Operations", "Operations Coordinator", 60000.0, 7),
            EmployeeData(24, "Xander Collins", 25, "IT", "Junior Developer", 52000.0, 2),
            EmployeeData(25, "Yvonne Howard", 48, "Finance", "Finance Manager", 93000.0, 24),
            EmployeeData(26, "Zachary Perez", 28, "Marketing", "Social Media Manager", 57000.0, 4),
            EmployeeData(27, "Amy Young", 35, "Finance", "Risk Analyst", 75000.0, 10),
            EmployeeData(28, "Brian Foster", 39, "IT", "DevOps Engineer", 80000.0, 14),
            EmployeeData(29, "Catherine Bell", 30, "Human Resources", "HR Coordinator", 58000.0, 6),
            EmployeeData(30, "David Griffin", 46, "Operations", "Logistics Manager", 87000.0, 21)
        )
        }
    }
}