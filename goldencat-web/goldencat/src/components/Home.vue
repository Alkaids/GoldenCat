<template>
  <h3>{{msg}}</h3>
</template>

<script>
export default {
  name: 'Home',
  data () {
    return {
      msg: '欢迎来到慕和兰道304的记账系统'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  h3{
    text-align: center;
  }
</style>
