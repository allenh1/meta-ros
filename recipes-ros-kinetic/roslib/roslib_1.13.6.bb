# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Base dependencies and support libraries for ROS.     roslib contains many of the"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native python-rospkg rospack"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/kinetic/${PN}/1.13.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "182d9eddc4fd0daccab5bccb4b5ff4f2"
SRC_URI[sha256sum] = "fe1fc917253ad67d7454022ca7b5ed556670212c6bcbbdfdb56720b25ba69ed4"
S = "${WORKDIR}/ros-release-release-kinetic-${PN}-1.13.6-0"

inherit catkin
