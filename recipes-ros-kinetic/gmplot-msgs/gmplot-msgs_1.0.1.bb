# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Message definitions for gmplot ROS wrapper"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime"
SRC_URI = "https://github.com/robustify/gmplot_ros-release/archive/release/kinetic/gmplot_msgs/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0fa1e1480d90dca173e7746075e2598e"
SRC_URI[sha256sum] = "a365d3bd44fc2c3e17451240a917973db2813dc8b355d629a7506bf8b39ee774"
S = "${WORKDIR}/gmplot_ros-release-release-kinetic-gmplot_msgs-1.0.1-0"

inherit catkin
