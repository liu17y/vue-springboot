import axios from 'axios'
// 创建实例
const service = axios.create({
  baseURL: 'https://www.fastmock.site/mock/bf1fcb3c2e2945669c2c8d0ecb8009b8/api',
  timeout: 5000,
  headers: {
        "Content-Type":"application/json;charset=utf-8"
    }
})

// 请求拦截器
service.interceptors.request.use(
    (config) => {
      if(localStorage.getItem('token')){
        config.headers.token=localStorage.getItem('token')
      }
    },
    (error) => Promise.reject(error)
  )
  // 响应拦截器
  service.interceptors.response.use(
    (response) => {
      console.log('reponse:', response)
      return response
    },
    (error) => Promise.reject(error)
  )
  export default service
  
