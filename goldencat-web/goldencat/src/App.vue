<template>
  <div id="app" :style="{background: 'url(' + bgImg + ') no-repeat center center' }" >
      <transition name="custom-classes-transition" leave-active-class="animated fadeOutLeft" enter-active-class="animated fadeInRight">
        <router-view/>
      </transition>
  </div>
</template>

<script>
export default {
  name: 'App',
  data () {
    return {
      bgImg: require('./assets/timg1.jpg')
    }
  }
}
</script>

<style>
html,body{
  width:100%;
  height:100%;
}
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  width:100%;
  height:100%;
}
</style>
