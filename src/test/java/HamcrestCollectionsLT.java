//Learning test

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestCollectionsLT {

    @Test
    public void collectionShouldHasOneGivenItem() throws Exception {
        List<String> list = Lists.newArrayList("Foo");
        assertThat(list, contains("Foo"));
    }

    @Test
    public void collectionShouldHasExactlyGivenItemsInGivenOrder() throws Exception {
        List<String> list = Lists.newArrayList("Foo", "Bar");
        assertThat(list, contains("Foo", "Bar"));
    }

    @Test
    public void collectionShouldHasExactlyGivenItemsInAnyOrder() throws Exception {
        List<String> list = Lists.newArrayList("Foo", "Bar");
        assertThat(list, containsInAnyOrder("Bar", "Foo"));
    }

    @Test
    public void collectionShouldHasGivenItem() throws Exception {
        List<String> list = Lists.newArrayList("Foo", "Bar", "Element");
        assertThat(list, hasItem("Foo"));
    }

    @Test
    public void collectionShouldNotHasGivenItem() throws Exception {
        List<String> list = Lists.newArrayList("Bar", "Element");
        assertThat(list, not(hasItem("Foo")));
    }

    @Test
    public void collectionShouldBeEmpty() throws Exception {
        List<String> list = Lists.newArrayList();
        assertThat(list, empty());
    }

    @Test
    public void collectionShouldNotBeEmpty() throws Exception {
        List<String> list = Lists.newArrayList("Foo");
        assertThat(list, not(empty()));
    }

    @Test
    public void collectionShouldHasGivenLength() throws Exception {
        List<String> list = Lists.newArrayList("Foo", "Bar", "Element");
        assertThat(list, hasSize(3));
    }

    @Test
    public void collectionShouldNotHaveGivenLength() throws Exception {
        List<String> list = Lists.newArrayList("Foo");
        assertThat(list, not(hasSize(2)));
    }

    @Test
    public void everyCollectionItemShouldBeGreater() throws Exception {
        List<Integer> list = Lists.newArrayList(4, 5, 6);
        assertThat(list, everyItem(greaterThan(3)));
    }

    @Test
    public void everyCollectionItemShouldBeGreaterOrEqual() throws Exception {
        List<Integer> list = Lists.newArrayList(4, 5, 6);
        assertThat(list, everyItem(greaterThanOrEqualTo(4)));
    }

    @Test
    public void everyCollectionStringItemContainSubstring() throws Exception {
        List<String> list = Lists.newArrayList("Sub1", "Sub2", "Sub3");
        assertThat(list, everyItem(containsString("Sub")));
    }

    @Test
    public void shouldContainAtLastGivenElementsAndEveryElementShouldContainGivenString() throws Exception {
        List<String> list = Lists.newArrayList("Sub1", "Sub2", "Sub3");
        assertThat(list, allOf(hasItems("Sub1", "Sub2"), everyItem(containsString("Sub"))));
    }

}

