import axios from 'axios'
// import { diffTokenTime } from '@/utils/auth'
const service = axios.create({
  // baseURL: process.env.VUE_APP_BASE_API,
  baseURL: 'http://127.0.0.1:5000',
  timeout: 5000
})
export default service

// service.interceptors.request.use(
//   config => {
//     if (localStorage.getItem('token')) {
//      if(diffTokenTime()) {
//        return Promise.reject(new Error('token失效'))
//      }
//     }
//     config.headers.Authorization = localStorage.getItem('token')
//     return config
//   },
//   error => {
//    return Promise.reject(new Error(error))
//   }
// })
