<template>
  <div id="app" :style="{background: 'url(' + bgImg + ') no-repeat center center' }" >
    <router-view/>
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
