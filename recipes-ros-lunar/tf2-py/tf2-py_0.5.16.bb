# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The tf2_py package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin rospy tf2"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/lunar/tf2_py/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4c097cc5c23adc3bdaa6a102d059c78c"
SRC_URI[sha256sum] = "2343da2f82ac93cc45fe917578d132d288c97ecf7e9c6902938de9acef26cba1"
S = "${WORKDIR}/geometry2-release-release-lunar-tf2_py-0.5.16-0"

inherit catkin
