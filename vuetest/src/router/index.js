import { createRouter, createWebHashHistory } from 'vue-router'

// // 导入nprogress
// import NProgress from 'nprogress'
// // 导入nprogress的css
// import 'nprogress/nprogress.css'
import login from '../views/HomeView.vue'
import bankend from '../views/BackFrom.vue'

const routes = [
  {
    path: '/',
    name: 'login',
    component: login
  },
  {
    path: '/backend',
    name: 'backend',
    component: bankend,
    children: [
      {
        path: '/backUl',
        name: 'backUl',
        component: () => import('../components/ComondMain.vue')
      },
      {
        path: '/demo01',
        name: 'demo01',
        component: () => import('../test/Demo01Test.vue')
      }
    ]
  },
  {
    path: '/goods',
    name: 'goods',
    component: () => import('@/views/GoodsView.vue')
  },
  {
    path: '/container',
    name: 'container',
    component: () => import('../components/FromBack.vue')
  },
  {
    path: '/about',
    name: 'about',
    component: () => import('@/components/RegisterLock.vue')
  }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})
//
// // 定义路由导航前置守卫
// router.beforeEach((to, from, next) => {
//   // 开启进度条
//   NProgress.start()
// })
// // 定义路由导后置守卫
// router.afterEach((to, from) => {
//   // 关闭进度条
//   NProgress.done()
// })

export default router
