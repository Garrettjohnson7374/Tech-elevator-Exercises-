<template>
    <div>
        <my-books />
        <router-link v-bind:to="{name:'NewBook'}">Add Book to ReadingList</router-link>
    </div>
</template>

<script>
import MyBooks from '@/components/ReadingList.vue'

export default {
    components:{
        MyBooks
    }
}
</script>

<style>

</style>