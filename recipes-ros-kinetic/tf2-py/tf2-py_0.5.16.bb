# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The tf2_py package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native rospy tf2"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/kinetic/tf2_py/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "aba227807123c8cdbd33a89a81e067ef"
SRC_URI[sha256sum] = "2ea8155e92359baa6cb6862060cc33780152458b51ab5517c609400c0ff501b9"
S = "${WORKDIR}/geometry2-release-release-kinetic-tf2_py-0.5.16-0"

inherit catkin
