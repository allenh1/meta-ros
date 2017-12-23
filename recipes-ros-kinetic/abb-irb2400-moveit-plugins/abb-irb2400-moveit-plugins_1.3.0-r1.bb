# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native liblapack-dev moveit-core pluginlib roscpp tf-conversions"
SRC_URI = "https://github.com/ros-industrial-release/abb-release/archive/release/kinetic/abb_irb2400_moveit_plugins/1.3.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0b580c378bb1c716583161232417346d"
SRC_URI[sha256sum] = "e52a4bbe761932e7b0c4baf47184b690153aec1457693ad5eb6ee9cced11a70b"
S = "${WORKDIR}/abb-release-release-kinetic-abb_irb2400_moveit_plugins-1.3.0-1"

inherit catkin
