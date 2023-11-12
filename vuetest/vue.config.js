const AutoDllPlugin = require('unplugin-auto-import/webpack')
const Components = require('unplugin-vue-components/webpack')
const { ElementPlusResolver } = require('unplugin-vue-components/resolvers')

// 第一个
module.exports = {
  configureWebpack: config => {
    // eslint-disable-next-line no-unused-expressions
    config.plugins.push(AutoDllPlugin({
      resolvers: [ElementPlusResolver()]
    }))
    config.plugins.push(Components({
      resolvers: [ElementPlusResolver()]
    }))
  }
}

const path = require('path')
const webpack = require('webpack')

function resolve (dir) {
  return path.join(__dirname, dir)
}
//
// module.exports = {
//   configureWebpack: config => {
//   // Webpack 配置
//   },
//   chainWebpack: config => {
//   // Webpack 配置
//   },
//   devServer: {
//     https: false,
//     hot: false,
//     proxy: {
//       '/api': {
//         target: 'http://127.0.0.1:5000',
//         changeOrigin: true,
//         ws: true,
//         pathRewrite: {
//           '^/api': ''
//         }
//       }
//     }
//   }
// }
module.exports = {
  devServer: {
    proxy: {
      '/': {
        target: 'http://127.0.0.1:5000', // 将请求代理到后端服务器的地址
        changeOrigin: true
        // pathRewrite: {
        //   '^/api': '' // 如果后端接口的路径有/api前缀，可以通过pathRewrite将其去掉
        // }
      }
    }
  }
}
