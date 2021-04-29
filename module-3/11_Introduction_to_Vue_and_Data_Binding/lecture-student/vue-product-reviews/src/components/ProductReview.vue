<template>
  <div class = "Main">
      <h2>Product Review For {{name}}</h2>
      <p class = "description">{{descrtiption}}</p>
  </div>
</template>

<script>
export default {
name: 'product-review',
data(){
    return{
        name: 'cigar parties for dummies',
        description: 'host and plan the perfect party'
        }
    }
}
</script>

<style scoped>
div.main{
    margin: 1rem 0;
}
</style>