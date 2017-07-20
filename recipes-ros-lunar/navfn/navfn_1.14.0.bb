# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "navfn provides a fast interpolated navigation function that can be used to creat"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=acbed67fd486c51e7a0624505f2e6733"

DEPENDS = "catkin cmake-modules costmap-2d geometry-msgs nav-core nav-msgs netpbm pcl-conversions pcl-ros pluginlib rosconsole roscpp tf visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/navfn/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ce29c015381c6ce8cb23f4e4963717fa"
SRC_URI[sha256sum] = "37234d029dbdba4189fda377921dd26eacea386ba08939331ce2036d510fdfb0"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
