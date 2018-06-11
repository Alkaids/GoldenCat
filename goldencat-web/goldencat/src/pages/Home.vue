<template>
  <div class="container">
      <transition name="custom-classes-transition" leave-active-class="animated fadeOutUp" enter-active-class="animated fadeInDown">
        <div v-if="show" class="login">
            <h3><img :src="toux" alt=""></h3>
            <div class="enter" @click="show=!show">点击进入</div> 
        </div>
      </transition>
      <transition name="custom-classes-transition" leave-active-class="animated fadeOut" enter-active-class="animated fadeIn">
        <div v-if="!show" class="wrapper">
          <div class="set">
            <icon name="set" :w="30" :h="30"></icon>
          </div>
          <div class="add">
            <icon name="add" :w="32" :h="32"></icon>
          </div>
        </div>
      </transition>   
  </div>
</template>

<script>

export default {
  name: 'Home',
  data () {
    return {
      toux: require('../assets/toux.jpg'),
      show: true
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  .container{
    width:100%;
    height:100%;
    color:#fefefe;
    position:relative;
  }
  .login{
    width:100%;
    height:100%;
    position:absolute;
    left:0;
    top:130px;
  }
  h3{
    width:150px;
    height:150px;
    border-radius:50%;
    margin:0px auto;
    overflow: hidden;
  }
  h3 img{
    width:100%;
    height:100%;
  }
  .enter{
    margin-top :80px;
    font-size:22px;
  }

  .wrapper{
    width:100%;
    height:100%;
    position:absolute;
    left:0px;
    top:0px;  
  }
  .set{
    float:left;
    margin:30px;
  }
  .add{
    float:right;
    margin:30px;
  }
</style>
