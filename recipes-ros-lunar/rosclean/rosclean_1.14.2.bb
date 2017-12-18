# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosclean: cleanup filesystem resources (e.g. log files)."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin python-rospkg"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/lunar/${PN}/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "78bbb02ebc372031898d2f4b1ce49113"
SRC_URI[sha256sum] = "40eb231adaabfa7a420ce0f10312992e70cb36e5611934f71560b9c040bec4ab"
S = "${WORKDIR}/ros-release-release-lunar-${PN}-1.14.2-0"

inherit catkin
