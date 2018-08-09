package io.codelavida.ds;

import org.junit.Test;

import java.util.List;

import static com.google.common.truth.Truth.assertThat;


public class ArrayListTest {

    @Test
    public void sizeOfEmptyListMustBeZero() {
        List<Integer> list = new ArrayList<>();
        assertThat(list).hasSize(0);
    }

    @Test
    public void elementShouldBeAddedAtEnd() {
        List<Integer> list = new ArrayList<>();

        list.add(10);

        assertThat(list.size()).isEqualTo(1);
        assertThat(list.get(0)).isEqualTo(10);
    }

    @Test
    public void elementsShouldBeAddedAtEnd() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);

        list2.addAll(list1);

        assertThat(list2).hasSize(3);
    }

    @Test
    public void elementShouldBeAddedByPosition() {
        List<Integer> list = new ArrayList<>();

        list.add(10);

        assertThat(list.size()).isEqualTo(1);
        assertThat(list.get(0)).isEqualTo(10);
    }

    @Test
    public void elementShouldReplace() {
        List<Integer> list = new ArrayList<>();

        list.add(10);

        assertThat(list.set(0, 20)).isEqualTo(10);
        assertThat(list.get(0)).isEqualTo(20);
    }

    @Test
    public void elementShouldBeRemovedByPosition() {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        assertThat(list.remove(1)).isEqualTo(20);
        assertThat(list.size()).isEqualTo(2);
    }

    @Test
    public void elementShouldBeRemovedByValue() {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(30);

        assertThat(list.remove(Integer.valueOf(30))).isTrue();
        assertThat(list.size()).isEqualTo(1);
        assertThat(list.remove(Integer.valueOf(20))).isFalse();
    }

    @Test
    public void containmentOfElementInList() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        assertThat(list).contains(20);
        assertThat(list).doesNotContain(30);
    }

    @Test
    public void containmentOfElementsInList() {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        List<Integer> subList = new ArrayList<>();

        subList.add(20);
        subList.add(30);

        assertThat(list.containsAll(subList)).isTrue();
    }

}