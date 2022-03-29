package com.github.unclety.pluginlearning.services

import com.intellij.openapi.project.Project
import com.github.unclety.pluginlearning.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
