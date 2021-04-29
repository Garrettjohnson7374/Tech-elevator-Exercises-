import Vue from 'vue';
import VueRouter from 'vue-router';
import HomePage from '@/views/Home.vue'
import ReadingList from '@/views/MyBooks.vue'
import BookDetail from '@/views/BookDetails.vue'
import NewBookForm from '@/views/NewBook.vue'

Vue.use(VueRouter);

const routes = [
  {
    path:'/',
    name: 'Home',
    component: HomePage
  },
  {
    path: '/myBooks',
    name: 'ReadingList',
    component: ReadingList
  },
  {
    path: '/addBook',
    name: 'NewBook',
    component: NewBookForm
  },
  {
    path: '/book/:isbn',
    name: 'book',
    component: BookDetail
  }
];

const router = new VueRouter({
  mode: 'history',
  routes
});

export default router;
