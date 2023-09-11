import com.adarshr.gradle.testlogger.TestLoggerExtension
import com.adarshr.gradle.testlogger.theme.ThemeType

plugins {
    id("com.adarshr.test-logger")
}

configure<TestLoggerExtension> {
    theme = ThemeType.MOCHA_PARALLEL
    showSimpleNames = true
    showFullStackTraces = true
}