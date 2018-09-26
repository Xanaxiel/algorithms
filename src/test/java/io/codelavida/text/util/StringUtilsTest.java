package io.codelavida.text.util;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class StringUtilsTest {

    @Test
    public void testIsBlankNull(){
        assertThat(StringUtils.isBlank(null)).isTrue();
    }

    @Test
    public void testIsBlankEmpty(){
        assertThat(StringUtils.isBlank("")).isTrue();
    }

    @Test
    public void testIsBlankWhiteSpaces(){
        assertThat(StringUtils.isBlank("\t\t \t  \n")).isTrue();
    }

    @Test
    public void testIsNotBlank(){
        assertThat(StringUtils.isBlank("not blank")).isFalse();
    }


}