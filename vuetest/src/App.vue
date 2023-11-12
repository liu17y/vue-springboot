<template>

<!--    <router-link to="/">Home</router-link> |-->
<!--    <router-link to="/about">About</router-link>|-->
<!--    <router-link to="/firstliu">Fristliu</router-link>|-->
<!--    <router-link to="/LoginPage">CCV</router-link>|-->
<!--    <router-link to="/el-page-header">Login</router-link>|-->
<!--    <router-link to="/BackFrom">Back</router-link>|-->
    <!-- <nav v-show="navVisible">
    <div style="display: flex; justify-content: center; align-items: center;">
      <router-link to="/login" style="font-size: 24px; font-family: 黑体;">Login</router-link>|
      <router-link to="/backend" style="font-size: 24px; font-family: 黑体;">Back</router-link>|
      <router-link to="/container" style="font-size: 24px; font-family: 黑体;">Fack</router-link>|
      <router-link to="/about" style="font-size: 24px; font-family: 黑体;">About</router-link>|
      <router-link to="/goods" style="font-size: 24px; font-family: 黑体;">BOUt</router-link>
    </div>
  </nav> -->
  <router-view/>
</template>

<script>

export default {
  data () {
    return {
      navVisible: true
    }
  },
  methods: {
    toggleNav () {
      this.navVisible = !this.navVisible
    }
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

nav {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 30px;
  background-color: #a7afc6;
  border-radius: 10px;
}

nav a {
  font-weight: bold;
  color: #2c3e50;
  text-decoration: none;
  margin: 0 10px;
  transition: all 0.3s ease-in-out;
}

nav a:hover {
  color: #42b983;
}

nav a.router-link-exact-active {
  color: #42b983;
}
html,body{
  margin: 0;
  padding: 0;
}
</style>
