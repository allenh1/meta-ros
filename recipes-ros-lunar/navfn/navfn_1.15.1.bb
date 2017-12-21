# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "navfn provides a fast interpolated navigation function that can be used to creat"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "catkin-native cmake-modules costmap-2d geometry-msgs libpcl-all-dev message-generation message-runtime nav-core nav-msgs netpbm pcl-conversions pcl-ros pluginlib rosconsole roscpp tf visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/${PN}/1.15.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9f1f1b76f853caead55020ded309f4e0"
SRC_URI[sha256sum] = "44e2c4c0a6d27b2bfb31d3864baadea6dbfd932372458bcc59f6856b2d74b06d"
S = "${WORKDIR}/navigation-release-release-lunar-${PN}-1.15.1-0"

inherit catkin
