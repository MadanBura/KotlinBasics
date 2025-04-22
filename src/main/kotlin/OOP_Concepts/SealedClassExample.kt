package OOP_Concepts

sealed class Task(val id: Int, val name: String) {

    class DevelopmentTask(id: Int, name: String, val language: String) : Task(id, name) {
        fun code() {
            println("Coding in $language")
        }
    }

    class DesignTask(id: Int, name: String, val tool: String) : Task(id, name) {
        fun design() {
            println("Designing with $tool")
        }
    }

    class TestingTask(id: Int, name: String, val framework: String) : Task(id, name) {
        fun test() {
            println("Testing with $framework")
        }
    }
}
enum class Status {
    TODO,
    IN_PROGRESS,
    COMPLETED,
    BLOCKED
}

fun main() {
    // Create instances of different tasks
    val devTask = Task.DevelopmentTask(1, "Implement Feature", "Kotlin")
    val designTask = Task.DesignTask(2, "Create UI Mockup", "Figma")
    val testTask = Task.TestingTask(3, "Run Unit Tests", "JUnit")

    // Set their statuses
    val devTaskStatus = Status.IN_PROGRESS
    val designTaskStatus = Status.TODO
    val testTaskStatus = Status.COMPLETED

    // Process each task based on its type and status
    processTask(devTask, devTaskStatus)
    processTask(designTask, designTaskStatus)
    processTask(testTask, testTaskStatus)
}

fun processTask(task: Task, status: Status) {
    println("Processing ${task.name} with status $status")

    when (task) {
        is Task.DevelopmentTask -> {
            println("Development task: ${task.name}")
            if (status == Status.IN_PROGRESS) {
                task.code()
            }
        }
        is Task.DesignTask -> {
            println("Design task: ${task.name}")
            if (status == Status.TODO) {
                task.design()
            }
        }
        is Task.TestingTask -> {
            println("Testing task: ${task.name}")
            if (status == Status.COMPLETED) {
                task.test()
            }
        }
    }
}
