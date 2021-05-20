package com.example.laboratory1.testing

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class LoginUtilTest {

    @Test
    fun `empty email returns false` () {
        val result = LoginUtil.validateLoginInput(
            "",
            "123456"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false` () {
        val result = LoginUtil.validateLoginInput(
            "hello@gmail.com",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid email and password greater than 6 returns true` () {
        val result = LoginUtil.validateLoginInput(
            "mmarie@gmail.com",
            "123456"
        )
        assertThat(result).isTrue()
    }


    @Test
    fun `less that 6 characters password returns false` () {
        val result = LoginUtil.validateLoginInput(
            "mmarie@gmail.com",
            "123"
        )
        assertThat(result).isFalse()
    }
}