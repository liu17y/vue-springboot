import request from '@/api/request.js'
// 发送网络请求
export const login = (data) => {
  return request({
    url: '/login',
    method: 'POST',
    data
  })
}

// /**
//  * @description: 用户登录
//  */
// export function login (data) {
//   return request({
//     module: 'post',
//     url: '/api/userlogin',
//     data
//   })
// }
